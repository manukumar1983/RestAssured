package org.restassuredpoc.base;

//import static org.junit.jupiter.api.Assertions.assertEquals;

import org.restassuredpoc.org.restapiautomation.Authenticator;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BookingDetailTest extends APIBase {
	public static RequestSpecification request; 
	public static Response response;
	public static String authRequestJSON;
	@BeforeMethod
	public void requestPropertySetter() {
		RestAssured.baseURI = properties.getProperty("AUTH_URL");
		authRequestJSON = Authenticator.authRequestGeneraor(properties.getProperty("USERNAME"), properties.getProperty("PASSWORD"));	
		
	
	}
	
	@Test
	public void tsetAuth() {
		request = RestAssured.given();
		request.body(authRequestJSON);
		response = request.post();
		
		
	}

}
