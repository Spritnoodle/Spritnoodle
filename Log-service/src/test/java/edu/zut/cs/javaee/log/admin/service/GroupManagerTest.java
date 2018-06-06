package edu.zut.cs.javaee.log.admin.service;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import edu.zut.cs.javaee.log.admin.domain.Group;
import edu.zut.cs.javaee.log.admin.service.GroupManager;
import edu.zut.cs.javaee.log.base.service.GenericTreeManagerTestCase;

public class GroupManagerTest extends GenericTreeManagerTestCase<Long, Group, GroupManager> {

	GroupManager groupManager;

	@Autowired
	public void setGroupManager(GroupManager groupManager) {
		this.groupManager = groupManager;
		this.manager = this.groupManager;
	}

	public GroupManagerTest() {
		super(Group.class);
	}

}
