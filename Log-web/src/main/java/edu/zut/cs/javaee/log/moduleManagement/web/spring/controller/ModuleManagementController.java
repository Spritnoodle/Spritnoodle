package edu.zut.cs.javaee.log.moduleManagement.web.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.zut.cs.javaee.log.admin.domain.ModuleManagement;
import edu.zut.cs.javaee.log.admin.service.ModuleManagementManager;
import edu.zut.cs.javaee.log.base.web.spring.controller.GenericController;

/**
 * 
 * @author xiawenlaing
 * Controller
 */
@Controller
@RequestMapping("/moduleManagement")
public class ModuleManagementController extends GenericController<ModuleManagement, Long, ModuleManagementManager>{
	ModuleManagementManager moduleManagementManager;
	
	@RequestMapping(method = RequestMethod.GET, value = "/index.html")
	public String index() {
		String result = "/moduleManagement/index";
		return result;
	}

	@Autowired
	public void setModuleManagementManager(ModuleManagementManager moduleManagementManager) {
		this.moduleManagementManager = moduleManagementManager;
		this.manager = this.moduleManagementManager;
	}
}
