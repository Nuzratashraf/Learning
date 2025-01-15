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

public class TC12_Update {
	@Test
	
		
		public void update() throws IOException {
			
			Properties pr=PropertiesHandle.LoadProperties("../YTFramew/URI.propertise");
			String reqBody=JsonHandle.loadJsonFile("../YTFramew/src/test/java/org/testing/resources/updateRequest.json");
			HttpMethods http=new HttpMethods(pr);
			Response res=http.putMethod(reqBody, "QA_URI","DEEPK");
			Boolean result=ValidateResponse.validateStatusCode(res, 200);
			Assert.assertTrue(result);
			System.out.println("tc112_update finished");
		}
		
	

}
