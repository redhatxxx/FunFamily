package org.fun.web.server;

import java.util.List;

import org.fun.web.dao.bean.UserBaseBean;

public interface IUserBeanManager {
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
	boolean delUser(String userId);
	
	/**
	 * 获取用户list
	 * */
	List<UserBaseBean> getUserList(List conditions);
	
	/**
	 * 更新用户信息
	 * */
	boolean updateUser(UserBaseBean user);
}
