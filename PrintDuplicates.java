package week3.Day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class PrintDuplicates {
	
	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList <Integer> ();
		Collections.addAll(list1, 14,12,13,11,15,14,18,16,17,19,18,17,20);
		Collections.sort(list1);
		System.out.println(list1);
		Set<Integer> noDuplicatelist = new LinkedHashSet<Integer>();
		
		for(int i = 0; i < list1.size(); i++ ) {
			
			boolean add = noDuplicatelist.add(list1.get(i));				
			 
			 if(add != true) {
				 
				 System.out.println("Duplicate no:"  +  list1.get(i));
			 }
			
		}	
		/*for(Integer eachValue : list1) {
			
			boolean add = noDuplicatelist.add(eachValue);
			if(add != true) {
				 
				 System.out.println("Duplicate no:"  +  eachValue);
			 }
		}*/
		
	}


}
