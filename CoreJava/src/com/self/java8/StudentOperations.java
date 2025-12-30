package com.self.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StudentOperations {

	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(new Student(1, "sambhaji", "Marathi", 60.3),
				new Student(2, "Tushar", "Hindi", 33.3), new Student(3, "Rahul", "English", 88.2),
				new Student(4, "Pooja", "Marathi", 65.6), new Student(5, "Pravin", "English", 81.2),
				new Student(5, "Pravin2", "English", 81.2), new Student(6, "Vikas", "Hindi", 55.9));

//		System.out.println(studentList.get(0));

		System.out.println("*****************1. Partition Student********************");
		Map<Boolean, List<Student>> partitionStudent = studentList.stream()
				.collect(Collectors.partitioningBy(student -> student.getPercentage() > 60));
		System.out.println(partitionStudent);
//		System.out.println("Less Than 60");
//		System.out.println(partitionStudent.get(false));
//		
//		System.out.println("Above than 60");
//		System.out.println(partitionStudent.get(true));

		System.out.println("\n*****************2. Top Performing 3 Student********************");
		List<Student> topThreeStudents = studentList.stream()
				.sorted(Comparator.comparingDouble(Student::getPercentage).reversed()).limit(3)
				.collect(Collectors.toList());
		System.out.println(topThreeStudents);

		System.out.println("\n*****************3. Name And Percentage Of Each Student********************");
		Map<String, Double> namePercentage = studentList.stream()
				.collect(Collectors.toMap(Student::getName, Student::getPercentage));
		System.out.println(namePercentage);

		System.out.println("\n*****************4. List Of Subject offered in college********************");
		Set<String> subjects = studentList.stream().map(Student::getSubject).collect(Collectors.toSet());
		System.out.println(subjects);

		System.out.println(
				"\n*****************5. Get highest, lowest and average percentage of students********************");
		DoubleSummaryStatistics specialStudents = studentList.stream()
				.collect(Collectors.summarizingDouble(Student::getPercentage));
		System.out.println(specialStudents);

		System.out.println("\n*****************6. Number of students count********************");
//		long count = studentList.stream().count();
		long count = studentList.stream().collect(Collectors.counting());
		System.out.println(count);

		System.out.println("\n*****************7. students grouped by subject********************");
		Map<String, List<Student>> studGrpBySub = studentList.stream()
				.collect(Collectors.groupingBy(Student::getSubject));
		System.out.println(studGrpBySub);

		System.out.println("\nSet unique");
		Set<Student> studentSet = new HashSet<Student>(studentList);
		System.out.println(studentSet.size());

		List<Student> uniqueStudent = studentList.stream().distinct().collect(Collectors.toList());
		System.out.println(uniqueStudent.size());
	}
}

class Student {
	private int id;
	private String name;
	private String subject;
	private double percentage;

	public Student() {
		super();
	}
	

	public Student(String name, double percentage) {
		this.name = name;
		this.percentage = percentage;
	}

	public Student(int id, String name, String subject, double percentage) {
		super();
		this.id = id;
		this.name = name;
		this.subject = subject;
		this.percentage = percentage;
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

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "\nStudent [id=" + id + ", name=" + name + ", subject=" + subject + ", percentage=" + percentage + "]";
	}
}
