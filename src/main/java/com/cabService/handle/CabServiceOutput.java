package com.cabService.handle;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CabServiceOutput {
	
	int total_cost;
	List<CabDetailsWrpper> details;
	
	public CabServiceOutput()
	{
		details= new ArrayList<CabDetailsWrpper>();
		
		
	}
	
	
	

}
