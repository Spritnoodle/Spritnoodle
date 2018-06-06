package edu.zut.cs.javaee.log.admin.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.zut.cs.javaee.log.admin.dao.ModuleManagementDao;
import edu.zut.cs.javaee.log.admin.domain.ModuleManagement;
import edu.zut.cs.javaee.log.admin.service.ModuleManagementManager;
import edu.zut.cs.javaee.log.base.service.impl.GenericTreeManagerImpl;


@Service("moduleManagementManager")
@Transactional
public class ModuleManagementImpl extends GenericTreeManagerImpl<ModuleManagement,Long> implements ModuleManagementManager{
	
	ModuleManagementDao moduledao;

	@Autowired
	public void setModuleManagementDao(ModuleManagementDao moduledao) {
		this.moduledao = moduledao;
		this.treeDao=this.moduledao;
		this.dao=this.treeDao;
	}
	
	
}
