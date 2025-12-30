package com.self.string;

import java.util.HashSet;
import java.util.Set;

public class OccurrencesOfEachCharacter {

	public static void main(String[] args) {
		System.out.println("Occurrences Of Each Character");
		String s1 = "I am the best";
		
		s1 = s1.replaceAll("\\s+", "");
		System.out.println(s1);
		
//		HashMap<Character, Integer> characterCount = new HashMap<>();
		Set<Character> chh = new HashSet<>();
		char[] chars = s1.toCharArray();
		for(char ch : chars) {
			chh.add(ch);
//			if(characterCount.containsKey(ch)) {
//				characterCount.put(ch,characterCount.get(ch)+1);
//			}
//			else {
//				characterCount.put(ch, 1);
//			}
		}
		int[] cnt = new int[255];
		for (int i = 0; i < chars.length; i++) {
			cnt[chars[i]]++;
		}

		for(int i = 0; i < cnt.length; i++) {
			if(cnt[i]>=1) {
				System.out.println((char)(i)+" "+cnt[i]);
			}
		}
//		System.out.println(chh);
//		System.out.println(chh.size());
//		System.out.println(characterCount);
	}
}
