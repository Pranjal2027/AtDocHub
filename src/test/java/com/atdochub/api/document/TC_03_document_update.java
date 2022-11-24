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

public class TC_03_document_update extends Base_Class {
	 @BeforeClass
		public void setup()
		{
			//super.performLogin();
		}
		
	    @Test
	    
		public  void Update_document()
		{
			JSONObject request=new JSONObject();
			request.put("docId","688");
			request.put("updatedBy","Reshama");
			   request.put("tokenNo","22019999876600");
			   request.put("docTitle","Vardayini Complex");
			   request.put("address","Bavdhan");
			   request.put("city","Pune");
			   request.put("partyName","Mrs.David ");
			   request.put("pinCode","411056");
			   request.put("docType","Commercial");
			   request.put("duration","24");
			   request.put("startDate","2022-11-17");
			   request.put("endDate","2024-11-16");
			   request.put("docStatus","Subbmitted");
			   request.put("rentDesc","60000");
			   request.put("createdBy","swati");
			given().
			   contentType("application/json").
			   body(request.toJSONString()).
			    //  header("authorization"," Bearer " + token).
			   when().
			      put("http://3.108.194.111:8080/AtdochubJ-3/document/update").
		       then().
			   log().all().
			   statusCode(201);
			//response.statusCode();
		}

}//http://3.108.194.111:8080/AtdochubJ-3/document/update

