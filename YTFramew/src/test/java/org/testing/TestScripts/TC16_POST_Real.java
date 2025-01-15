package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.responseValidation.ValidateResponse;
import org.testing.teststeps.HttpMethods;
import org.testing.utilities.JsonHandle;
import org.testing.utilities.PropertiesHandle;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC16_POST_Real {
	
	@Test
	public void postReal() throws IOException
	{
		Properties pr=PropertiesHandle.LoadProperties("../YTFramew/URI.propertise");
		String reqBody=JsonHandle.loadJsonFile("../YTFramew/src/test/java/org/testing/resources/requestReal.json");
		HttpMethods http=new HttpMethods(pr);
		Response res=http.postMethod(reqBody, "POST_REALURI");
		Boolean result=ValidateResponse.validateStatusCode(res, 201);
		Assert.assertTrue(result);
		System.out.println("tc16_post_real finished");
	}

}
