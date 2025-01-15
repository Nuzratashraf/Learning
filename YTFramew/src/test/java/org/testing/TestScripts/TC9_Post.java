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
import io.restassured.response.ValidatableResponse;

public class TC9_Post {
	@Test
public void post() throws IOException {
		
		Properties pr=PropertiesHandle.LoadProperties("../YTFramew/URI.propertise");
		String reqBody=JsonHandle.loadJsonFile("../YTFramew/src/test/java/org/testing/resources/Request.json");
		HttpMethods http=new HttpMethods(pr);
		Response res=http.postMethod(reqBody, "QA_URI");
		Boolean result=ValidateResponse.validateStatusCode(res, 201);
		Assert.assertTrue(result);
		System.out.println("tc9_post finished");
	}

}
