package edu.zut.cs.javaee.log.admin.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.zut.cs.javaee.log.admin.dao.TeamInformationDao;
import edu.zut.cs.javaee.log.admin.domain.TeamInformation;
import edu.zut.cs.javaee.log.admin.service.TeamInformationManager;
import edu.zut.cs.javaee.log.base.service.impl.GenericTreeManagerImpl;

@Service("teamInformationManager")
@Transactional
public class TeamInformationManagerImpl extends GenericTreeManagerImpl<TeamInformation,Long> implements TeamInformationManager{
	
	TeamInformationDao teamInformationDao;

	@Autowired
	public void setTeamInformationDao(TeamInformationDao teamInformationDao) {
		this.teamInformationDao = teamInformationDao;
		this.treeDao=this.teamInformationDao;
		this.dao=this.treeDao;
	}
	
	
}