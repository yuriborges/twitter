package services;

import java.io.IOException;

import org.codehaus.jackson.*;
import org.codehaus.jackson.map.ObjectMapper;
import org.scribe.model.Response;
import org.scribe.model.Token;

import model.User;

public class mapUser {
	
	public static User getMapedUser(Response response,Token token){
		User user = new User();
		ObjectMapper mapper = new ObjectMapper();
		JsonFactory factory = mapper.getJsonFactory();
		JsonParser jp;
		try {
			jp = factory.createJsonParser(response.getBody());
			JsonNode credentials = mapper.readTree(jp);
			user.setId(credentials.get("id").asInt());
			user.setName(credentials.get("name").asText());
			user.setScreenName(credentials.get("screen_name").asText());
			user.setImageUrl(credentials.get("profile_image_url").asText());
			user.setToken(token);
			
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return user;
	}
}
