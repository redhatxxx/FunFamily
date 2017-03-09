package org.fun.web.server;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.fun.web.common.AbstractEncryptFunction;
import org.fun.web.common.AbstractUuidGenerate;
import org.fun.web.dao.IUserBaseDao;
import org.fun.web.dao.bean.UserBaseBean;

public class UserBeanManager implements IUserBeanManager {

	private IUserBaseDao  userdao;
	
	@Override
	public UserBaseBean getUser(String userId) {
		// TODO Auto-generated method stub
		UserBaseBean user = this.userdao.getUser(userId);
		return user;
	}

	@Override
	public UserBaseBean addUser(UserBaseBean user) {
		// TODO Auto-generated method stub
		String ps = AbstractEncryptFunction.encryptUserPassword(user.getUser_password());
		user.setUser_password(ps);
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

	@Override
	public boolean updateUser(UserBaseBean user) {
		// TODO Auto-generated method stub
		return this.userdao.updateUser(user);
	}

	@Override
	public Map findUserByNameAndPassWord(String username,String password){
		// TODO Auto-generated method stub
		String ps = AbstractEncryptFunction.encryptUserPassword(password);
		return this.userdao.findUserWithResult(username,ps);
	}

}
