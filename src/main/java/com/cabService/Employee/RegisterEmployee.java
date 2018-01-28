package com.cabService.Employee;

import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;

public class RegisterEmployee implements RegisterEmployeeI{
	private static RegisterEmployee instance;
	private Set<Member> set;
	private RegisterEmployee()
	{
		set=new LinkedHashSet<Member>();
	}
	
	public static RegisterEmployee getInatance()
	{
		if(instance==null)
			instance=new RegisterEmployee();
		return instance;
	}

	@Override
	public void RegisterEmployee(Member member) throws IOException {
		set.add(member);
		
	}
	
	public Set<Member> getAllMembers()
	{
		return set;
	}

	@Override
	public void displayEmployee() {
		System.out.println(set);
		
	}
	
	
}
