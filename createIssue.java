package jirachaining;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class createIssue extends baseClass{
	
	@Test
	public void create() {
		
		// Body 
		
		 Input = RestAssured.given().contentType("application/json").accept("application/json").when().body("{\n"
				+ "    \"fields\": {\n"
				+ "        \"project\": {\n"
				+ "            \"key\": \"API\"\n"
				+ "        },\n"
				+ "        \"summary\": \"create issue in RA project\",\n"
				+ "        \"description\": \"Creating of an issue using project keys and issue type names using the REST API\",\n"
				+ "        \"issuetype\": {\n"
				+ "            \"name\": \"Task\"\n"
				+ "        }\n"
				+ "    }\n"
				+ "}");
		
		
		 response = Input.post();
		 
		 response.prettyPrint();
		 
		 response.then().assertThat().statusCode(Matchers.equalTo(201));
		 Issue_ID = response.jsonPath().get("id");
		 
		 System.out.println("issue / Ticket ID is ===== " + Issue_ID);
		 
		
	}
	
	

}
