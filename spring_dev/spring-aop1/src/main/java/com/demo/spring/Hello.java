package com.demo.spring;

import org.springframework.stereotype.Service;

@Service
public class Hello {

	public void sayHello()
	{
		System.out.println("This is a hello from AOP....");
	}
}
