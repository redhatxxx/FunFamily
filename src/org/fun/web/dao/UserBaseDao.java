package org.fun.web.dao;

import java.util.List;

import org.fun.web.common.AbstractUuidGenerate;
import org.fun.web.dao.bean.UserBaseBean;
import org.hibernate.Query;
import org.hibernate.SessionFactory;

public class UserBaseDao implements IUserBaseDao{

	private SessionFactory sessionfactory;
	
	@Override
	public UserBaseBean getUser(String userId) {
		// TODO Auto-generated method stub
		String gethql = "from UserBaseBean u where u.user_id = ?";
		Query query = this.sessionfactory.getCurrentSession().createQuery(gethql);
		query.setString(0, userId);
		return (UserBaseBean)query.uniqueResult();
	}

	@Override
	public UserBaseBean addUser(UserBaseBean user) {
		// TODO Auto-generated method stub
		String uuid = AbstractUuidGenerate.getUUID();
		user.setUser_id(uuid);
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

	@Override
	public boolean updateUser(UserBaseBean user) {
		// TODO Auto-generated method stub
		String updatehql = "update UserBaseBean u set u.user_name =? , u.user_password=? , u.sculptrue_path=? where u.user_id = ?";
		Query query = this.sessionfactory.getCurrentSession().createQuery(updatehql);
		query.setString(0, user.getUser_name());
		query.setString(1, user.getUser_password());
		query.setString(2, user.getSculptrue_path());
		query.setString(3, user.getUser_id());
		
		return (query.executeUpdate()>0);
	}
}
