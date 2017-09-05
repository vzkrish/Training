package com.demo.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
				Hello hello = (Hello) ctx.getBean("hello");
				
		hello.sayHello();
	}

}
