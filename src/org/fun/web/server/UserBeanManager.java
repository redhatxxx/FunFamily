package org.fun.web.server;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.fun.web.common.AbstractUuidGenerate;
import org.fun.web.dao.IUserBaseDao;
import org.fun.web.dao.bean.UserBaseBean;

public class UserBeanManager implements IUserBeanManager {

	private Map usersMap = new HashMap();
	
	private IUserBaseDao  userdao;
	
	@Override
	public UserBaseBean getUser(String userId) {
		// TODO Auto-generated method stub
		UserBaseBean userdao = (UserBaseBean)usersMap.get(userId);
		return userdao;
	}

	@Override
	public UserBaseBean addUser(UserBaseBean user) {
		// TODO Auto-generated method stub
		this.userdao.addUser(user);
		return user;
	}

	@Override
	public boolean delUser(String userId) {
		// TODO Auto-generated method stub
		return this.userdao.delUser(userId);
	}
	
	public void setUserdao(IUserBaseDao userdao) {
		this.userdao = userdao;
	}

	@Override
	public List<UserBaseBean> getUserList(List conditions) {
		// TODO Auto-generated method stub
		return this.userdao.getUserList(conditions);
	}

}
