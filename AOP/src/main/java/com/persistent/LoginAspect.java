package com.persistent;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class LoginAspect {
	@Before("execution(public void set*(*))")
	public void logSetMethod(JoinPoint jp)
	{
		System.out.println("setter method "+jp.toString()+" is called in object"+jp.getTarget());
	}
	@Pointcut("execution(public * get*(..))")
	public void logGetMethod()
	{
	}
	@After("logGetMethod( )")
	private void logMethod(JoinPoint jp)
	{
		System.out.println("getter method executed::"+jp.toShortString());
	}
	@AfterReturning(pointcut="logArgMethod(name)",returning = "str")
	public void logArgumentMethod(String name, String str)
	{
		str="String returned::"+str;
		System.out.println("argument is ::"+name);
		System.out.println("returned String is ::"+str);
	}
	@AfterThrowing(pointcut = "args(name)",throwing ="ex")
	public void logExceptionMethod(String name, Exception ex)
	{
		System.out.println("Exception throwing from aspect::"+ex.toString());
	}
	
	@Pointcut("args(name)")
	private void logArgMethod(String name)
	{
	}
}

