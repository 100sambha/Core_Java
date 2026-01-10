package com.self.java8;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ThreadClass {
	public static void main(String[] args) {
		Thread t1 = new Thread(()->IntStream.range(0, 10).forEach(i->System.out.println(i)));
//		t1.start();
		
		
		Runnable r = ()->IntStream.range(0, 10).filter(i->i%2==0).mapToObj(i->i).collect(Collectors.groupingBy(i->i%2==0)).entrySet().forEach(i->System.out.println(i));;
		Thread t2 = new Thread(r);
		t2.start();
	}

}
