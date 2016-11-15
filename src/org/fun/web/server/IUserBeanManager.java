package org.fun.web.server;

import org.fun.web.dao.UserBaseDao;

public interface IUserBeanManager {
	/**
	 * 根据ID获取用户对象
	 * */
	UserBaseDao getUser(String userId);
	
	/**
	 * 新添加一个用户对象
	 * */
	UserBaseDao addUser(UserBaseDao user);
	
	/**
	 * 删除用户对象
	 * */
	UserBaseDao delUser(String userId);
}
