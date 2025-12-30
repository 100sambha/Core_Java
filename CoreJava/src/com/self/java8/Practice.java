package com.self.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Practice {
	public static void main(String[] args) {

		List<Student> studentList = Arrays.asList(new Student("Alice", 75.0), new Student("Bob", 55.0),
				new Student("Charlie", 90.0), new Student("Diana", 58.0), new Student("Ethan", 62.5));

		System.out.println("students partioned By Percentage");
		Map<Boolean, List<Student>> studentspartionedByPercentage = studentList.stream()
				.collect(Collectors.partitioningBy(student -> student.getPercentage() > 60.0));
		System.out.println(studentspartionedByPercentage);	

		System.out.println("\ntop 3 Students");
//		List<Student> top3Students = studentList.stream().sorted((s1, s2) -> Double.compare(s2.getPercentage(), s1.getPercentage())).limit(3).collect(Collectors.toList()); // Using lambda expression.limit(3).collect(Collectors.toList());
		List<Student> top3Students = studentList.stream().sorted(Comparator.comparingDouble(Student::getPercentage).reversed()).limit(3).collect(Collectors.toList());
		System.out.println(top3Students);
		
		System.out.println("\nname Percentage Map");
		Map<String, Double> namePercentageMap = studentList.stream().collect(Collectors.toMap(Student::getName, Student::getPercentage));
		System.out.println(namePercentageMap);
		
		System.out.println("\nstudent Names");
		Set<String> studentNames = studentList.stream().map(Student::getName).collect(Collectors.toSet());
		System.out.println(studentNames);
		
		System.out.println("\nstudent Stats");
		DoubleSummaryStatistics studentStats = studentList.stream().collect(Collectors.summarizingDouble(Student::getPercentage));
		System.out.println(studentStats.getMax());
	}
}
