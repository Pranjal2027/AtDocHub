package com.atdochub.api.activity;

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

public class TC_02_activity_update extends Base_Class {
	 @BeforeClass
		public void setup()
		{
			//super.performLogin();
		}
		
	    @Test
	    
		public  void Update_activity()
		{
			JSONObject request=new JSONObject();
			request.put("activityId","102");
			   request.put("docId","109");
			   request.put("status","1");

			given().
			   contentType("application/json").
			   body(request.toJSONString()).
			    //  header("authorization"," Bearer " + token).
			   when().
			      put(CONTEXTPATH + "activity/update").
		       then().
			   log().all().
			   statusCode(201);
			//response.statusCode();
		}

}

