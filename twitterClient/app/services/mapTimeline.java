package services;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import model.User;
import model.UserTimeLine;

import org.codehaus.jackson.JsonFactory;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.ObjectMapper;
import org.scribe.model.Response;

/**
 *
 * @author YuriBorges
 *
 */
public class mapTimeline {
	public static List<UserTimeLine> getMapedUserTimeLine(Response response, boolean isSearch){
		List<UserTimeLine> listTimeLines = new ArrayList<UserTimeLine>();

		ObjectMapper mapper = new ObjectMapper();
		JsonFactory factory = mapper.getJsonFactory();
		JsonParser jp;
		try {
			jp = factory.createJsonParser(response.getBody());
			JsonNode timelineObjects = mapper.readTree(jp);
			Iterator<JsonNode> iteratorTimeLineObjects = timelineObjects.getElements();

			if(isSearch){
			    JsonNode timeLine = iteratorTimeLineObjects.next();
			    Iterator<JsonNode> iteratorSearch = timeLine.getElements();
			    while (iteratorSearch.hasNext()){
			        JsonNode searchTimeline = iteratorSearch.next();
			        UserTimeLine userTimeLine = new UserTimeLine();
	                userTimeLine.setDate(searchTimeline.get("created_at").asText());
                    userTimeLine.setId(searchTimeline.get("id").asInt());
                    userTimeLine.setText(searchTimeline.get("text").asText());
                    userTimeLine.setSource(searchTimeline.get("source").asText());

                    User user = new User();
                    user.setId(searchTimeline.get("user").get("id").asInt());
                    user.setName(searchTimeline.get("user").get("name").asText());
                    user.setScreenName(searchTimeline.get("user").get("screen_name").asText());
                    user.setImageUrl(searchTimeline.get("user").get("profile_image_url").asText());

                    userTimeLine.setUser(user);
                    listTimeLines.add(userTimeLine);
			    }
			}else{
			    while(iteratorTimeLineObjects.hasNext()){
			        JsonNode timeLine = iteratorTimeLineObjects.next();
			        UserTimeLine userTimeLine = new UserTimeLine();
			        userTimeLine.setDate(timeLine.get("created_at").asText());
	                userTimeLine.setId(timeLine.get("id").asInt());
	                userTimeLine.setText(timeLine.get("text").asText());
	                userTimeLine.setSource(timeLine.get("source").asText());

	                User user = new User();
	                user.setId(timeLine.get("user").get("id").asInt());
	                user.setName(timeLine.get("user").get("name").asText());
	                user.setScreenName(timeLine.get("user").get("screen_name").asText());
	                user.setImageUrl(timeLine.get("user").get("profile_image_url").asText());

	                userTimeLine.setUser(user);
	                listTimeLines.add(userTimeLine);
			    }
			}
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return listTimeLines;
	}
}
