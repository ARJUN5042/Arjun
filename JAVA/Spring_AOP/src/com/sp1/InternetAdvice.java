package com.sp1;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

public class InternetAdvice implements MethodBeforeAdvice, AfterReturningAdvice, MethodInterceptor
{
	CustomerOwner custowner;

	public CustomerOwner getCustowner() {
		return custowner;
	}

	public void setCustowner(CustomerOwner custowner) {
		this.custowner = custowner;
	}

	@Override
	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable 
	{
		System.out.println("Now Start BeforeAdvice....");
		custowner.login();
	}

	@Override
	public void afterReturning(Object arg0, Method arg1, Object[] arg2, Object arg3) throws Throwable 
	{
		System.out.println("Now Stop After Returning advice...");
		custowner.logout();
	}

	@Override
	public Object invoke(MethodInvocation m) throws Throwable 
	{
		System.out.println("Now Start Processing....");
		m.proceed();
		System.out.println("Now Stop processing....");
		
		return null;
	}
}
