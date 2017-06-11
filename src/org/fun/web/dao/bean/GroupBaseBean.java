package org.fun.web.dao.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * 团队持久化类
 * */
@Entity
@Table(name="SYS_FUN_GROUP")
public class GroupBaseBean {

	private String group_id;
	
	private String group_name;
	
	private String group_logo;
	
	private UserBaseBean group_leader;
	
	private Date group_create_time;
	
	private int group_activity_count;
		
	private int group_is_commercial;
	
	private String group_summary;
	
	private String group_qq;
	
	private String group_wechat;
	
	private String group_tieba_count;
	
	private String group_weibo_count;

	@Id
	@Column(name="group_id")
	public String getGroup_id() {
		return group_id;
	}

	public void setGroup_id(String group_id) {
		this.group_id = group_id;
	}

	@Column(name="group_name")
	public String getGroup_name() {
		return group_name;
	}

	public void setGroup_name(String group_name) {
		this.group_name = group_name;
	}

	@Column(name="group_logo")
	public String getGroup_logo() {
		return group_logo;
	}

	public void setGroup_logo(String group_logo) {
		this.group_logo = group_logo;
	}


	@OneToOne
	@JoinColumn(name="user_id")
	public UserBaseBean getGroup_leader() {
		return group_leader;
	}

	public void setGroup_leader(UserBaseBean group_leader) {
		this.group_leader = group_leader;
	}

	@Column(name="group_create_time",length=50)
	@Temporal(TemporalType.TIMESTAMP)
	public Date getGroup_create_time() {
		return group_create_time;
	}

	public void setGroup_create_time(Date group_create_time) {
		this.group_create_time = group_create_time;
	}

	@Column(name="group_activity_count")
	public int getGroup_activity_count() {
		return group_activity_count;
	}

	public void setGroup_activity_count(int group_activity_count) {
		this.group_activity_count = group_activity_count;
	}

	@Column(name="group_is_commercial")
	public int getGroup_is_commercial() {
		return group_is_commercial;
	}

	public void setGroup_is_commercial(int group_is_commercial) {
		this.group_is_commercial = group_is_commercial;
	}

	@Column(name="group_summary")
	public String getGroup_summary() {
		return group_summary;
	}

	public void setGroup_summary(String group_summary) {
		this.group_summary = group_summary;
	}

	@Column(name="group_qq")
	public String getGroup_qq() {
		return group_qq;
	}

	public void setGroup_qq(String group_qq) {
		this.group_qq = group_qq;
	}

	@Column(name="group_wechat")
	public String getGroup_wechat() {
		return group_wechat;
	}

	public void setGroup_wechat(String group_wechat) {
		this.group_wechat = group_wechat;
	}

	@Column(name="group_tieba_count")
	public String getGroup_tieba_count() {
		return group_tieba_count;
	}

	public void setGroup_tieba_count(String group_tieba_count) {
		this.group_tieba_count = group_tieba_count;
	}

	@Column(name="group_weibo_count")
	public String getGroup_weibo_count() {
		return group_weibo_count;
	}

	public void setGroup_weibo_count(String group_weibo_count) {
		this.group_weibo_count = group_weibo_count;
	}

}
