package service.impl;

import junit.framework.Assert;

import org.junit.Test;

import service.UserDao;
import entity.User;

public class TestUserDaoImpl {
	@Test
	public void testUserLogin() {
		User user = new User("2", "skyward", "123456", 1, "1");
		UserDao userDao = new UserDaoImpl();
		Assert.assertEquals(false, userDao.userLogin(user));
	}
}
