package edu.zut.cs.javaee.log.admin.service;

import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.javaee.log.admin.domain.ModuleManagement;
import edu.zut.cs.javaee.log.base.service.GenericTreeManagerTestCase;

public class ModuleManagementTest extends GenericTreeManagerTestCase<Long,ModuleManagement,ModuleManagementManager>{

	
	ModuleManagementManager modulemanagementManager;
	
	
	@Autowired
	public void setMessageManager(ModuleManagementManager modulemanagementManager) {
		this.modulemanagementManager = modulemanagementManager;
		this.manager = this.modulemanagementManager;
	}
	


	public ModuleManagementTest() {
		super(ModuleManagement.class);
		// TODO Auto-generated constructor stub
	}

}
