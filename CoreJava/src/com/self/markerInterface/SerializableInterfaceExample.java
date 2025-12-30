package com.self.markerInterface;

import java.io.Serializable;

public class SerializableInterfaceExample {

	public static void main(String[] args) {
		Person person = new Person();
		System.out.println(person);
	}

}

class Person implements Serializable {

	private static final long serialVersionUID = 1L;
	private int id;
	private String name;

	public Person() {
		super();
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}