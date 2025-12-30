package com.self.string;

public class InterviewQuestion2 {
	public static void main(String[] args) {
		String s1 = "Sambhaji";
		s1.concat("Pandhare");
		System.out.println(s1);							//Sambhaji

		
		s1 = s1.concat("Pandhare");
		System.out.println(s1); 						//Sambhaji Pandhare
		
		
		int x = 5;
		System.out.println(x++ + ++x - x--);			//5 + 6 - 6 =5
		
		
	}
}
