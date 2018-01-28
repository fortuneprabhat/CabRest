package com.cabService.cabs;

import java.util.ArrayList;
import java.util.List;

public class ManageCab implements ManageCabI{

	private static ManageCab instance;
	private List<Cabs> list;
	private ManageCab() {
		// TODO Auto-generated constructor stub
		list=new ArrayList<Cabs>();
	}
	
	public static ManageCab getInstance()
	{
		if(instance==null)
			instance=new ManageCab();
		return instance;
	}
	
	@Override
	public void addCabs(Cabs cab) {
		list.add(cab);
	}

	@Override
	public List<Cabs> getCabList() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public void displayCabs() {
		System.out.println(list);
		
	}
	
	
	

}
