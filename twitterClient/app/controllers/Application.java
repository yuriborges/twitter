package controllers;

import org.scribe.model.Token;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;

/**
 * Application class is the first controller when /twitterClient is called
 * @author Yuri Borges
 *
 */
public class Application extends Controller {

	/**
	 * Begging of application, the view.index.scala.html is called.
	 * @return
	 */
	public static Result index() {
	    //Creating a session ID for the user
        String uuid=session("uuid");
        if(uuid==null) {
            uuid=java.util.UUID.randomUUID().toString();
            session("uuid", uuid);
        }

        Token accessToken =  TwitterController.getCacheAccessToken(uuid);
        if(accessToken == null){
            return ok(index.render());
        }else{
            return redirect("/twitterClient/userPage");
        }
	}
}