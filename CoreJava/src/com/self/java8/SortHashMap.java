package com.self.java8;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class SortHashMap {
	public static void main(String[] args) {
		
		Map<String, Emp> map = new HashMap<>();
		map.put("W", new Emp(61,"Pandhare", 28));
		map.put("X", new Emp(25,"Sarkar", 20));
		map.put("J", new Emp(53,"Jay", 21));
		map.put("Q", new Emp(30,"Ram", 20));
		map.put("R", new Emp(47,"Ganesh", 23));
		map.put("O", new Emp(94,"Hari", 24));
		map.put("J", new Emp(53,"Jay", 21));

		System.out.println(map);
		
		
		List<Entry<String,Emp>> m=  map.entrySet().stream().sorted((e1,e2)->e1.getValue().getName().compareTo(e2.getValue().getName())).collect(Collectors.toList());
		
		for(Map.Entry<String, Emp> e : m) {
			System.out.println(e.getValue().getName());
		}
	}
}

class Emp {
	int id;
	String name;
	int age;
	
	public Emp() {
		super();
	}
	
	public Emp(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}