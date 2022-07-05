package week3.Day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class FindNumberOfOccurance {
	
	public static void main(String[] args) {
		
		
		Map<Integer,Integer> map = new TreeMap<Integer,Integer>();
		Set<Entry<Integer, Integer>> entrySet = map.entrySet();	
		List<Integer> list = new ArrayList<Integer>();
		Collections.addAll(list, 2,3,5,6,3,2,1,4,2,1,6,-1);
		
		
		
		for(int i =0; i < list.size(); i++) {
			
			
			if(map.containsKey(list.get(i))){
				
				Integer count = map.get(list.get(i));
				Integer newValue = count +1;								
				map.put(list.get(i), newValue);				
			}
			else {
				
				map.put(list.get(i), 1);			}
			}		
			
		System.out.println(entrySet);
		System.out.println(map);
	
	}

}
