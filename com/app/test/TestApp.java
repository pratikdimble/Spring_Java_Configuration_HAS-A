package com.app.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext c=new 
								AnnotationConfigApplicationContext(JavaConfig.class);
		Employee e=(Employee)c.getBean("empObj");
		System.out.println(e);
	}

}
