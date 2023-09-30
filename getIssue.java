package jirachaining;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class getIssue extends baseClass{
	
	@Test (dependsOnMethods = "jirachaining.deleteIssue.delete")
	public void getissue() {
		
		Response response = RestAssured.get("/"+Issue_ID);
		response.prettyPrint();
		
		System.out.println("Get Issue ==============");
		
	}

}
