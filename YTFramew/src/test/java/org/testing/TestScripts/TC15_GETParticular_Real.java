package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.responseValidation.ValidateResponse;
import org.testing.teststeps.HttpMethods;
import org.testing.utilities.PropertiesHandle;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC15_GETParticular_Real {
	
	@Test
	public void getParticularReal() throws IOException
	{
		Properties pr=PropertiesHandle.LoadProperties("../YTFramew/URI.propertise");
		HttpMethods http=new HttpMethods(pr);
		Response res=http.getParticularMethods("GET_PARTICULAR_REALURI", "2");
		Boolean result=ValidateResponse.validateStatusCode(res, 404);
		Assert.assertTrue(result);
		System.out.println("tc15_getparticular_real finished");
	}

}
