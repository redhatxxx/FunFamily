package org.fun.web.server;

import java.util.List;

import org.fun.web.dao.bean.ActivityBaseBean;

public interface IActivityBeanManager {
	ActivityBaseBean addActivity(ActivityBaseBean dao);
	ActivityBaseBean getActivity(String activityId);
	boolean delActivity(String activityId);
	boolean updateActivity(ActivityBaseBean activity);
	List<ActivityBaseBean> getActivityList(List conditions);
}
