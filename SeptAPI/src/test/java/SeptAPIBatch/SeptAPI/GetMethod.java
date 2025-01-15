package SeptAPIBatch.SeptAPI;

import static io.restassured.RestAssured.*;

import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
//package.class.method,* means all
public class GetMethod {
	
	
	public static void main(String[] args) {
		
		
		Response referenceResponse=
		given()
		.contentType(ContentType.JSON)
		.when()
		.get("http://localhost:3000/APIbatchfolks/");
		
		System.out.println("Status code is ");
		System.out.println(referenceResponse.statusCode());
		System.out.println("Response data is ");
		System.out.println(referenceResponse.asString());
		JSONArray js=new JSONArray(referenceResponse.asString());
		JSONObject j=js.
		
}
}
