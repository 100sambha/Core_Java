package com.self.functionalIterface;

import java.util.*;

public class ComparatorExample {
	public static void main(String[] args) {
		List<Employee> l = Arrays.asList(new Employee(4,"Sam"),
				new Employee(5,"Viky"),
				new Employee(1,"Sam"),
				new Employee(2,"Sambhaji"),
				new Employee(8,"Tukaram"));
		
//		Collections.sort(l, new EmployeeComparataor());
//		System.out.println(l);
		
		l.sort((e1,e2)->Integer.compare(e1.getId(), e2.getId()));;
		
		System.out.println(l);
	}
}


class Employee{
	private int id;
	private String name;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
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
	
	
}

class EmployeeComparataor implements Comparator<Employee>{
	
	@Override
	public int compare(Employee e1, Employee e2) {
		
		int res = e1.getName().compareTo(e2.getName());
		
		if(res!=0) {
			return res;
		}
		
		return Integer.compare(e1.getId(), e2.getId());
		
		
	}	
}