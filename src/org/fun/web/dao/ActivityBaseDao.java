package org.fun.web.dao;

import java.util.List;

import org.fun.web.common.AbstractUuidGenerate;
import org.fun.web.dao.bean.ActivityBaseBean;
import org.hibernate.SessionFactory;
import org.hibernate.Query;

public class ActivityBaseDao implements IActivityBaseDao {

	private SessionFactory sessionfactory;
	
	public void setSessionfactory(SessionFactory sessionfactory) {
		this.sessionfactory = sessionfactory;
	}

	@Override
	public ActivityBaseBean addActivity(ActivityBaseBean dao) {
		// TODO Auto-generated method stub
		String uuid = AbstractUuidGenerate.getUUID();
		dao.setActivity_id(uuid);
		sessionfactory.getCurrentSession().save(dao);
		return dao;
	}

	@Override
	public ActivityBaseBean getActivity(String activityId) {
		// TODO Auto-generated method stub
		String gethql = "from ActivityBaseBean a where a.activity_id = ?";
		Query query = this.sessionfactory.getCurrentSession().createQuery(gethql);
		query.setString(0, activityId);
		return (ActivityBaseBean)query.uniqueResult();
	}

	@Override
	public boolean delActivity(String activityId) {
		// TODO Auto-generated method stub
		String delhql = "delete ActivityBaseBean a where a.activity_id = ?";
		Query query = this.sessionfactory.getCurrentSession().createQuery(delhql);
		query.setString(0, activityId);
		return (query.executeUpdate()>0);
	}

	@Override
	public boolean updateActivity(ActivityBaseBean dao) {
		// TODO Auto-generated method stub
		String updatehql = "update ActivityBaseBean u set u.activity_name =? , u.activity_time=? , u.activity_markPrice=? where u.activity_id = ?";
		Query query = this.sessionfactory.getCurrentSession().createQuery(updatehql);
		query.setString(0, dao.getActivity_name());
		query.setString(1, dao.getActivity_time());
		query.setString(2, dao.getActivity_markPrice());
		query.setString(3, dao.getActivity_id());
		
		return (query.executeUpdate()>0);
	}

	@Override
	public List<ActivityBaseBean> getActivityList(List conditions) {
		// TODO Auto-generated method stub
		String hql = " from ActivityBaseBean ";
		if(conditions!=null){
			
		}
		Query query = this.sessionfactory.getCurrentSession().createQuery(hql);
		
		return query.list();
	}
}
