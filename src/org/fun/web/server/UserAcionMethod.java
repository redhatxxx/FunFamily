package org.fun.web.server;

import org.fun.web.dao.bean.UserBaseBean;

public interface UserAcionMethod {
	
	UserBaseBean getUser(String userId);
	UserBaseBean addUser(UserBaseBean user);
	UserBaseBean delUser(String userId);
}
