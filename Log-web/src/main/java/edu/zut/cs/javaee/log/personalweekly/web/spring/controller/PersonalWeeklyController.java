package edu.zut.cs.javaee.log.personalweekly.web.spring.controller;

import edu.zut.cs.javaee.log.base.web.spring.controller.GenericController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.zut.cs.javaee.log.admin.domain.PersonalWeekly;
import edu.zut.cs.javaee.log.admin.service.PersonalWeeklyManager;

/**
 * 
 * @author dell
 *
 */
@Controller
//地址映射
@RequestMapping("/personalweekly/personalweekly")
public class PersonalWeeklyController extends GenericController<PersonalWeekly, Long, PersonalWeeklyManager> {
PersonalWeeklyManager personalweeklyManager;
	
	@RequestMapping(method = RequestMethod.GET, value = "/index.html")
	public String index() {
		String result = "/personalweekly/index";
		return result;
	}

	@Autowired
	public void setPersonalWeeklyManager(PersonalWeeklyManager personalweeklyManager) {
		this.personalweeklyManager = personalweeklyManager;
		this.manager = this.personalweeklyManager;
	}
}
