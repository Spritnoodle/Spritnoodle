package edu.zut.cs.javaee.log.admin.service;

import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.javaee.log.admin.service.PersonalWeeklyManager;
import edu.zut.cs.javaee.log.admin.domain.PersonalWeekly;
import edu.zut.cs.javaee.log.base.service.GenericTreeManagerTestCase;

public class PersonalWeeklyManagerTest extends GenericTreeManagerTestCase<Long,PersonalWeekly,PersonalWeeklyManager>{
	

	public PersonalWeeklyManagerTest() {
		// TODO Auto-generated constructor stub
		super(PersonalWeekly.class);
	}
	
	PersonalWeeklyManager personlaWeeklyManager;
	
	@Autowired
	public void setPersonalWeeklyManager(PersonalWeeklyManager personlaWeeklyManager) {
		this.personlaWeeklyManager=personlaWeeklyManager;
		this.manager=this.personlaWeeklyManager;
		
	}

	
	
}
