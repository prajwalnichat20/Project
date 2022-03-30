package com.Model;

import java.util.Set;
import java.util.TreeSet;

public class Test {
	public static void main(String[] args) {
		
		Employee e3= new Employee();
		e3.setName("Pravin");
		e3.setRollno(13);
	
		Employee e1= new Employee();
		e1.setName("Prajwal");
		e1.setRollno(11);
		
		Employee e2= new Employee();
		e2.setName("Vishal");
		e2.setRollno(12);
		
		Set<Employee> s=new TreeSet<Employee>();
		s.add(e1);
		s.add(e2);
		s.add(e3);
		
	
		
		s.forEach(a->{
			System.out.println(a.getRollno());
			System.out.println(a.getName());
		});
	}

}
