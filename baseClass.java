package jirachaining;

import org.testng.annotations.BeforeMethod;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class baseClass {

	
	public static String ticketid;
	public static  Response response; 
	public  RequestSpecification Input;
	public static String Issue_ID;
	
	
	@BeforeMethod
	public void setup() {
		
		// End point 
		
		RestAssured.baseURI="https://ramjiratesting.atlassian.net/rest/api/2/issue/";
		
		// Authentication 
		
		RestAssured.authentication=RestAssured.preemptive().basic("ramanathan.1106@gmail.com", 
	"ATATT3xFfGF0LgUx3-gi5-nFLviwjbmyh2XVf7JHhyXsO4_EOlhOrkaj-EMNgMl4KCIYsE8nQVe2aa62ello2Ks-eIWezkKmRVYGncksB7CjU6ckY59pKe6oczXYi-J9ma09orsL0R0X5rqT0Lp5vMsP8VLtmfh8LueRQOs59G0K4Syo5vGSsww=F00D226B");
		
	
	}
	
	
}
