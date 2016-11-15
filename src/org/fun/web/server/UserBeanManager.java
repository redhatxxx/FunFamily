package org.fun.web.server;

import java.util.HashMap;
import java.util.Map;

import org.fun.web.common.AbstractUuidGenerate;
import org.fun.web.dao.UserBaseDao;

public class UserBeanManager implements IUserBeanManager {

	private Map usersMap = new HashMap();
	
	@Override
	public UserBaseDao getUser(String userId) {
		// TODO Auto-generated method stub
		UserBaseDao userdao = (UserBaseDao)usersMap.get(userId);
		return userdao;
	}

	@Override
	public UserBaseDao addUser(UserBaseDao user) {
		// TODO Auto-generated method stub
		String uuid = AbstractUuidGenerate.getUUID();
		user.setUser_id(uuid);
		usersMap.put(uuid, user);
		return user;
	}

	@Override
	public UserBaseDao delUser(String userId) {
		// TODO Auto-generated method stub
		usersMap.remove(userId);
		return null;
	}

}
