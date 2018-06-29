package edu.zut.cs.javaee.log.personalmessage.web.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.zut.cs.javaee.log.admin.domain.PersonalMessage;
import edu.zut.cs.javaee.log.admin.service.PersonalMessageManager;
import edu.zut.cs.javaee.log.base.web.spring.controller.GenericController;

@Controller
@RequestMapping("/personalmessage/personalmessage")

public class PersonalMessageController extends GenericController<PersonalMessage, Long, PersonalMessageManager> {
    PersonalMessageManager personalmessageManager;
	
	@RequestMapping(method = RequestMethod.GET, value = "/index.html")
	public String index() {
		String result = "/personalmessage/index";
		return result;
	}

	@Autowired
	public void setPersonalMessageManager(PersonalMessageManager personalmessageManager) {
		this.personalmessageManager = personalmessageManager;
		this.manager = this.personalmessageManager;
	}

}
