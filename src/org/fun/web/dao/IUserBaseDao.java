package org.fun.web.dao;

import org.fun.web.dao.bean.UserBaseBean;

public interface IUserBaseDao {
	/**
	 * 根据ID获取用户对象
	 * */
	UserBaseBean getUser(String userId);
	
	/**
	 * 新添加一个用户对象
	 * */
	UserBaseBean addUser(UserBaseBean user);
	
	/**
	 * 删除用户对象
	 * */
	UserBaseBean delUser(String userId);
}
