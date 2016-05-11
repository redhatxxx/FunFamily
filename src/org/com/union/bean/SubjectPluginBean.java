package org.com.union.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
/**
 * 外挂人员类
 * 保存外挂人员基本信息
 * 映射用户表sys_subject_plugins
 * 
 * 主题subject通过subject_id和报名用户的user_id检索所有的外挂
 * 主题subject和该表之间存在中间表“user_join_subject”,该表与中间表是一对一关系
 * author by redhat;
 * date 2016.4.18
 * 
 * */
@Entity
@Table(name="sys_subject_plugins")
@IdClass(value=KeyUserAndSubject.class)
public class SubjectPluginBean {

	@Column(name="plugin_name")
	public String getPlugin_name() {
		return plugin_name;
	}

	public void setPlugin_name(String plugin_name) {
		this.plugin_name = plugin_name;
	}

	@Column(name="plugin_connect_phone")
	public int getPlugin_connect_phone() {
		return plugin_connect_phone;
	}

	public void setPlugin_connect_phone(int plugin_connect_phone) {
		this.plugin_connect_phone = plugin_connect_phone;
	}
	
	@Column(name="plugin_summary")
	public String getPlugin_summary() {
		return plugin_summary;
	}

	public void setPlugin_summary(String plugin_summary) {
		this.plugin_summary = plugin_summary;
	}

	@Id
	@Column(name="join_user_id")
	public int getJoin_user_id() {
		return join_user_id;
	}

	public void setJoin_user_id(int join_user_id) {
		this.join_user_id = join_user_id;
	}
	
	@Id
	@Column(name="subject_id")
	public int getSubject_id() {
		return subject_id;
	}

	public void setSubject_id(int subject_id) {
		this.subject_id = subject_id;
	}

	private int join_user_id;
	
	private int subject_id;
	
	private String plugin_name;
	
	private int plugin_connect_phone;
	
	private String plugin_summary;
}
