package com.cabServices.TeamMembers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import com.cabServices.dropPoints.DropPointI;
import com.cabServices.dropPoints.ManageDropPoints;


/*
http://localhost:8080/TeamMembers/webresources/drop_points
{
  "target_headquarter":"1,8,1,2,1",
  "pointA": "0,1,2,1,2",
  "pointB": "8,0,1,3,1",
  "pointC": "7,9,0,1,1",
  "pointD": "2,2,2,0,1",
  "pointE": "2,9,6,7,0"
}

*/

@Path("/drop_points")
public class DropPointsService {
	 @POST
	 @Consumes("application/json")
	 public Response  AddDropPoints(InputStream incomingData) throws IOException {
		 System.out.println("Drop point service--> Adding Drop Locations");
			DropPointI dp=ManageDropPoints.getInstance();
			dp.addDropPoints(incomingData);
		 return Response.ok().status(201).build(); 
	 }

}
