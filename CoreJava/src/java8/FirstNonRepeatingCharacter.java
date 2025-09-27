package java8;

import java.util.*;
import java.util.stream.*;

public class FirstNonRepeatingCharacter {
    public static int firstNonRepeatingCharIndex(String s) {
    
    	Map<Character, Long> map = s.chars()
    			.mapToObj(c->(char) c)
    			.collect(Collectors.groupingBy(c->c, Collectors.counting()));
    	
    	return 0;
    	
    }

    public static void main(String[] args) {
        String input = "abbddcaf";
        int result = firstNonRepeatingCharIndex(input);
//        System.out.println(result);
    }
}
