package service.impl;

import junit.framework.Assert;

import org.junit.Test;

import service.UserDao;
import entity.User;

public class TestUserDaoImpl {
	@Test
	public void testUserLogin() {
		User user = new User(1, "skyward", "123456");
		UserDao userDao = new UserDaoImpl();
		Assert.assertEquals(true, userDao.userLogin(user));
	}
}
