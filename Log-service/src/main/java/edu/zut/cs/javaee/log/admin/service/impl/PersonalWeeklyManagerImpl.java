package edu.zut.cs.javaee.log.admin.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.zut.cs.javaee.log.admin.dao.PersonalWeeklyDao;
import edu.zut.cs.javaee.log.admin.domain.PersonalWeekly;
import edu.zut.cs.javaee.log.admin.service.PersonalWeeklyManager;
import edu.zut.cs.javaee.log.base.service.impl.GenericTreeManagerImpl;


@Service("personalWeeklyManager")
@Transactional
public class PersonalWeeklyManagerImpl extends GenericTreeManagerImpl<PersonalWeekly, Long> implements PersonalWeeklyManager{

	PersonalWeeklyDao personalWeeklyDao;
	
	@Autowired
	public void setPersonalWeeklyDao(PersonalWeeklyDao personalWeeklyDao) {
		this.personalWeeklyDao = personalWeeklyDao;
		this.treeDao=this.personalWeeklyDao;
		this.dao=this.treeDao;
	}
}
