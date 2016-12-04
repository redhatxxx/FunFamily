package org.fun.web.dao.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SYS_FUN_ACTIVITY")
public class ActivityBaseBean {
	
	private String activity_id;
	
	private String activity_name;
	
	private String activity_time;
	
	private String activity_markPrice;

	@Id
	@Column(name="activity_id")
	public String getActivity_id() {
		return activity_id;
	}

	public void setActivity_id(String activity_id) {
		this.activity_id = activity_id;
	}

	@Column(name="activity_name")
	public String getActivity_name() {
		return activity_name;
	}

	public void setActivity_name(String activity_name) {
		this.activity_name = activity_name;
	}

	@Column(name="activity_time")
	public String getActivity_time() {
		return activity_time;
	}

	public void setActivity_time(String activity_time) {
		this.activity_time = activity_time;
	}

	@Column(name="activity_markPrice")
	public String getActivity_markPrice() {
		return activity_markPrice;
	}

	public void setActivity_markPrice(String activity_markPrice) {
		this.activity_markPrice = activity_markPrice;
	}
	
}
