package com.cabService.Employee;

import java.io.IOException;
import java.util.Set;

public interface RegisterEmployeeI {
	public void RegisterEmployee(Member member) throws IOException;
	public void displayEmployee();
	public Set<Member> getAllMembers();
}
