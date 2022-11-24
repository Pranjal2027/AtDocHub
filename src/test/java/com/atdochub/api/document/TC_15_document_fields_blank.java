package com.atdochub.api.document;

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

public class TC_15_document_fields_blank extends Base_Class {
	 @BeforeClass
		public void setup()
		{
			//super.performLogin();
		}
		
	    @Test
	    
		public  void test_1()
		{
			JSONObject request=new JSONObject();
			
			request.put("docId","420");
			   request.put("tokenNo","22110109991236");
			   request.put("docTitle","Vardayini Complex");
			   request.put("address","Bavdhan");
			   request.put("city","Pune");
			   request.put("partyName"," ");
			   request.put("pinCode","411056");
			   request.put("docType","Residential");
			   request.put("duration","24");
			   request.put("startDate","2022-11-17");
			   request.put("endDate","2024-11-16");
			   request.put("docStatus","Open");
			   request.put("rentDesc","60000");
			   given().
			   contentType("application/json").
			   body(request.toJSONString()).
			    //  header("authorization"," Bearer " + token).
			   when().
			      post(CONTEXTPATH + "document/register").
			      
		       then().log().all().
			   statusCode(500);
			//response.statusCode();
		}

}
