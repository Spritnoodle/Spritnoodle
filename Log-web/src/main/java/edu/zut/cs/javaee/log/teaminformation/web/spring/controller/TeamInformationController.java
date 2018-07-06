package edu.zut.cs.javaee.log.teaminformation.web.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.zut.cs.javaee.log.admin.domain.PersonalWeekly;
import edu.zut.cs.javaee.log.admin.domain.TeamInformation;
import edu.zut.cs.javaee.log.admin.service.PersonalWeeklyManager;
import edu.zut.cs.javaee.log.admin.service.TeamInformationManager;
import edu.zut.cs.javaee.log.base.web.spring.controller.GenericController;


/**
 * 
 * @author heads43
 *
 */

// 地址映射
@Controller
@RequestMapping("/teaminformation/teaminformation")
public class TeamInformationController extends GenericController<TeamInformation, Long, TeamInformationManager> {
TeamInformationManager teaminformationManager;
	
	@RequestMapping(method = RequestMethod.GET, value = "/index.html")
	public String index() {
		String result = "/teaminformation/index";
		return result;
	}

	@Autowired
	public void setTeamInformationManager(TeamInformationManager teaminformationManager) {
		this.teaminformationManager = teaminformationManager;
		this.manager = this.teaminformationManager;
	}
}
