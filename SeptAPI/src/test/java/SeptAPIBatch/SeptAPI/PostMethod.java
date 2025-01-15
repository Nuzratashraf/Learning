package SeptAPIBatch.SeptAPI;

import static io.restassured.RestAssured.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Array;
import java.util.Scanner;

import org.checkerframework.checker.regex.qual.Regex;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;
//import java.util.pattern;


import com.google.common.annotations.J2ktIncompatible;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import jxl.format.Pattern;
import java.util.regex.*;

public class PostMethod {
	
//USING JSON FILE CONCEPT	
	
	public static void main(String[] args) throws FileNotFoundException {
		File f=new File("../SeptAPI/requestBody.json");
		FileReader fr=new FileReader(f);
		JSONTokener js=new JSONTokener(fr);
		JSONObject j=new JSONObject(js);
		
		String requestBody=j.toString();
		System.out.println("Please enter the id value");
		Scanner sc=new Scanner(System.in);
		Integer id=sc.nextInt();
		requestBody=requestBody.replaceAll(java.util.regex.Pattern.quote("{{id}}"), id.toString());
		System.out.println("Please enter the firstname");
		
		String firstname=sc.next();
		requestBody=requestBody.replaceAll(java.util.regex.Pattern.quote("{{firstname}}"), firstname);
		System.out.println("Please enter the lastname");
		String lastname=sc.next();
		requestBody=requestBody.replaceAll(java.util.regex.Pattern.quote("{{lastname}}"), lastname);
		
		System.out.println(requestBody);
	//complex json  example	
		
	/*	JSONObject inner1=new JSONObject();
		inner1.put("House No", "7876");
		inner1.put("sector", "87");
		inner1.put("Landmark", "Sector 23 market");
		inner1.put("Type", "Primary Address");
		
		JSONObject inner2=new JSONObject();
		inner2.put("House No", "7876");
		inner2.put("sector", "87");
		inner2.put("Landmark", "Sector 23 market");
		inner2.put("Type", "secondary address");
		
//USING ARRAY EXAMPLE		
		JSONArray array=new JSONArray();
		array.put(0,inner1);
		array.put(1,inner2);
		
		JSONObject js=new JSONObject();
		js.put("firstname", "Nusrath");
		js.put("lastname", "ashraf");
		js.put("id", "DCDC");
		js.put("designation", "TL");
		js.put(" Address",array);
		
		
	System.out.println(js);
	*/
	
		
		
		Response res=
	given()
	.contentType(ContentType.JSON)
	.body(requestBody)
	.when()
	.post("http://localhost:3000/APIbatchfolks");
	

	System.out.println("Response code is ");
	System.out.println(res.statusCode());
	System.out.println("Response data is ");
	System.out.println(res.asString());
		
		
	}

}
