package com.self.java8;

import java.util.*;
import java.util.stream.*;

public class FirstNonRepeatingCharacter {
    public static Map<Character, Long> firstNonRepeatingCharIndex(String s) {
    
    	return s.chars().mapToObj(i->(char)i).collect(Collectors.groupingBy(i->i,Collectors.counting()));
    }

    public static void main(String[] args) {
        String input = "abbddcafZZ";
        Map<Character, Long> result = firstNonRepeatingCharIndex(input);
        System.out.println(result);
    }
}