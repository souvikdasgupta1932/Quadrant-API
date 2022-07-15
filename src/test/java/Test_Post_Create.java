import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Test_Post_Create {
	
	
	public void post_create() {
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("name", "morpheus");
		map.put("job", "leader");
		JSONObject request = new JSONObject(map);
		
	Response response = given().
			body(request.toJSONString()).
		when()
			.post("https://reqres.in/api/users").
		then()
			.statusCode(201).extract().response();
		System.out.println(response.getBody().asString());
	
	}

}
