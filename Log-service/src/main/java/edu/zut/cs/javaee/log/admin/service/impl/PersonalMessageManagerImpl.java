package edu.zut.cs.javaee.log.admin.service.impl;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.zut.cs.javaee.log.admin.dao.PersonalMessageDao;
import edu.zut.cs.javaee.log.admin.domain.PersonalMessage;
import edu.zut.cs.javaee.log.admin.service.PersonalMessageManager;
import edu.zut.cs.javaee.log.base.service.impl.GenericTreeManagerImpl;
@Service("personalmessageManager")
@Transactional
public class PersonalMessageManagerImpl extends GenericTreeManagerImpl<PersonalMessage, Long>implements PersonalMessageManager {
	
	PersonalMessageDao personalmessageDao;
	
	@Autowired
	public void setPersonalmessageDao(PersonalMessageDao personalmessageDao) {
		this.personalmessageDao = personalmessageDao;
		this.treeDao=this.personalmessageDao;
		this.dao=this.treeDao;
	}
	

}
