package week3.Day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MostDuplicateNumber {
	
	public static void main(String[] args) {
		
		String input = "abbabab";		
		char[] charArray = input.toCharArray();
		Map <Character,Integer> map = new TreeMap <Character, Integer>();
		List<Character> list = new ArrayList <Character> ();
		
		for(Character  eachCharacter   : charArray) {
			
			list.add(eachCharacter);
									
		}
		
		for(int i =0; i < list.size(); i++) {
		
		if(map.containsKey(list.get(i))) {
			
			map.put(list.get(i), map.get(list.get(i))+ 1 );
		}
		else
		{
			map.put(list.get(i), 1);
		}
					
		}
                	
        	int maxiOccurence =0;
        
        Set<Entry<Character, Integer>> entry = map.entrySet();
        for(Entry<Character, Integer>  eachEntry   :entry) {
        	if( eachEntry.getValue() >maxiOccurence) {
        		
        		maxiOccurence = eachEntry.getValue();
        	}        	
        	
        }
        System.out.println("The Character with maximum occurence is :"  );
        	
        	
        for(Entry<Character, Integer>  eachEntry  : entry) {
        	
        	if(eachEntry.getValue() == maxiOccurence) {
        		System.out.println(eachEntry.getKey());        	       		
        	}
        	
        }
        	
        
		
		

		
	}

}
