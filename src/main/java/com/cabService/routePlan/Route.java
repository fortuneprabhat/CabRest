package com.cabService.routePlan;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Route {
	private int total_cost;
	private List<CabStat> cabs;
	public Route()
	{
		
	}
}
