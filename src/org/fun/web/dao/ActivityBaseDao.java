package org.fun.web.dao;

public class ActivityBaseDao {
	private String activityName;
	
	private String activityTime;
	
	private String activityId;
	
	private String markPrice;

	public String getActivityName() {
		return activityName;
	}

	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public String getActivityTime() {
		return activityTime;
	}

	public void setActivityTime(String activityTime) {
		this.activityTime = activityTime;
	}

	public String getActivityId() {
		return activityId;
	}

	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getMarkPrice() {
		return markPrice;
	}

	public void setMarkPrice(String markPrice) {
		this.markPrice = markPrice;
	}
	
}
