package com.self.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class SortMethods 
{
	
	
	public static void main( String[] args )
    {
    	
    	
    	
    	Set<Student> set = new HashSet<Student>();
    	set.add(new Student(1,"sambhaji"));
    	set.add(new Student(2,"Tushar"));
    	set.add(new Student(1,"sambhaji"));
    	
    	
    	System.out.println(set.size());			// size : 2
    	System.out.println(set);
    	
    	
    	
    	
//    	Set<String> set2 = new HashSet<String>();
//    	set2.add("1");
//    	set2.add("2");
//    	set2.add("1");
//    	
//    	System.out.println(set2.size());			// size : 2
//    	System.out.println(set2);


    	
    	Map<Student, String> namesMap = new HashMap<Student, String>();
    	
    	namesMap.put(new Student(1,"sambhaji"), "A");
    	namesMap.put(new Student(2,"Tushar"), "B");
    	namesMap.put(new Student(1,"sambhaji"), "Override A");
    	
    	
    	System.out.println(namesMap.size());						// size : 2
    	System.out.println(namesMap);								// output :
    	
    	
    	System.out.println("----------");
    	System.out.println();
    	
    	List<String> studList1 = new ArrayList<>(namesMap.values());
    	List<Student> studList2 = new ArrayList<>(namesMap.keySet());
    	
    	System.out.println(studList1);
    	System.out.println(studList2);
    	
    	
    }
}



class StduentSort implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.id-o2.id & o1.name.compareTo(o2.name);
	}
	
}


class Student implements Comparable<Student> {

	int id;
	String name;
	
	public Student(int id, String nme) {
		this.id = id;
		this.name = nme;
	}
	
	@Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
	
	@Override
    public boolean equals(Object obj) {
        if (this == obj)
        	return true;
        
        if (obj == null || getClass() != obj.getClass())
        	return false;
        
        Student employee = (Student) obj;
        return id == employee.id &&
             Objects.equals(name, employee.name);
    }

	@Override
	public int compareTo(Student o) {
		return this.id-o.id & this.name.compareTo(o.name);
	}
}