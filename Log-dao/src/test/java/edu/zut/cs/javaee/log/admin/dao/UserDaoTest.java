package edu.zut.cs.javaee.log.admin.dao;

import edu.zut.cs.javaee.log.admin.domain.User;
import edu.zut.cs.javaee.log.base.dao.GenericDaoTestCase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserDaoTest extends GenericDaoTestCase<Long, User, UserDao> {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = LogManager.getLogger(UserDaoTest.class.getName());

	@Autowired
	UserDao userDao;

	@Test
	public void testFindAll() {

		List<User> result = this.userDao.findAll();
		if (logger.isInfoEnabled()) {
			logger.info("testFindAll() - List<User> result={}", result); //$NON-NLS-1$
		}

	}

}
