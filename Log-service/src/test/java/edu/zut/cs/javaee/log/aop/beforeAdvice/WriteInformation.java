package edu.zut.cs.javaee.log.aop.beforeAdvice;

public class WriteInformation {
	public void writeInfo() {
		System.out.println("This method"+this.getClass().getName());
	}
}
