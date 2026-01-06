package com.self.design_patterns;

import com.self.design_patterns.poja.User;

public class BuilderMain {
	public static void main(String[] args) {
		
		User user = new User.Builder()
				.id(100)
				.name("Sambhaji")
				.email("100sambha@gmail.com")
				.age(25)
				.build();
		
		System.out.println(user);
	}
}
