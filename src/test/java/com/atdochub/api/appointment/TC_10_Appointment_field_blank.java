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

public class TC_10_Appointment_field_blank extends Base_Class {
	 @BeforeClass
		public void setup()
		{
			//super.performLogin();
		}
		
	    @Test
	    
		public  void Blank_Appointment_field()
		{
			JSONObject request=new JSONObject();
			request.put("aptTime","04:20:00");
			   request.put("paymentMode","Cash");
			   request.put("aptPlace","Swarget");                                                                                                    
			   request.put("city","Pune");
			   request.put("partyName","Mrs.David ");
			   request.put("createdBy","Vaishnavi");
			   request.put("updatedBy","Swati");
			  
			   request.put("feesCollected","5000");
			   request.put("aptDate","2022-11-21");
			   request.put("totalFees","");
			 
			   request.put("comments","no");
			   request.put("staffId","161");	
			   request.put("partyType","Tenant");	
			   request.put("aptStatus","Open");	
			   request.put("contactNo","7741825599");	
			   request.put("docId","658");
			   given().
			   contentType("application/json").
			   body(request.toJSONString()).
			    //  header("authorization"," Bearer " + token).
			   when().
			      put(CONTEXTPATH + "appointment/register").
		       then().
			   log().all().
			   statusCode(201);
			//response.statusCode();
		}

}
