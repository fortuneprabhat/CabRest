package com.cabService.handle;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;



import com.cabService.Employee.Member;
import com.cabService.Employee.RegisterEmployee;
import com.cabService.cabs.Cabs;
import com.cabService.cabs.ManageCab;
import com.cabService.cabs.ManageCabI;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.codehaus.jackson.map.annotate.JacksonStdImpl;

@XmlRootElement(name="Test")
public class CabDetailsWrpper {
	@XmlElement(name="total_cost")
	float total_cost;
	List<AllMembers>
	
	
	@XmlElement(name="cab_id")
	String cab_id;
	@XmlElement(name="team_member_ids")
	List<Integer> team_member_ids;
	@XmlElement(name="route")
	Set<String> route;
	@XmlElement(name="route_cost")
	float route_cost;
	
	ManageCab finalList;
	
	public CabDetailsWrpper()
	{
		team_member_ids=new LinkedList<Integer>();
		route=new LinkedHashSet<String>();
		ManageCabI cabs=ManageCab.getInstance();
		route.add("target_headquarter");
		Set<Member> emp=RegisterEmployee.getInatance().getAllMembers();
			
			
			List<Cabs> cablist=cabs.getCabList();
			
			for(Cabs cab:cablist)
			{
				int capacity=cab.getCapacity();
				cab_id=cab.getId();
				total_cost=total_cost+cab.getCost();
				
				for(int i=0;i<capacity;i++)
				{
					
					
					for(Member mem:emp)
					{
						int id=mem.getTem_member_id();
						String droppoint=mem.getDrop_point();
						char gender=mem.getGender();
						if((gender=='f')||(gender=='F'))
						{
							team_member_ids.add(0, id);
							//team_member_ids.add(id);
							route.add(droppoint);
							route_cost=cab.getCost();	
						}
						else
						{
							team_member_ids.add(0, id);
							route.add(droppoint);
							route_cost=cab.getCost();	
						}
					}
					
				}
				
				
			}
			System.out.println("******************************************");
			System.out.println(team_member_ids);
			System.out.println(route);
			
		
	}
	
	public void display()
	{
		System.out.println(total_cost);
		for()
	}
	
}
