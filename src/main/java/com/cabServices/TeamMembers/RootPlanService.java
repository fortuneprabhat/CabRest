package com.cabServices.TeamMembers;

import java.io.IOException;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.json.JSONObject;

import com.cabService.handle.CabDetailsWrpper;

/*
http://localhost:8080/TeamMembers/webresources/route_plan
*/

@Path("/route_plan")
public class RootPlanService {

	@GET
	@Produces( {MediaType.TEXT_PLAIN, MediaType.APPLICATION_XML,
        MediaType.APPLICATION_JSON })
	public CabDetailsWrpper registerEmployee() throws IOException, JSONException, org.json.JSONException {
		

		System.out.println("Root plan service");
	    return new CabDetailsWrpper();
	}
	/*@GET @Produces( {MediaType.TEXT_PLAIN, MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON })
	public JSONArray registerEmployee(JSONArray inputJsonObj) throws IOException, JSONException, org.json.JSONException {
		

		JSONArray arr=new JSONArray();
		arr.join("hello");
		System.out.println("Root plan service");
	    return arr;
		//return new Test("abc");
	}*/

	
}
