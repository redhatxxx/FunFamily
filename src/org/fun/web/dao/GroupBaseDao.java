package org.fun.web.dao;

import java.util.List;

import org.fun.web.dao.bean.ActivityBaseBean;
import org.fun.web.dao.bean.GroupBaseBean;
import org.hibernate.Query;
import org.hibernate.SessionFactory;

public class GroupBaseDao implements IGroupBaseDao {
	
	private SessionFactory sessionfactory;
	
	public void setSessionfactory(SessionFactory sessionfactory) {
		this.sessionfactory = sessionfactory;
	}

	@Override
	public GroupBaseBean addGroup(GroupBaseBean dao) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GroupBaseBean getGroup(String groupId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delGroup(String groupId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateGroup(GroupBaseBean dao) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<GroupBaseBean> getGroupList(List conditions) {
		// TODO Auto-generated method stub
		String hql = " from GroupBaseBean ";
		if(conditions!=null){
			
		}
		Query query = this.sessionfactory.getCurrentSession().createQuery(hql);
		
		return query.list();
	}

}
