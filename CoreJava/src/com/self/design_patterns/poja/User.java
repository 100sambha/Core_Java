package com.self.design_patterns.poja;

public class User {

	private final int id;
	private final String name;
	
	public User(Builder builder) {
		this.id = builder.id;
		this.name = builder.name;
	}
	
	public static class Builder {
		private int id;
		private String name;
				
		public Builder id(int id) {
			this.id = id;
			return this;
		}
		
		public Builder name(String name) {
			this.name = name;
			return this;
		}
		
		public User build() {
			return new User(this);
		}
	}
	
}
