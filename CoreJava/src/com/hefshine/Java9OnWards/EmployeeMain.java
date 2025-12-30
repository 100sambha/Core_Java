package com.hefshine.Java9OnWards;

import java.util.ArrayList;
import java.util.List;

public class EmployeeMain {
	public static void main(String[] args) {
		EmployeeRecord e = new EmployeeRecord(1, "Raja", "DE");
		System.out.println(e.name());
		System.out.println(e.id());
		System.out.println(e.department());

		List<EmployeeRecord> emps = new ArrayList<EmployeeRecord>();
		emps.add(new EmployeeRecord(10, "Sambhaji", "IT"));
		emps.add(new EmployeeRecord(11, "Ram", "QA"));
		emps.add(new EmployeeRecord(12, "Jay", "Sales"));
		System.out.println(emps.size());
	}
}
