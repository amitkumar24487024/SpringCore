package com.spring.core;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("com/spring/core/config.xml");
		Student student = (Student) ctx.getBean("student");
		System.out.println(student);
		student.getListOfLang().forEach((n) -> {
			String x = n.toUpperCase();
			System.out.println(x);
		});

		student.getVisitedCountries().forEach((n) -> System.out.println(n));
		ctx.registerShutdownHook();
	}

}
