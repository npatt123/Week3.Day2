package week3.Day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
	
	public static void main(String[] args) {
		
		String text= "We learn java basics as part of java sessions in java week1";
		String[] split = text.split(" ");
					
		Set<String> set = new LinkedHashSet<String>();		

		for(int i = 0; i < split.length; i++) {			
			 	
			 set.add(split[i]);
			 
		 }
		System.out.println("The below sentence is without Duplicate: ");
		
		for( String eachword  : set) {
					 
			System.out.print(eachword +  " ");
		}
				 
	
	 }
			
		
}




	

