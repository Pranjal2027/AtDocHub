package com.atdochub.api.login;

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

public class TC_01_login extends Base_Class {
	 @BeforeClass
		public void setup()
		{
		//	super.performLogin();
		}
		
	    @Test
	    
		public  void test_1()
		{
			JSONObject request=new JSONObject();
			given().
			   contentType("application/json").
			   body(request.toJSONString()).
			    //  header("authorization"," Bearer " + token).
			   when().
			      get(CONTEXTPATH + "user/login?useremail=reshama.ghadge@tech-trail.com&userpassword=1221&playerid=895646sdbcfjh4645asc").
		       then().
			   log().all().
			   statusCode(200);
			//response.statusCode();
		}

}
