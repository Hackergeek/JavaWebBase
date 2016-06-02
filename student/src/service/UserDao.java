package service;

import entity.User;

public interface UserDao {
	
	//用户登录方法
	boolean userLogin(User u);
}
