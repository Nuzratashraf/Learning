package org.testing.teststeps;

import static io.restassured.RestAssured.given;

import java.util.Properties;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class HttpMethods {
	
Properties pr;
	
	public  HttpMethods(Properties pr)
	{
		this.pr=pr;
	}
	
	
	public Response postMethod(String reqBody,String uriKeyName)
	{
		String uriValue=pr.getProperty(uriKeyName);
		
		Response res=
		given()
		.contentType(ContentType.JSON)
		.body(reqBody)
		.when()
		.post(uriValue);
		
		System.out.println("Status code is "+ res.statusCode());
		return res;
		
	}
	public Response putMethod(String reqBody,String uriKeyName,String endpoint)
	{
		String uriValue=pr.getProperty(uriKeyName)+"/"+ endpoint;
		
		Response res=
		given()
		.contentType(ContentType.JSON)
		.body(reqBody)
		.when()
		.put(uriValue);
		
		System.out.println("Status code is "+ res.statusCode());
		return res;
		
	}
	public Response getAllmethods(String uriKeyName)
	{
		String uriValue=pr.getProperty(uriKeyName);
		
		Response res=
		given()
		.contentType(ContentType.JSON)
		
		.when()
		.get(uriValue);
		
		System.out.println("Status code is "+ res.statusCode());
		System.out.println("Response data is " +res.asString());
		return res;
		
	}
	public Response getParticularMethods(String uriKeyName,String endPoint)
	{
		String uriValue=pr.getProperty(uriKeyName)+"/"+ endPoint;
		
		Response res=
		given()
		.contentType(ContentType.JSON)
		
		.when()
		.get(uriValue);
		
		System.out.println("Status code is "+ res.statusCode());
		System.out.println("Response data is " +res.asString());
		return res;
		
	}
	public Response deleteMethods(String uriKeyName,String endPoint)
	{
		String uriValue=pr.getProperty(uriKeyName)+"/"+ endPoint;
		
		Response res=
		given()
		.contentType(ContentType.JSON)
		
		.when()
		.delete(uriValue);
		
		System.out.println("Status code is "+ res.statusCode());
		return res;
		
		
	}
	

}
