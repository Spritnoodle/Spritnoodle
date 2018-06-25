package edu.zut.cs.javaee.log.aop.beforeAdvice;

import org.springframework.aop.AfterAdvice;
import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;



public class TestBeforeAdvice {
	public static void main(String[] args) {
		WriteInformation writeInfo=new WriteInformation();
		writeInfo.writeInfo();
		
		System.out.println("..........");
		
		BeforeAdvice ba=new BeforInfo();
		AfterAdvice bb=new AfterInfo();
		ProxyFactory pf=new ProxyFactory();
		pf.setTarget(writeInfo);
		pf.addAdvice(ba);
		pf.addAdvice(bb);
		
		WriteInformation wi=(WriteInformation)pf.getProxy();
		wi.writeInfo();
	}
}
