package com.demo.spring;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Audience {
	@Pointcut("execution(* com.demo.spring.Performer.perform(..))")
	private void pcut(){}

	@Before("pcut()")
	public void takeSeat()
	{
		System.out.println("Audience takes seat......");
	}
	@Before("pcut()")
	public void switchofMobile()
	{
		System.out.println("Audience Switch off mobile......");
	}
	
	@AfterReturning("pcut()")
	public void applaud()
	{
		System.out.println("Clap Clap Clap......");
	}
	
	@AfterThrowing(throwing="t", pointcut="pcut()")
	public void demandRefund(Throwable t)
	{
		System.out.println("Audience demand Refund......");
	}
	
	@After("pcut()")
	public void stageClosed()
	{
		System.out.println("Audience Leaves......");
	}			
}
