package edu.zut.cs.javaee.log.module.service;

import java.util.List;

import edu.zut.cs.javaee.log.module.domain.Module;

public interface MudoleManager {

	List<Module> findByName(String module_name);
}
