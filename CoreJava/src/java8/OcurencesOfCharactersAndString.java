package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OcurencesOfCharactersAndString {
	public static void main(String[] args) {
		Character []chars = {'a','b','c','a','b','c','c'};
		
		List<Character> list = Arrays.asList(chars);
		
		Map<Character, Long> count = list.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		
//		Character[] chars = {'a','b','c','a','b','c','c'};
//
//		List<Character> list = Arrays.asList(chars);
//
//		Map<Character, Long> count = list.stream()
//		        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//
//		System.out.println(count);
		
//		Map<Character, Integer> count = new HashMap<>();
//		
//		for (Character character : list) {
//			if(count.containsKey(character)) {
//				count.put(character, count.getOrDefault(character, 0)+1);
//			}
//			else {
//				count.put(character, 1);
//			}
//		}
//		
//		
		String s = "";
		
		for(Map.Entry<Character, Long> map:count.entrySet()) {
			char ch = map.getKey();
			if(map.getValue()<1) {
				s+=map.getKey();
			}
			else {
				s+=ch+map.getValue().toString();
			}
		}
		
		
		System.out.println(s);
		
	}
}