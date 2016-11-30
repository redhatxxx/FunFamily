package org.fun.web.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.fun.web.common.AbstractUuidGenerate;
import org.fun.web.dao.bean.UserBaseBean;
import org.hibernate.Query;
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
	public boolean delUser(String userId) {
		// TODO Auto-generated method stub
		String hql = "delete UserBaseBean u where u.user_id=? ";
		Query query = this.sessionfactory.getCurrentSession().createQuery(hql);
		query.setString(0, userId);
		return (query.executeUpdate()>0);
	}
	
	public void setSessionfactory(SessionFactory sessionfactory) {
		this.sessionfactory = sessionfactory;
	}

	@Override
	public List<UserBaseBean> getUserList(List conditions) {
		// TODO Auto-generated method stub
		String hql = " from UserBaseBean ";
		if(conditions!=null){
			
		}
		Query query = this.sessionfactory.getCurrentSession().createQuery(hql);
		
		return query.list();
	}
}
