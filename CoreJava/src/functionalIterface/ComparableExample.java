package functionalIterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparableExample {
	public static void main(String[] args) {
		
		List<Person> l = Arrays.asList(new Person(4,"Sam"),
				new Person(5,"Viky"),
				new Person(1,"Pras"),
				new Person(9,"Sagar"),
				new Person(8,"Tukaram"));
		
		Collections.sort(l);
		System.out.println(l);
		
	}
}

class Person implements Comparable<Person>{
	private int id;
	private String name;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int compareTo(Person o) {
//		return this.name.compareTo(o.name);
		return Integer.compare(this.id, o.id);
	}
	
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	
	
	
}