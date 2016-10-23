package org.fun.web.server;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import org.fun.web.dao.ActivityBaseDao;
import org.fun.web.server.ActivityActionMethod;
import org.springframework.stereotype.Service;

@Service
public class ActivityActionServerIml implements ActivityActionMethod {

	private Map activityMap = new HashMap();
	
	private AtomicLong generator = new AtomicLong();
	
	public ActivityActionServerIml(){
		
		
	}
	@Override
	public ActivityBaseDao addActivity(ActivityBaseDao dao) {
		// TODO Auto-generated method stub
		Long actId = this.generator.incrementAndGet();
		String id = String.valueOf(actId);
		dao.setActivityId(id);
		activityMap.put(id, dao);
		return dao;
	}

	@Override
	public ActivityBaseDao getActivity(String activityId) {
		// TODO Auto-generated method stub
		ActivityBaseDao dao = (ActivityBaseDao)activityMap.get(activityId);
		return dao;
	}

	@Override
	public ActivityBaseDao delActivity(String activityId) {
		// TODO Auto-generated method stub
		activityMap.remove(activityId);
		return null;
	}

}
