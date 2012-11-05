package controllers;

import java.util.List;

import model.User;
import model.UserTimeLine;

import org.scribe.model.OAuthRequest;
import org.scribe.model.Response;
import org.scribe.model.Token;
import org.scribe.model.Verb;
import org.scribe.model.Verifier;
import org.scribe.oauth.OAuthService;

import play.Logger;
import play.cache.Cache;
import play.mvc.Controller;
import play.mvc.Result;
import services.OAuth;
import services.mapTimeline;
import services.mapUser;
import views.html.twitterClient.pinPage;
import views.html.twitterClient.userPage;

/**
 * Controller to manage the twitter app requests
 * @author Yuri Borges
 *
 */
public class TwitterController extends Controller {

	private static final String PIN = "pin";
	private static final String STATUS = "status";
	private static final String SEARCH_QUERY = "searchQuery";
	private static OAuthService service = OAuth.getOAuthService();

	/**
	 * Start Is called when the button Authorize the application is pressed
	 * It get the OAuth service and call the twitter authorization URL.
	 * @return Twitter authorization URL
	 */
	public static Result start() {
	    String uuid=session("uuid");
        Token requestToken  = service.getRequestToken();
        Cache.set(uuid+"requestToken", requestToken);
        String autorizationUrl = service.getAuthorizationUrl(requestToken);
        return redirect(autorizationUrl);

	}

	/**
	 * Call back from Twitter page, render the page where the user can add the pin code
	 * @return pinPage.scala.html
	 */
	public static Result pinPage(){
		return ok(pinPage.render());
	}

	/**
	 * get the access token based on the verifier of the pin code.
	 * Load the user based on the returned credentials
	 * @return redirect to userPage.scala.html
	 */
	public static Result loadUserPage(){
	    String uuid=session("uuid");
	    Token accessToken = getCacheAccessToken(uuid);
        if(accessToken == null){
            Token requestToken =  (Token) Cache.get(uuid+"requestToken");
            String pin =  request().body().asFormUrlEncoded().get(PIN)[0];
            Verifier v = new Verifier(pin);
            accessToken = service.getAccessToken(requestToken, v);
            Cache.set(uuid+"accessToken", accessToken);
        }
	    return redirect("/twitterClient/userPage");
	}

	/**
	 * go to userPage
	 * @return userPage.scala.html
	 */
	public static Result userPage(){
	    String uuid=session("uuid");
	    Token accessToken = getCacheAccessToken(uuid);
	    if(accessToken == null){
	        return redirect("/twitterClient/start");
	    }
	    User user = getUser(accessToken);
	    Cache.set(uuid+"user", user);
		return ok(userPage.render(user,getTimeline(user.getToken())));
	}

	/**
	 * Method to Post a new status (tweet)
	 * @return userPage.scala.html
	 */
	public static Result postNewStatus(){
	    String uuid=session("uuid");
	    User user = (User) Cache.get(uuid+"user");
		String text = request().body().asFormUrlEncoded().get(STATUS)[0];
		OAuthRequest request = new OAuthRequest(Verb.POST, "https://api.twitter.com/1/statuses/update.json");
		request.addBodyParameter("status", text);
		service.signRequest(user.getToken(), request);
		Response response = request.send();
		Logger.info(response.getBody());

		return ok(userPage.render(user,getTimeline(user.getToken())));
	}

	/**
	 * Load the user
	 * @param accessToken
	 * @return model.User
	 */
	public static User getUser(Token accessToken){
		OAuthRequest request = new OAuthRequest(Verb.GET, "http://api.twitter.com/1/account/verify_credentials.json");
		service.signRequest(accessToken, request);
		Response response = request.send();

		return mapUser.getMapedUser(response, accessToken);
	}

	/**
	 * Load user Timeline
	 * @param accessToken
	 * @return model.UserTimeLine
	 */
	public static List<UserTimeLine> getTimeline(Token accessToken){
		OAuthRequest requestimeLine = new OAuthRequest(Verb.GET, "https://api.twitter.com/1.1/statuses/user_timeline.json");
		service.signRequest(accessToken, requestimeLine);
		Response response2 = requestimeLine.send();

		return  mapTimeline.getMapedUserTimeLine(response2,false);
	}

	/**
	 * Get the Access Token from the cache for the user
	 * @param uuid = id from user stored in the session
	 * @return accessToken
	 */
	public static Token getCacheAccessToken(String uuid){
        Token accessToken = (Token) Cache.get(uuid+"accessToken");
        if(uuid == null || accessToken == null){
            return null;
        }else{
            return accessToken;
        }
	}

	public static Result search(){
	    String uuid=session("uuid");
	    Token accessToken = getCacheAccessToken(uuid);
	    String text = request().body().asFormUrlEncoded().get(SEARCH_QUERY)[0];
	    User user = (User) Cache.get(uuid+"user");
	    return ok(userPage.render(user,getSearchTimeline(accessToken,text)));
	}

	public static List<UserTimeLine> getSearchTimeline(Token accessToken, String searchText ){
	    OAuthRequest requestimeLine = new OAuthRequest(Verb.GET, "https://api.twitter.com/1.1/search/tweets.json");
        requestimeLine.addQuerystringParameter("q", searchText);
	    service.signRequest(accessToken, requestimeLine);
        Response response2 = requestimeLine.send();
        return  mapTimeline.getMapedUserTimeLine(response2,true);
	}

	public static Result logout(){
	    session().clear();
	    return redirect("/twitterClient");
	}
}
