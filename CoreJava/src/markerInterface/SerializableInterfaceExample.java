package markerInterface;

import java.io.Serializable;

public class SerializableInterfaceExample {

	public static void main(String[] args) {
		Person person = new Person();
		System.out.println(person);
	}

}

class Person implements Serializable{
	private int id;
	private String name;
}