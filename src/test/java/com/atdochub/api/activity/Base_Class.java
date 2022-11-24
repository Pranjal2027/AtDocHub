package com.atdochub.api.activity;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.junit.BeforeClass;
import io.restassured.response.ValidatableResponse;

public class Base_Class {
	
		public static final String CONTEXTPATH="http://3.108.194.111:8080/AtdochubJ-3/";
		//public static final String CONTEXTPATH="http://13.233.206.251:8088/AtdochubJ-3/";
		//public static final String CONTEXTPATH="https://dev.xuriti.app/adminpanel/api/";

		@BeforeClass
			public void setup()
			{

			}
		 	
		   public void performLogin() {
			//   if(!TokenProvider.getInstance().hasToken()) {
				   JSONObject request=new JSONObject();
				   
				   request.put("email","vaishnavi.atdochub@gmail.com");
				   request.put("password", "1111");
					   
		    	     ValidatableResponse response = given().
						   contentType("application/json").
					      body(request.toJSONString()).
					   when().
					      post(CONTEXTPATH + "auth/user-login").
					      //then().log().all().`
					      then();
				     	response.statusCode(201);
				     	 
					   //String token = accessToken(response.extract().response());
					  // TokenProvider.getInstance().setToken(token);
					   
				   }
}
