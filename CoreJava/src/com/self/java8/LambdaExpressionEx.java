package com.self.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

@FunctionalInterface
interface Test2{
	void test();
}

@FunctionalInterface
interface Test3{
	void test(List<String> list);
}

public class LambdaExpressionEx {
	public static void main(String[] args) {
		
		
		List<String> list = new ArrayList<>();
		list.add("Apple");
		list.add("Banana");
		list.add("Mango");
		list.add("Orange");
		list.add("Watermellon");
		
		list.forEach((str)->System.out.println(str));
//		list.

		
		Test2 t2 = ()->System.out.println("\nI have done my BreakFast");
		t2.test();
		
		System.out.println("\nUsing Java 8");
		Test3 t3 = (li)->li.forEach(i->System.out.println(i));;
		t3.test(list);
		
		
		
		System.out.println("\nPredicate Examples");
		List<String> names = Arrays.asList("Sambhaji", "Tushar", "Devidas", "Devidas", "Santosh", "Santosh");
		Predicate<String> p1 = (str)->str.startsWith("S");
//		Predicate<String> p2 = (str)->str.contains("s");
		for(String str : names) {
			if(p1.test(str)) {
//			if(p2.test(str)) {					
				System.out.println(str);
			}
		}
		
		System.out.println("\nSet example");
		Set<String> set = new HashSet<>(names);
//		System.out.println(set);
		set.forEach(s->System.out.println(s));
	}
}