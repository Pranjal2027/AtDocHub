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
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.atdochub.api.activity.Base_Class;

public class TC_17_document_no_doc_id extends Base_Class {
	 @BeforeClass
		public void setup()
		{
			//super.performLogin();
		}
		
	    @Test
	    
		public  void Find_document_by_no_id_exist()
		{
			JSONObject request=new JSONObject();
			given().
			   contentType("application/json").
			   body(request.toJSONString()).
			    //  header("authorization"," Bearer " + token).
			   when().
			      //get(CONTEXTPATH + "document/find/535").
			   get("http://3.108.194.111:8080/AtdochubJ-3/document/find/500").
		       then().
			   log().all().
			   statusCode(204);
			//response.statusCode();
		}

}
