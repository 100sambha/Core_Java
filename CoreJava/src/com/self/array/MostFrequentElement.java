package com.self.array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
   
public class MostFrequentElement
{
       
    public static void main(String[] args)
    {
    	int[]arr = {4, 5, 8, 7, 4, 7, 6,7};
//    	int[]arr = {1, 2, 7, 5, 3, 6};
    	
    	int max = Integer.MIN_VALUE;
    	int element = 0;
    	
    	Map<Integer, Integer> map = new HashMap<>();
    	
    	for (int i = 0; i < arr.length; i++) {
			if(!map.containsKey(arr[i])) {
				map.put(arr[i], 1);
			}
			else {				
				int j = map.get(arr[i])+1;
				map.put(arr[i], j);
			}
		}
    	
    	
    	for(Map.Entry<Integer, Integer> m : map.entrySet()) {
    		if(m.getValue()>max) {
    			element = m.getKey();
    			max = m.getValue();
    		}
    	}
    	
    	if(max>1) {
    		System.out.println("Most Frequent Element  "+element+" : "+max);
    		System.out.println(Arrays.stream(arr).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).findFirst().get());    	
    	}
    	else {
    		System.out.println("No Frequent Element");
    	}
    	
    	
    	
    }
}