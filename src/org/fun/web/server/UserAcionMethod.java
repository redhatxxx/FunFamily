package org.fun.web.server;

import org.fun.web.dao.UserBaseDao;

public interface UserAcionMethod {
	
	UserBaseDao getUser(String userId);
	UserBaseDao addUser(UserBaseDao user);
	UserBaseDao delUser(String userId);
}
