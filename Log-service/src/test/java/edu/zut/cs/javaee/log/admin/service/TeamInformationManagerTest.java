package edu.zut.cs.javaee.log.admin.service;

import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.javaee.log.admin.domain.TeamInformation;
import edu.zut.cs.javaee.log.base.service.GenericTreeManagerTestCase;

public class TeamInformationManagerTest extends GenericTreeManagerTestCase<Long,TeamInformation,TeamInformationManager>{

	
	TeamInformationManager teamInformationManager;
	
	
	@Autowired
	public void setTeamInformationManager(TeamInformationManager teamInformationManager) {
		this.teamInformationManager = teamInformationManager;
		this.manager=this.teamInformationManager;
	}
	


	public TeamInformationManagerTest() {
		super(TeamInformation.class);
		// TODO Auto-generated constructor stub
	}

}
