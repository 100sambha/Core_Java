package com.self.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Operations {
	public static void main(String[] args) {
//		List<String> list = Arrays.asList("Sambhji", "Tushar","Sambhji", "Tushar","Ram", "Tushar");
		
//		list.stream().collect(Collectors.groupingBy(l->l,Collectors.counting())).forEach((word,count)->System.out.println(word+" "+count));
		
//		list.stream().distinct().forEach(word->System.out.println(word));
		
//		list.stream().distinct().sorted().findFirst().ifPresent((word->System.out.println(word)));
		
//		long cnt = list.stream().distinct().count();
//		System.out.println(cnt);
		
//		int[] arrEle = {5,3,9,6,4,7,3};
//		int sum = Arrays.stream(arrEle).sum();
//		System.out.println(sum);
		
//		int[] sum2 = Arrays.stream(arrEle).sorted().toArray();
//		System.out.println(Arrays.toString(sum2));
		
		
		List<Student> studList = Arrays.asList(
				new Student(100, "Sambhaji", "Marathi", 99.9),
				new Student(96, "Pandhare", "Hindi", 35.9),
				new Student(63, "Shiv-Pratap Force", "Marathi", 83.9),
				new Student(78, "Jay Ho", "Marathi", 65.9),
				new Student(200, "Raje", "Marathi", 87.9),
				new Student(102, "Sarkar", "English", 96.01));
//		System.out.println(studList);
		
//		boolean std = studList.stream().allMatch((student)->student.getName().equals("Sambhaji"));
//		System.out.println(std);
		
//		std = studList.stream().anyMatch((student)->student.getName().equals("Sambhaji"));
//		System.out.println(std);
		
//		studList.stream().collect(Collectors.toMap(Student::getPercentage,Student::getName)).forEach((per,name)->System.out.println(name+" "+per));
//		studList.stream().sorted(Comparator.comparingDouble(stud->stud.getPercentage())).collect(Collectors.toMap(Student::getPercentage,Student::getName,(existing, replacement) -> existing, LinkedHashMap::new)).forEach((per,name)->System.out.println(name+" "+per));
//		studList.stream().collect(Collectors.partitioningBy(stud->stud.getPercentage()>50)).forEach((status,obj)->System.out.println(status+" "+obj));
		
//		studList.stream().collect(Collectors.groupingBy(stud->stud.getSubject())).forEach((sub,stud)->System.out.println(sub+" "+stud));
		
//		studList.stream().collect(Collectors.groupingBy(stud->stud.getSubject(),Collectors.counting())).forEach((sub,cnt)->System.out.println(sub+" "+cnt));
	}
}