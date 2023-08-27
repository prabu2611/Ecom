package com;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Api_Method {
	
	
	//Java
	//Rest Assured
	//Framework
	//Maven
	
	
	//Get
	
	//Post
	
	//Put
	
	//Delete
	
	
	
	
	
	
	
	
	
	public void getDetails() {
		//BaseURI
		
		
		RestAssured.baseURI="https://reqres.in/";
		
		RequestSpecification requestSpecification = RestAssured.given();
		
		Response response = requestSpecification.request(Method.GET,"api/users?page=2");
		
		System.out.println(response.asPrettyString());
		
		System.out.println("Status Code: "+response.statusCode());
	}
	
	
	@Test
	public void postDetails() {
		//BaseURI
		
		
		RestAssured.baseURI="https://reqres.in/";
		
		RequestSpecification requestSpecification = RestAssured.given().body("{\r\n"
				+ "    \"name\": \"mocjshli\",\r\n"
				+ "    \"job\": \"leader\"\r\n"
				+ "}");
		
		Response response = requestSpecification.request(Method.POST,"api/users");
		
		System.out.println(response.asPrettyString());
		
		System.out.println("Status Code: "+response.statusCode());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
