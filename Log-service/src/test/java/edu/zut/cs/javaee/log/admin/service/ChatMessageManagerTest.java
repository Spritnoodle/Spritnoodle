package edu.zut.cs.javaee.log.admin.service;

import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.javaee.log.admin.domain.ChatMessage;
import edu.zut.cs.javaee.log.base.service.GenericTreeManagerTestCase;

public class ChatMessageManagerTest extends GenericTreeManagerTestCase<Long,ChatMessage,ChatMessageManager>{

	
	ChatMessageManager chatmessageManager;
	
	
	@Autowired
	public void setChatMessageManager(ChatMessageManager chatmessageManager) {
		this.chatmessageManager = chatmessageManager;
		this.manager=this.chatmessageManager;
	}
	
	public ChatMessageManagerTest() {
		super(ChatMessage.class);
		// TODO Auto-generated constructor stub
	}

}
