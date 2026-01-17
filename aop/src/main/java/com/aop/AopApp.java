package com.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
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
		System.out.println("-----------------");
		emp.studySomething();
		System.out.println("-----------------");
		emp.studySomething("Ram");
		
		
		context.close();
	}
}



@Aspect
@Component
class Greet {

	@Before("execution(public * study*(..))")
	public void welcome(JoinPoint j) {
		System.out.println("Welcome "+(j.getArgs().length>0?j.getArgs()[0]:""));
	}
	
	@Before("myPointCut()")
	public void morning() {
		System.out.println("Good Morning");
	}
	
	@After("myPointCut()")
	public void thankyou() {
		System.out.println("Thank You");
	}
	
	@Pointcut("execution(public * study*())")
	public void myPointCut() {}
	
	
//	@Before("execution(void com.aop.*.*(..))")
//	public void welcome() {
//		System.out.println("Welcome");
//	}
	
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
	
	public String studySomething(String str) {
		System.out.println("Employee Studying "+str);
		return null;
	}
}



@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = "com.aop")
class AopAppConfig {
}