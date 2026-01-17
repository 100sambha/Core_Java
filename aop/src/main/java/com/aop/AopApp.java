package com.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Component;

public class AopApp {
	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AopAppConfig.class);
		Student std = context.getBean("student", Student.class);
		Employee emp = context.getBean("employee", Employee.class);
		std.study();
		emp.studySomething();		
		
		
		context.close();
	}
}



@Aspect
@Component
class Greet {
	
	@Before("execution(public * study*())")
	public void morning() {
		System.out.println("Good Morning");
	}
}



@Component
class Student {
	
	public void study() {
		System.out.println("Student Studying");
	}
}

@Component
class Employee {
	public int studySomething() {
		System.out.println("Employee Studying");
		return 0;
	}
}



@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = "com.aop")
class AopAppConfig {
}