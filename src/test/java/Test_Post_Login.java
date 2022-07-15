import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Test_Post_Login {
	
	@Test
	public void post_login() {
		
		JSONObject request = new JSONObject();
		request.put("email", "michael.lawson@reqres.in");
		request.put("password", "cityslicka");
		System.out.println(request.toString());
		
	Response response = given().
			header("Content-Type","application/json").
			body(request.toJSONString()).
		when()
			.post("https://reqres.in/api/login").
		then()
			.statusCode(200).extract().response();
		System.out.println(response.getBody().asString());
	}

}
