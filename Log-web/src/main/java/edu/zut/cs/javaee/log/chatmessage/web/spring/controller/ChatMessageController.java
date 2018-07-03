package edu.zut.cs.javaee.log.chatmessage.web.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.zut.cs.javaee.log.admin.domain.ChatMessage;
import edu.zut.cs.javaee.log.admin.service.ChatMessageManager;
import edu.zut.cs.javaee.log.base.web.spring.controller.GenericController;

@Controller
@RequestMapping("/chatmessage/chatmessage")
public class ChatMessageController extends GenericController<ChatMessage, Long, ChatMessageManager>{
	
	ChatMessageManager chatmessageManager;
	
	@RequestMapping(method = RequestMethod.GET, value = "/index.html")
	public String index() {
		String result = "/chatmessage/index";
		return result;
	}

	@Autowired
	public void setChatMessageManager(ChatMessageManager chatmessageManager) {
		this.chatmessageManager = chatmessageManager;
		this.manager = this.chatmessageManager;
	}
}
