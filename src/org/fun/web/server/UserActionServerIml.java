package org.fun.web.server;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import org.fun.web.dao.UserBaseDao;
import org.springframework.stereotype.Service;

@Service
public class UserActionServerIml implements UserAcionMethod {

	private Map usersMap = new HashMap();
	
	private AtomicLong generator = new AtomicLong();
	
	@Override
	public UserBaseDao getUser(String userId) {
		// TODO Auto-generated method stub
		UserBaseDao user = (UserBaseDao)usersMap.get(userId);
		return user;
	}

	@Override
	public UserBaseDao addUser(UserBaseDao user) {
		// TODO Auto-generated method stub
		Long actId = this.generator.incrementAndGet();
		String id = String.valueOf(actId);
		user.setUser_id(id);
		usersMap.put(id, user);
		return user;
	}

	@Override
	public UserBaseDao delUser(String userId) {
		// TODO Auto-generated method stub
		usersMap.remove(userId);
		return null;
	}

}
