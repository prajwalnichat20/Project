package Logical;

import java.util.HashMap;
import java.util.Map;

public class Count {
	public static void main(String[] args) {
//		String s =new String("Prajwal ");
//		System.out.println(s.length());
		
//		String s="Prajwal Nichat2 1 3 ";
//		int count=0;
//		
//		for(int i =s.length()-1;i>=0; i--) {
//			if(s.charAt(i)!=' ') {
//			count++;
//			}
//			//count++;
//		}
//		System.out.println(count);
		
		String word = "Prajwal nichattt";
	    Map<String, Integer> charCount = new HashMap();
	    for(String charr: word.split("")){
	        Integer added = charCount.putIfAbsent(charr, 1);
	        if(added != null)
	            charCount.computeIfPresent(charr,(k,v) -> v+1);
	    }

	    System.out.println(charCount);
	}

}
