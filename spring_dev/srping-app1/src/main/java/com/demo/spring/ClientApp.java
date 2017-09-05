package com.demo.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");
				
		Mail mail = (Mail)ctx.getBean("mail");
		for(String str: mail.getToAddress())
		{
			System.out.println(str);	
		}
		
	}

}
