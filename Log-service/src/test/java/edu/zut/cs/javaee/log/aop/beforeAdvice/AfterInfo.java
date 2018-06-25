package edu.zut.cs.javaee.log.aop.beforeAdvice;

import java.lang.reflect.Method;

import org.springframework.aop.AfterAdvice;
import org.springframework.aop.MethodBeforeAdvice;

public class AfterInfo implements  AfterAdvice{
	public void before(Method method,Object[] arg1,Object arg2) throws Throwable{
		System.out.println("aftermethod"+method.getName());
	}
}
