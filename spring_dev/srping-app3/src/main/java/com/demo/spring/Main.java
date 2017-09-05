package com.demo.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");
		
		EmpService service =(EmpService)ctx.getBean("empService");
		
		System.out.println(service.regsiterEmp(100, "Krishnam Raju -- Demo3"
				+ ""
				+ ""
				+ ""
				+ ""
				+ ""
				+ ""
				+ "", "Hyd", 20000));

	}

}
