package edu.zut.cs.javaee.log.admin.service;

import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.javaee.log.admin.domain.PersonalMessage;
import edu.zut.cs.javaee.log.base.service.GenericTreeManagerTestCase;

public class PersonalMessageManagerTest extends GenericTreeManagerTestCase<Long,PersonalMessage,PersonalMessageManager>{

	
	PersonalMessageManager personalmessageManager;
	
	
	@Autowired
	public void setPersonalMessageManager(PersonalMessageManager personalmessageManager) {
		this.personalmessageManager = personalmessageManager;
		this.manager=this.personalmessageManager;
	}
	


	public PersonalMessageManagerTest() {
		super(PersonalMessage.class);
		// TODO Auto-generated constructor stub
	}

}
