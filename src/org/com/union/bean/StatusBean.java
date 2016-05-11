package org.com.union.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * 状态类
 * 枚举用户团体活动等的状态信息
 * 映射用户表sys_element_status
 * 
 * author by redhat;
 * date 2016.5.18
 * 
 * */
@Entity
@Table(name="sys_element_status")
public class StatusBean {
	
	@Id
	@Column(name = "status_id")
	@GeneratedValue
	public int getStatus_id() {
		return status_id;
	}

	public void setStatus_id(int status_id) {
		this.status_id = status_id;
	}

	@Column(name = "status_code")
	public String getStatus_code() {
		return status_code;
	}

	public void setStatus_code(String status_code) {
		this.status_code = status_code;
	}

	@Column(name = "status_name")
	public String getStatus_name() {
		return status_name;
	}

	public void setStatus_name(String status_name) {
		this.status_name = status_name;
	}

	@Column(name = "status_summary")
	public String getStatus_summary() {
		return status_summary;
	}

	public void setStatus_summary(String status_summary) {
		this.status_summary = status_summary;
	}

	private int status_id;
	
	private String status_code;
	
	private String status_name;
	
	private String status_summary;
}
