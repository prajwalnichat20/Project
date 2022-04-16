package Logical;

import java.util.ArrayList;

import java.util.Collections;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class SpecificCharractor {
	
	public static void main(String[] args) {
		
		String s= "Prajwal                     Nichat";
//		long c = s.chars().filter(b->b=='a').count();
//		System.out.println(c);
		
	char[] d= s.toCharArray();
	List<Character> l=new ArrayList<>();
	for(char ch: d) {
   	 l.add(ch);
    }
     Set<Character> b=new TreeSet<>(l);
     
	for(char a:b) {
	System.out.println(Collections.frequency(l ,a)+"="+a+" ");
	}
	}

}
