package com.self.java8;


import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountOfArraysStrings {
    public static void main(String[] args) {
        String[] strArr = {"abc", "abc", "def", "def", "def", "dog", "dog", "dog", "dog", "zebra", "Zogging"};

        Map<String, Long> StrArrDistinctElements =  Arrays.stream(strArr).filter(str->!str.toLowerCase().startsWith("z")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        StrArrDistinctElements.forEach((key, value) -> System.out.println(key + ": " + value));
        
        StrArrDistinctElements =  Stream.of(strArr).filter(i->!i.startsWith("a")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(StrArrDistinctElements);
        
    }
}
