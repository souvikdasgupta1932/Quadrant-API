import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class Test_Get_List_User {
	
	@Test
	void test_get_list_user() {
		
		Response response = get("https://reqres.in/api/users?page=2");
		
		System.out.println(response.asString());
		System.out.println(response.getBody());
		System.out.println(response.getStatusCode());
		System.out.println(response.getContentType());
		
		int statuscode = response.getStatusCode();
		Assert.assertEquals(statuscode, 200);
		
	}
	
	

}
