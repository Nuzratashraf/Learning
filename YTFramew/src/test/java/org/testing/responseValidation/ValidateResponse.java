package org.testing.responseValidation;

import org.asynchttpclient.util.Assertions;

import io.restassured.response.Response;
import or.testing.assertions.Assertion1;

public class ValidateResponse {
	
	public static Boolean validateStatusCode(Response res,int expectedStatusCode )
	{
		int actualStatusCode=res.getStatusCode();
		Boolean result=Assertion1.assert1(actualStatusCode,expectedStatusCode);
		return result;
	}
	
	public static void validateData()
	{
		
		
	}

}
