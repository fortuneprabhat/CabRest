package com.cabServices.TeamMembers;

import java.io.IOException;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import com.cabService.Employee.Member;
import com.cabService.Employee.RegisterEmployee;
import com.cabService.Employee.RegisterEmployeeI;
import com.cabService.Exception.DropPointUnavailableException;
import com.cabServices.dropPoints.ManageDropPoints;


/*
http://localhost:8080/TeamMembers/webresources/team_members

 [
    {
      "tem_member_id": "1",
      "gender": "M",
      "drop_point": "pointC"
    },
    {
      "tem_member_id": "2",
      "gender": "M",
      "drop_point": "pointB"
    },
    {
      "tem_member_id": "3",
      "gender": "M",
      "drop_point": "pointA"
    },
    {
      "tem_member_id": "4",
      "gender": "M",
      "drop_point": "pointE"
    },
    {
      "tem_member_id": "5",
      "gender": "M",
      "drop_point": "pointE"
    }
  ]

*/
@Path("/team_members")
public class RegisterEmployeeService {
	
	 @POST
	 @Consumes("application/json")
	public Response  registerEmployee(JSONArray inputJsonObj) throws IOException, JSONException {
		 System.out.println("Team member Service");
		 RegisterEmployeeI instance = RegisterEmployee.getInatance();
		for(int i=0;i<inputJsonObj.length();i++)
		 {
			 JSONObject temp=(JSONObject) inputJsonObj.get(i);
			 int id= temp.getInt("tem_member_id");
			 String gender =temp.getString("gender");
			 String drop_point=temp.getString("drop_point");
			 
			 boolean flag=ManageDropPoints.isDropPointAvailable(drop_point);
			 if(flag==false)
			 {
				 instance=null;
				 throw new DropPointUnavailableException("Point is not available in the list: "+drop_point);
			 }
			 instance.RegisterEmployee(new Member(id, gender.charAt(0), drop_point));
		 }
		instance.displayEmployee();
		 return Response.ok().status(201).build(); 
		 
	 }
}
