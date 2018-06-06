package edu.zut.cs.javaee.log.admin.dao;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import edu.zut.cs.javaee.log.admin.dao.UserDao;
import edu.zut.cs.javaee.log.admin.domain.User;
import edu.zut.cs.javaee.log.base.dao.DaoConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DaoConfig.class)
class UserDaoTest {

	@Autowired
	UserDao userDao;

	@Test
	void test() {
		String username = "world";
		User query = new User();
		// List<User> result = this.userDao.findOne(null);

		User expectedUser = new User();
		// expectedUser.setUsername(username);
		// assertEquals(user, expectedUser);
		// assertEquals(user.getUsername(), expectedUser.getUsername());
	}
	
	/*
	@Test
	public void test() {
		
	}
	*/
}
