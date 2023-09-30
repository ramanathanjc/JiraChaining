package jirachaining;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class updateIssue extends baseClass {
	
	@Test  (dependsOnMethods = "jirachaining.createIssue.create")
	public void update() {
		
		  Input = RestAssured.given().accept("application/json").contentType("application/json").body("{\n"
				+ "    \"fields\": {\n"
				+ "        \"description\": \"Task creation Using RESTAssured API for testing\"\n"
				+ "    }\n"
				+ "}");
		  
		  response = Input.put("/"+Issue_ID);
		  
		  
		  response.prettyPrint();
		  
		  //System.out.println("update Response code is =====" + response.statusCode());
		  
		  response.then().assertThat().statusCode(Matchers.equalTo(204));
		
	}

}
