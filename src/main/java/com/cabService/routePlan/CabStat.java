package com.cabService.routePlan;

public class CabStat {
	String cab_id;
	StringBuffer team_member_ids;
	StringBuffer route;
	int route_cost;
	
	public CabStat()
	{
		team_member_ids=new StringBuffer();
		route=new StringBuffer();
	}

	public String getCab_id() {
		return cab_id;
	}

	public void setCab_id(String cab_id) {
		this.cab_id = cab_id;
	}

	public StringBuffer getTeam_member_ids() {
		return team_member_ids;
	}

	public void setTeam_member_ids(StringBuffer team_member_ids) {
		this.team_member_ids = team_member_ids;
	}

	public StringBuffer getRoute() {
		return route;
	}

	public void setRoute(StringBuffer route) {
		this.route = route;
	}

	public int getRoute_cost() {
		return route_cost;
	}

	public void setRoute_cost(int route_cost) {
		this.route_cost = route_cost;
	}
	
	
}
