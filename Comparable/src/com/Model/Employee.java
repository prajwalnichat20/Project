package com.Model;

public class Employee implements Comparable<Employee>{

	private int rollno;
	private String name;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public int compareTo(Employee e) {
		//return this.rollno-e.rollno;
		
		return this.name.compareTo(e.name);
	}
}
