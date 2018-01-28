package com.cabServices.TeamMembers;

import java.io.IOException;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import com.cabService.cabs.Cabs;
import com.cabService.cabs.ManageCab;
import com.cabService.cabs.ManageCabI;

/*
http://localhost:8080/TeamMembers/webresources/cabs
{
  "cabs": [
    {
      "id": "cab1",
      "cost": 2,
      "capacity": 2
    },
    {
      "id": "cab2",
      "cost": 1,
      "capacity": 3
    }
  ]
}


 [
    {
      "id": "cab1",
      "cost": 2,
      "capacity": 2
    },
    {
      "id": "cab2",
      "cost": 1,
      "capacity": 3
    }
  ]
  

*/

@Path("/cabs")
public class CabCapacityService {
	@POST
	 @Consumes("application/json")
	public Response  addCabs(JSONArray addcabs) throws IOException, JSONException {
		System.out.println("cabs service");
		ManageCabI cab= ManageCab.getInstance();
		for(int i=0;i<addcabs.length();i++)
		{
			JSONObject temp=(JSONObject) addcabs.get(i);
			String id=temp.getString("id");
			float cost=(float)temp.getDouble("cost");
			int capacity = temp.getInt("capacity");
			cab.addCabs(new Cabs(id, cost, capacity));
			
		}
		cab.displayCabs();
		return Response.ok().status(201).build(); 
		
	}
}
