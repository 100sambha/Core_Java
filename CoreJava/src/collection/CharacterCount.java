package collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharacterCount {
	public static void main(String[] args) {
		String s = "GeeksForGeeks";
		
		Map<Character, Integer> charCounter = new LinkedHashMap<>();
		for (int i = 0; i < s.length(); i++) {
			if(charCounter.containsKey(s.charAt(i))) {
				charCounter.put(s.charAt(i), charCounter.get(s.charAt(i))+1);
			}
			else {
				charCounter.put(s.charAt(i), 1);
			}
		}
		System.out.println(charCounter);
	}
}