package org.fun.web.dao;

import java.util.HashMap;
import java.util.Map;

import org.fun.web.common.AbstractUuidGenerate;
import org.fun.web.dao.bean.UserBaseBean;
import org.hibernate.SessionFactory;

public class UserBaseDao implements IUserBaseDao{

	private Map usersMap = new HashMap();
	
	private SessionFactory sessionfactory;
	
	@Override
	public UserBaseBean getUser(String userId) {
		// TODO Auto-generated method stub
		UserBaseBean userdao = (UserBaseBean)usersMap.get(userId);
		return userdao;
	}

	@Override
	public UserBaseBean addUser(UserBaseBean user) {
		// TODO Auto-generated method stub
		String uuid = AbstractUuidGenerate.getUUID();
		user.setUser_id(uuid);
		usersMap.put(uuid, user);
		sessionfactory.getCurrentSession().save(user);
		return user;
	}

	@Override
	public UserBaseBean delUser(String userId) {
		// TODO Auto-generated method stub
		usersMap.remove(userId);
		return null;
	}
	
	public void setSessionfactory(SessionFactory sessionfactory) {
		this.sessionfactory = sessionfactory;
	}
}
