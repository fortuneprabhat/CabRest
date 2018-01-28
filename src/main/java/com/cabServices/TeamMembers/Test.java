package com.cabServices.TeamMembers;

import org.codehaus.jackson.map.annotate.JsonRootName;

@JsonRootName(value  = "abc")
public class Test {

	public Test(String string) {
		
		int i=10;
	}

	@Override
	public String toString() {
		return "Test []";
	}
	
	

}
