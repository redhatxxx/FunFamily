package org.fun.web.server;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import org.fun.web.dao.bean.UserBaseBean;
import org.springframework.stereotype.Service;

@Service
public class UserActionServerIml implements UserAcionMethod {

	private Map usersMap = new HashMap();
	
	private AtomicLong generator = new AtomicLong();
	
	@Override
	public UserBaseBean getUser(String userId) {
		// TODO Auto-generated method stub
		UserBaseBean user = (UserBaseBean)usersMap.get(userId);
		return user;
	}

	@Override
	public UserBaseBean addUser(UserBaseBean user) {
		// TODO Auto-generated method stub
		Long actId = this.generator.incrementAndGet();
		String id = String.valueOf(actId);
		user.setUser_id(id);
		usersMap.put(id, user);
		return user;
	}

	@Override
	public UserBaseBean delUser(String userId) {
		// TODO Auto-generated method stub
		usersMap.remove(userId);
		return null;
	}

}
