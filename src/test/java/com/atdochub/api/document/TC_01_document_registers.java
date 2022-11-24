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

public class TC_01_document_registers extends Base_Class {
	 @BeforeClass
		public void setup()
		{
			//super.performLogin();
		}
		
	    @Test
	    
		public  void Document_registers()
		{
			JSONObject request=new JSONObject();
			
			request.put("updatedBy","Reshama");
			   request.put("tokenNo","22019999879874");
			   request.put("docTitle","Veer Complex");
			   request.put("address","Bavdhan");
			   request.put("city","Pune");
			   request.put("partyName","Mr.David Khan");
			   request.put("pinCode","411056");
			   request.put("docType","Residential");
			   request.put("duration","24");
			   request.put("startDate","2022-11-24");
			   request.put("endDate","2024-11-23");
			   request.put("docStatus","Open");
			   request.put("rentDesc","65000");
			   request.put("createdBy","swati");
			   given().
			   contentType("application/json").
			   body(request.toJSONString()).
			    //  header("authorization"," Bearer " + token).
			   when().
			      post(CONTEXTPATH + "document/register").
			      
		       then().log().all().
			   statusCode(201);
			//response.statusCode();
		}
}
