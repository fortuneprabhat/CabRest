package com.cabServices.dropPoints;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ManageDropPoints implements DropPointI
{
	private static ManageDropPoints instance;
	
	private static Map droppoints;
	
	private ManageDropPoints()
	{
		droppoints = new LinkedHashMap<String, ArrayList<Integer>>();
	}
	
	public static DropPointI getInstance()
	{
		
		if(instance==null)
		{
			instance=new ManageDropPoints();
			
		}
		return instance;
	}

	@Override
	public void addDropPoints(InputStream incomingData) throws IOException {
		List pointList;
		String line;
		BufferedReader in = new BufferedReader(new InputStreamReader(incomingData));
		while (( line = in.readLine()) != null) 
		{
			String[] targateAndpoints=line.split(":");
			if(targateAndpoints.length>1)
			{
				String[] points=targateAndpoints[1].split(",");
				pointList=new ArrayList<Integer>(points.length);
				for(String str:points)
				{
					str=str.replaceAll("\"", "");
					pointList.add(Integer.parseInt(str.trim().toString()));
				}
				String str=targateAndpoints[0];
				str=str.substring(3, str.length()-1);
				droppoints.put(str, pointList);
			}
			
			
		}
		
		System.out.println(droppoints);
	}
	
	public static boolean isDropPointAvailable(String key)
	{	
		return droppoints.containsKey(key);
	}
	
}
