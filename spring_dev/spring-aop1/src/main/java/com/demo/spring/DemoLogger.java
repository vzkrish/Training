package com.demo.spring;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class DemoLogger {

	@Before("execution (* com.demo.spring.Hello.sayHello(..))")
	public void logBefore()
	{
		System.out.println("Before Logging......");
	}
	
	@AfterReturning("execution(* com.demo.spring.Hello.sayHello(..))")
	public void logAfter()
	{
		System.out.println("After Logging......");
	}	
}
