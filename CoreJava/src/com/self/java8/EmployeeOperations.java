package com.self.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EmployeeOperations {
	public static void main(String[] args) {
		List<Employee> empList = Arrays.asList(
						new Employee(1,"Sambhai",25,"Male","ETC",2022,62222.3),
						new Employee(2,"ABC",64,"Male","CE",2020,32123.45),
						new Employee(3,"XYZ",78,"Female","IT",2000,4120.04),
						new Employee(4,"PQR",45,"Female","HR",2008,8974),
						new Employee(5,"IJK",99,"Male","CE",2002,88896),
						new Employee(6,"LMN",24,"Female","ETC",2021,9654.8)
				);
		System.out.println(empList);
		
//		Map<String,List<Employee>> empByDept = empList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
//		System.out.println(empByDept);
		
		System.out.println("*************1. Emp By Dept And Count*************");
		Map<String,Long> empByDeptAndCount = empList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		System.out.println(empByDeptAndCount);
		
		System.out.println("\n*************2. Average salary of male and female employees*************");
		Map<String, Double> ageSalaryByGen = empList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(ageSalaryByGen);
		
		System.out.println("\n*************3. Highest paid employee in the organization*************");
		Optional<Employee> e = empList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
		System.out.println(e.get());

		System.out.println("\n*************4. Senior most employee in the organization*************");
		Optional<Employee> mostSeniorEmployee = empList.stream().sorted(Comparator.comparingInt(Employee::getYearOfJoining)).findFirst();
		System.out.println(mostSeniorEmployee.get());
		
		System.out.println("\n*************5. Average age of each department in the organization*************");
		Map<String, Double> avgAgeByDept = empList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getAge)));
		System.out.println(avgAgeByDept);
		
		System.out.println("\n*************6. Most youngest employee in the organization*************");
		Optional<Employee> youngEmployee = empList.stream().sorted(Comparator.comparingInt(Employee::getAge)).findFirst();
		System.out.println(youngEmployee.get());
		
		System.out.println("\n*************7. Number of employees in each department*************");
		Map<String, Long> numOfEmpInDept = empList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		System.out.println(numOfEmpInDept);
		
		System.out.println("\n*************8. Emp Count By Gender*************");
		Map<String, Long> empCountByGender = empList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println(empCountByGender);
		
		
		System.out.println(IntStream.range(0,5).sum());				//0+1+2+3+4=10
		System.out.println(IntStream.range(10,12).sum());			//10+11=21
	}
}

class Employee {
	private int id;
	private String name;
	private int age;
	private String gender;
	private String department;
	private int yearOfJoining;
	private double salary;
	
	public Employee() {
		super();
	}
	
	public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getYearOfJoining() {
		return yearOfJoining;
	}
	public void setYearOfJoining(int yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", department="
				+ department + ", yearOfJoining=" + yearOfJoining + ", salary=" + salary + "]";
	}	
}
