package RestAssuredpractice;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class Postrequestregisteration {
	
	@Test
	
	void getstockDetails()
	{
		// Specify base URL 
		RestAssured.baseURI = "https://markets.businessinsider.com/stocks/";
		
		//Request object 
		RequestSpecification httpRequest = RestAssured.given();
		
		// Response object
		Response response = httpRequest.request(Method.GET,"/amc-stock");
		
		// Print response in console window
		
		String responsebody = response.getBody().asString();
		
		System.out.println("Response Body is:" +responsebody);
		
		//status code verifcation
		int Statuscode = response.getStatusCode();
		Assert.assertEquals(200, Statuscode);
		
		/*
		String Statusline = response.getStatusLine();
		System.out.println(Statusline);
		
		
		Assert.assertEquals(Statusline, "HTTP/1.1 200 OK");
		// Sachin
		
		*/
		// Changes made of for testing
	}

}
