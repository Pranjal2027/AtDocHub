package com.atdochub.api.appointment;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.atdochub.api.activity.Base_Class;

public class TC_08_appointment_tommorrows extends Base_Class {
	 @BeforeClass
		public void setup()
		{
		//	super.performLogin();
		}
		
	    @Test
	    
		public  void Tommorrows_appointments()
		{
			JSONObject request=new JSONObject();
			given().
			   contentType("application/json").
			   body(request.toJSONString()).
			    //  header("authorization"," Bearer " + token).
			   when().
			      get(CONTEXTPATH + "appointment/tommorows").
		       then().
			   log().all().
			   statusCode(200);
			//response.statusCode();
		}

}