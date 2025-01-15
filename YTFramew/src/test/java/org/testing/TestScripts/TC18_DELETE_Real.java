package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.responseValidation.ValidateResponse;
import org.testing.teststeps.HttpMethods;
import org.testing.utilities.PropertiesHandle;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC18_DELETE_Real {

	
	@Test
	public void deleteReal() throws IOException
	{
		Properties pr=PropertiesHandle.LoadProperties("../YTFramew/URI.propertise");
		HttpMethods http=new HttpMethods(pr);
		Response res=http.deleteMethods("DELETE_REALURI", "DEEPK");
		Boolean result=ValidateResponse.validateStatusCode(res, 204);
		Assert.assertTrue(result);
		System.out.println("tc18_delete_real finished");
	}
}
