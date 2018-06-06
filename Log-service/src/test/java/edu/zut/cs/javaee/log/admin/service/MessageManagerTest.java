package edu.zut.cs.javaee.log.admin.service;

import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.javaee.log.admin.domain.Message;
import edu.zut.cs.javaee.log.base.service.GenericTreeManagerTestCase;

public class MessageManagerTest extends GenericTreeManagerTestCase<Long,Message,MessageManager>{

	
	MessageManager messageManager;
	
	
	@Autowired
	public void setMessageManager(MessageManager messageManager) {
		this.messageManager = messageManager;
		this.manager=this.messageManager;
	}
	


	public MessageManagerTest() {
		super(Message.class);
		// TODO Auto-generated constructor stub
	}

}
