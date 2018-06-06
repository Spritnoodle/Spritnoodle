package edu.zut.cs.javaee.log.admin.service;

import java.util.List;

import edu.zut.cs.javaee.log.admin.domain.User;
import edu.zut.cs.javaee.log.base.service.GenericManager;

public interface UserManager extends GenericManager<User, Long> {

	List<User> findAll();

	User findbyUsername(String username);
}
