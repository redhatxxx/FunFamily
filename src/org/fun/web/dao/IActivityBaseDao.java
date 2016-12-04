package org.fun.web.dao;

import java.util.List;

import org.fun.web.dao.bean.ActivityBaseBean;

public interface IActivityBaseDao {
	ActivityBaseBean addActivity(ActivityBaseBean dao);
	ActivityBaseBean getActivity(String activityId);
	boolean delActivity(String activityId);
	boolean updateActivity(ActivityBaseBean dao);
	List<ActivityBaseBean> getActivityList(List conditions);
}
