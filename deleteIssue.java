package jirachaining;

import org.testng.annotations.Test;

import io.restassured.RestAssured;


public class deleteIssue extends baseClass{
	
	@Test (dependsOnMethods = "jirachaining.updateIssue.update")
	public void delete() {
		
		
		 Input = RestAssured.given();
		 
		 response = Input.delete("/"+Issue_ID);
		 
		 response.prettyPrint();
		 
		System.out.println("Deleted Issue ID is === :" +Issue_ID);
		
		//int statusCode = response.statusCode();
		
		//System.out.println("Deleted response code  is === :" +statusCode);
		
		
		response.then().assertThat().statusCode(204);
		
	}

}
