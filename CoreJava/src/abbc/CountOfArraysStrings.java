package abbc;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class CountOfArraysStrings {
    public static void main(String[] args) {
        String[] strArr = {"abc", "abc", "def", "def", "def", "dog", "dog", "dog", "dog", "zebra", "Zogging"};

        Map<String, Long> StrArrDistinctElements =  Arrays.stream(strArr).filter(str->!str.toLowerCase().startsWith("z")).collect(Collectors.groupingBy(s->s,Collectors.counting()));
        
        StrArrDistinctElements.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
