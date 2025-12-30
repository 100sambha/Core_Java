package com.self.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

class Test4{
	
	public void name() {
		System.out.println("My Name Is Sambhaji");
	}
	
}

public class ConsumerSupplier {
	
	public static void main(String[] args) {
		
		List<String> str = Arrays.asList("Sambhaji", "Ramkisan", "Tushar", "Krish");
		
		Consumer<String> printData = (s)->System.out.println(s);
		
		str.forEach(printData);
		
		
		Supplier<Test4> t4 =()-> new Test4();
		Test4 t = t4.get();
		
		t.name();
		
	}

}
