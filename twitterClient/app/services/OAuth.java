package services;

import org.scribe.builder.ServiceBuilder;
import org.scribe.builder.api.TwitterApi;
import org.scribe.oauth.OAuthService;

import play.Configuration;
import play.Play;

public class OAuth {
	
	private static final String API_KEY = "apiKey";
	private static final String API_SECRET =  "apiSecret";
	private final static Configuration configuration  =  Play.application().configuration();
	
	public static OAuthService getOAuthService() {
		OAuthService service = new ServiceBuilder()
			.provider(TwitterApi.class)
			.apiKey(configuration.getString(API_KEY))
			.apiSecret(configuration.getString(API_SECRET))
			.build();
		return service;
	}
}
