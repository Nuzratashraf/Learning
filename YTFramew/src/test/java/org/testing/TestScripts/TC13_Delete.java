package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.responseValidation.ValidateResponse;
import org.testing.teststeps.HttpMethods;
import org.testing.utilities.PropertiesHandle;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC13_Delete {
	@Test
	public void getParticular() throws IOException
	{
		Properties pr=PropertiesHandle.LoadProperties("../YTFramew/URI.propertise");
		HttpMethods http=new HttpMethods(pr);
		Response res=http.deleteMethods("QA_URI", "DEEPK");
		Boolean result=ValidateResponse.validateStatusCode(res, 200);
		Assert.assertTrue(result);
		System.out.println("tc13_delete finished");
		
	}

}
