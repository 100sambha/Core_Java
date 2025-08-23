package basicsOfJava;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Id : ");
		int id = scanner.nextInt();
		System.out.println("Enter Name : ");
		scanner.nextLine();
		String name = scanner.nextLine();
		System.out.println("Enter Status : ");
		char status = scanner.nextLine().charAt(0);
		System.out.println("Enter Salary : ");
		float salary = scanner.nextFloat();
		
		System.out.println("Your Details");
		System.out.println("Id - "+id);
		System.out.println("Name - "+name);
		System.out.println("Status - "+status);
		System.out.println("Salary - "+salary);
		System.out.println("Submited Success");
		scanner.close();
	}
}