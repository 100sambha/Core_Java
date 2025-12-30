package com.self.collection;

import java.util.HashSet;
import java.util.Set;

public class SetEx1 {
	public static void main(String[] args) {
		Set<User> userSet = new HashSet<User>();
		userSet.add(new User(1, "Sambhaji"));
		userSet.add(new User(1, "Sambhaji"));
		userSet.add(new User(1, "Sambhaji Raj"));
		userSet.add(new User(2, "Sambhaji"));
		userSet.add(new User(3, "Pandhare"));

//		userSet.forEach(i->System.out.println(i.hashCode()));
		System.out.println(userSet.size());
	}
}

class User {
	int id;
	String name;

	public User(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;

		if (obj == null || (obj.getClass() != this.getClass()))
			return false;
		
		User u = (User) obj;
		return (this.id==u.id && this.name==u.name);
	}
	
	public int hashCode() {
		return this.id;
	}
}
