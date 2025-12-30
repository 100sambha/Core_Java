package com.self.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapSortExamples {
	
	public static void main(String[] args) {
		Map<String, Employee> map = new HashMap<>();
		
		map.put("P", new Employee("Sambhaji","MH"));
		map.put("X", new Employee("Tushar","Ap"));
		map.put("Q", new Employee("Ganes","MH"));
		map.put("L", new Employee("SAN","UP"));
		map.put("Y", new Employee("BAN","MP"));
		map.put("Z", new Employee("TAN","UP"));
		map.put("G", new Employee("RAN","TA"));
		
		
		
//		Sort Map By Value Field
//		List<Map.Entry<String, Employee>> list = new ArrayList<>(map.entrySet());
//		Collections.sort(list,((o1,o2)->o1.getValue().getState().compareTo(o2.getValue().getState())));		
//		Map<String, Employee> lMap = new LinkedHashMap<String, Employee>();
//		for(Map.Entry<String, Employee> m : list) {
//			lMap.put(m.getKey(), m.getValue());
//		}
//		for(Map.Entry<String, Employee> lm : lMap.entrySet()) {
//			System.out.println(lm);
//		}
		
		Map<String, Employee> mm= map.entrySet().stream()
									.sorted((o1,o2)->o1.getValue().getState().compareTo(o2.getValue().getState()))
									.collect(Collectors.toMap(
										Map.Entry::getKey,
										Map.Entry::getValue,
										(e2,e3)->e2,
										LinkedHashMap::new
										));
		System.out.println(mm);
		
		
//		Sort Map By Key using Sorted - > TreeMap
//		Map<String, Employee> sortedMap = new TreeMap<String, Employee>(map);
//		System.out.println(sortedMap);


//		Grouping By State
//		Map<String, List<Employee>> l = map.values().stream().collect(Collectors.groupingBy(Employee::getState, LinkedHashMap::new, Collectors.toList()));
//		System.out.println(l);

	}
}

class Employee{
	String name;
	String state;
	public Employee() {
		super();
	}
	public Employee(String name, String state) {
		super();
		this.name = name;
		this.state = state;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", state=" + state + "]";
	}	
}