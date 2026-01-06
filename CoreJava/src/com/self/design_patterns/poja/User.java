package com.self.design_patterns.poja;

public class User {
	
	private final int id;
	private final String name;
	private final String email;
	private final int age;
	
	private User(Builder builder) {
		this.id = builder.id;
		this.name = builder.name;
		this.email = builder.email;
		this.age = builder.age;
	}
	
	public static class Builder {
		private int id;
		private String name;
		private String email;
		private int age;
		
		public Builder id(int id) {
			this.id = id;
			return this;
		}
		
		public Builder name(String name) {
			this.name = name;
			return this;
		}
		
		public Builder email(String email) {
			this.email = email;
			return this;
		}
		
		public Builder age(int age) {
			this.age = age;
			return this;
		}
		
		public User build() {
			return new User(this);
		}

	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", age=" + age + "]";
	}

}
