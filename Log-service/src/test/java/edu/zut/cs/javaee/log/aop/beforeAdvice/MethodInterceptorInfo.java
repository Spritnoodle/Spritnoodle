package edu.zut.cs.javaee.log.aop.beforeAdvice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MethodInterceptorInfo implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation onvocation) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("before"+this.getClass().getName( ));
		Object obj=onvocation.proceed();
		System.out.println("after"+this.getClass().getName());
		return null;
	}
		
}
