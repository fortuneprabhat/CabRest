package com.cabService.Employee;

public class Member{
	private int tem_member_id;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + tem_member_id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		if (tem_member_id != other.tem_member_id)
			return false;
		return true;
	}


	private char gender;
	private String drop_point;
	public Member()
	{
		
	}
	public Member(int tem_member_id, char gender, String drop_point) {
		this.tem_member_id = tem_member_id;
		this.gender = gender;
		this.drop_point = drop_point;
	}
	public int getTem_member_id() {
		return tem_member_id;
	}
	public void setTem_member_id(int tem_member_id) {
		this.tem_member_id = tem_member_id;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getDrop_point() {
		return drop_point;
	}
	public void setDrop_point(String drop_point) {
		this.drop_point = drop_point;
	}
	
	
	@Override
	public String toString() {
		return "Member [tem_member_id=" + tem_member_id + ", gender=" + gender + ", drop_point=" + drop_point + "]";
	}
	
	
}
