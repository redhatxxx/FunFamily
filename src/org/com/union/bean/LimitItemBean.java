package org.com.union.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 主题限制条件类
 * 发表主题时的限制条件，如主题是否允许回复，回复是否游客可见等
 * 映射用户表sys_subject_limit
 * 
 * author by redhat;
 * date 2016.5.8
 * 
 * */
@Entity
@Table(name="sys_subject_limit")
public class LimitItemBean {
	
	@Id
	@Column(name="limit_id")
	public int getLimit_id() {
		return limit_id;
	}

	public void setLimit_id(int limit_id) {
		this.limit_id = limit_id;
	}

	@Column(name="limit_code")
	public String getLimit_code() {
		return limit_code;
	}

	public void setLimit_code(String limit_code) {
		this.limit_code = limit_code;
	}

	@Column(name="limit_name")
	public String getLimit_name() {
		return limit_name;
	}

	public void setLimit_name(String limit_name) {
		this.limit_name = limit_name;
	}

	@Column(name="limit_summary")
	public String getLimit_summary() {
		return limit_summary;
	}

	public void setLimit_summary(String limit_summary) {
		this.limit_summary = limit_summary;
	}

	private int limit_id;
	
	private String limit_code;
	
	private String limit_name;
	
	private String limit_summary;

}
