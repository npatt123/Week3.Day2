package week3.Day2;

import java.util.List;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

public class FindIntersection {
	
	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList <Integer>();
		Collections.addAll(list1, 3,2,11,4,6,7);
		Collections.sort(list1);
		List<Integer> list2 = new ArrayList <Integer>();
		Collections.addAll(list2, 1,2,8,4,9,7);
		Collections.sort(list2);
		
		for(int i =0; i < list1.size(); i++ ) {
			
			for(int j = 0; j < list2.size(); j++) {
				
				if (list1.get(i) == list2.get(j)) {
					
					System.out.println("Intersection No: " + list1.get(i));
					
				}

			}
		}	
				
	}
	
	
}

