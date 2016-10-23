package org.fun.web.server;

import org.fun.web.dao.ActivityBaseDao;

public interface ActivityActionMethod {
	
	ActivityBaseDao addActivity(ActivityBaseDao dao);
	ActivityBaseDao getActivity(String activityId);
	ActivityBaseDao delActivity(String activityId);
}
