package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.responseValidation.ValidateResponse;
import org.testing.teststeps.HttpMethods;
import org.testing.utilities.PropertiesHandle;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC14_GETAll_Real {
	@Test
	public void getAllReal() throws IOException
	{
		Properties pr=PropertiesHandle.LoadProperties("../YTFramew/URI.propertise");
		HttpMethods http=new HttpMethods(pr);
		Response res=http.getAllmethods("GET_ALL_REALURI");
		Boolean result=ValidateResponse.validateStatusCode(res, 200);
		Assert.assertTrue(result);
		System.out.println("tc14_getall_real finished");
	}

}
