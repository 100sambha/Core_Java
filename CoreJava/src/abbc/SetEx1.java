package abbc;

import java.util.HashSet;
import java.util.Set;

public class SetEx1 {
	public static void main(String[] args) {
		Set<User> userSet = new HashSet<User>();
		userSet.add(new User(1, "Sambhaji"));
		userSet.add(new User(1, "Sambhaji"));
		
		System.out.println(userSet.size());
	}
}

class User{
	int id;
	String name;
	public User(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
}
