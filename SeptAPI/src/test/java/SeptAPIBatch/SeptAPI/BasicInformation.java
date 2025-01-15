package SeptAPIBatch.SeptAPI;

import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class BasicInformation {

	
//POJO EXAMPLE	
	
	private String firstname;
	private String lastname;
	private String id;
	private String designation;
	
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public static void main(String[] args) {
		BasicInformation basic=new BasicInformation();
		basic.setFirstname("sunny");
		basic.setLastname("deol");
		basic.setDesignation("TL");
		
		basic.setId("sunny");
		
		
		Response res=
	given()
	.contentType(ContentType.JSON)
	.body(basic)
	.when()
	.post("http://localhost:3000/APIbatchfolks");
	

	System.out.println("Response code is ");
	System.out.println(res.statusCode());
	System.out.println("Response data is ");
	System.out.println(res.asString());
		
		

	}

}
