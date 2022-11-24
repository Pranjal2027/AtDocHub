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

public class TC_02_appointment_update_by_id extends Base_Class {
	 @BeforeClass
		public void setup()
		{
		//	super.performLogin();
		}
		
	    @Test
	    
		public  void Appointment_update_by_id()
		{
			JSONObject request=new JSONObject();
			request.put("docId","534");
			   request.put("contactNo","9999123650");
			   request.put("partyType","Owner");
			   request.put("aptPlace","Baner");                                                                                                    
			   request.put("city","Pune");
			   request.put("partyName","Mrs.David Khanna");
			   request.put("staffId","161");
			   request.put("createdBy","Vaishnavi");
			   request.put("updatedBy","Swati");
			   request.put("aptDate","2022-11-21");
			   request.put("endDate","2023-11-16");
			   request.put("aptStatus","Closed");
			   request.put("totalFees","60000");
			   request.put("aptId","613");
			   request.put("aptTime","04:20:00");
			   request.put("comments","no");
			   request.put("feesCollected","1400");
			given().
			   contentType("application/json").
			   body(request.toJSONString()).
			    //  header("authorization"," Bearer " + token).
			   when().
			      patch(CONTEXTPATH + "appointment/updatebyid/").
		       then().
			   log().all().
			   statusCode(201);
			//response.statusCode();
		}

}
