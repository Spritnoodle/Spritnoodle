package edu.zut.cs.javaee.log.log.service;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class log4eTest {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = LogManager.getLogger(log4eTest.class.getName());

	public static void main(String[] args) {  
        // TODO Auto-generated method stub  
        int a=10;  
        int b=31;  
        int sum=add(a,b);  
          
        System.out.println("a + b = " + sum);  
    }  
	
	private static int add(int a, int b) {  
        // TODO Auto-generated method stub  
        return a + b;  
    }
}
