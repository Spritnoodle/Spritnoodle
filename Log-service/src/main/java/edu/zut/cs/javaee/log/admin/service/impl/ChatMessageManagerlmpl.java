package edu.zut.cs.javaee.log.admin.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.zut.cs.javaee.log.admin.dao.ChatMessageDao;
import edu.zut.cs.javaee.log.admin.domain.ChatMessage;
import edu.zut.cs.javaee.log.admin.service.ChatMessageManager;
import edu.zut.cs.javaee.log.base.service.impl.GenericTreeManagerImpl;

@Service("chatmessageManager")
@Transactional
public class ChatMessageManagerlmpl extends GenericTreeManagerImpl<ChatMessage,Long> implements ChatMessageManager{
	
	ChatMessageDao chatmessageDao;

	@Autowired
	public void setChatMessageDao(ChatMessageDao chatmessageDao) {
		this.chatmessageDao = chatmessageDao;
		this.treeDao=this.chatmessageDao;
		this.dao=this.treeDao;
	}
	
	
}

