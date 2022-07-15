import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Test_Post_Register {
	
	@Test
	public void reg() {
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("email", "eve.holt@reqres.in");
		map.put("password", "pistol");
		JSONObject request = new JSONObject(map);
		System.out.println(request.toString());
	Response response = given().
			header("Content-Type","application/json").
			body(request.toJSONString()).
		when()
			.post("https://reqres.in/api/register").
		then()
			.statusCode(200).extract().response();
		System.out.println(response.getBody().asString());
	}

}
