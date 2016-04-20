package org.com.union.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 用户与角色关系类
 * 映射用户表role_to_user
 * 
 * author by redhat;
 * date 2016.4.18
 * 
 * */
@Entity
@Table(name="role_to_user")
public class RoleToUserBean {

	@Id
	@Column(name="user_id")
	public int getUser_id() {
		return user_id;
	}
	
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	
	@Column(name="role_id")
	public int getRole_id() {
		return role_id;
	}
	
	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}
	@Column(name="create_date")
	public Date getCreate_date() {
		return create_date;
	}
	
	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}
	@Column(name="rtou_summary")
	public String getRtou_summary() {
		return rtou_summary;
	}
	public void setRtou_summary(String rtou_summary) {
		this.rtou_summary = rtou_summary;
	}
	
	private int user_id;
	
	private int role_id;
	
	private Date create_date;
	
	private String rtou_summary;
}
