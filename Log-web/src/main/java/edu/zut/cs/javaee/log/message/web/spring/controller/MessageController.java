package edu.zut.cs.javaee.log.message.web.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.zut.cs.javaee.log.admin.domain.Message;
import edu.zut.cs.javaee.log.admin.service.MessageManager;
import edu.zut.cs.javaee.log.base.web.spring.controller.GenericController;

/**
 * 
 * @author yifei
 *
 */
@Controller
// 地址映射
@RequestMapping("/message/message")
public class MessageController extends GenericController<Message, Long, MessageManager> {

	MessageManager messageManager;

	@RequestMapping(method = RequestMethod.GET, value = "/index.html")
	public String index() {
		String result = "/message/index";
		return result;
	}

	@Autowired
	public void setMessageManager(MessageManager messageManager) {
		this.messageManager = messageManager;
		this.manager = this.messageManager;
	}
}
