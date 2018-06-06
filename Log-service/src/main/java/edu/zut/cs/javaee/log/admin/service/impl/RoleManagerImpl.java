package edu.zut.cs.javaee.log.admin.service.impl;

import org.springframework.stereotype.Component;

import edu.zut.cs.javaee.log.admin.domain.Role;
import edu.zut.cs.javaee.log.admin.service.RoleManager;
import edu.zut.cs.javaee.log.base.service.impl.GenericManagerImpl;

@Component
public class RoleManagerImpl extends GenericManagerImpl<Role, Long> implements RoleManager {

}
