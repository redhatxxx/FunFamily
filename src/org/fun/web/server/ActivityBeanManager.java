package org.fun.web.server;

import java.util.List;

import org.fun.web.dao.ActivityBaseDao;
import org.fun.web.dao.bean.ActivityBaseBean;
import org.springframework.stereotype.Service;

@Service
public class ActivityBeanManager implements IActivityBeanManager{
	
	ActivityBaseDao activitydao;
	
	public ActivityBaseDao getActivitydao() {
		return activitydao;
	}

	public void setActivitydao(ActivityBaseDao activitydao) {
		this.activitydao = activitydao;
	}

	@Override
	public ActivityBaseBean addActivity(ActivityBaseBean dao) {
		// TODO Auto-generated method stub
		return activitydao.addActivity(dao);
	}

	@Override
	public ActivityBaseBean getActivity(String activityId) {
		// TODO Auto-generated method stub
		return activitydao.getActivity(activityId);
	}

	@Override
	public boolean delActivity(String activityId) {
		// TODO Auto-generated method stub
		return activitydao.delActivity(activityId);
	}

	@Override
	public boolean updateActivity(ActivityBaseBean activity) {
		// TODO Auto-generated method stub
		return activitydao.updateActivity(activity);
	}

	@Override
	public List<ActivityBaseBean> getActivityList(List conditions) {
		// TODO Auto-generated method stub
		return activitydao.getActivityList(conditions);
	}

}
