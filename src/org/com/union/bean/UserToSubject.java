package org.com.union.bean;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * 用户报名主题类
 * 用户和主题之间的关系类
 * 映射用户表user_join_subject
 * 
 * author by redhat;
 * date 2016.4.18
 * 
 * */
@Entity
@Table(name="user_join_subject")
public class UserToSubject {

	@OneToMany(targetEntity=SubjectPluginBean.class)
	@JoinColumns(
			{
				@JoinColumn(name="join_user_id",referencedColumnName="join_user_id" ),
				@JoinColumn(name="subject_id",referencedColumnName="join_user_id")
			}
	)
	public Set<SubjectPluginBean> getPlugins() {
		return plugins;
	}

	public void setPlugins(Set<SubjectPluginBean> plugins) {
		this.plugins = plugins;
	}

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

	@Column(name="join_time")
	public Date getJoin_time() {
		return join_time;
	}

	public void setJoin_time(Date join_time) {
		this.join_time = join_time;
	}

	@Column(name="join_with_plugins")
	public int getJoin_with_plugins() {
		return join_with_plugins;
	}

	public void setJoin_with_plugins(int join_with_plugins) {
		this.join_with_plugins = join_with_plugins;
	}

	@Column(name="join_user_address")
	public String getJoin_user_address() {
		return join_user_address;
	}

	public void setJoin_user_address(String join_user_address) {
		this.join_user_address = join_user_address;
	}

	@Column(name="emergency_connect_person")
	public String getEmergency_connect_person() {
		return emergency_connect_person;
	}

	public void setEmergency_connect_person(String emergency_connect_person) {
		this.emergency_connect_person = emergency_connect_person;
	}

	@Column(name="emergency_connect_phone")
	public int getEmergency_connect_phone() {
		return emergency_connect_phone;
	}

	public void setEmergency_connect_phone(int emergency_connect_phone) {
		this.emergency_connect_phone = emergency_connect_phone;
	}
	
	@Column(name="join_with_gear")
	public int getJoin_with_gear() {
		return join_with_gear;
	}

	public void setJoin_with_gear(int join_with_gear) {
		this.join_with_gear = join_with_gear;
	}

	@Column(name="join_subject_summary")
	public String getJoin_subject_summary() {
		return join_subject_summary;
	}

	public void setJoin_subject_summary(String join_subject_summary) {
		this.join_subject_summary = join_subject_summary;
	}

	private Set<SubjectPluginBean> plugins ;
	
	private int join_user_id;
	
	private int subject_id;
	
	private Date join_time;
	
	private int join_with_plugins;
	
	private String join_user_address;
	
	private String emergency_connect_person;
	
	private int emergency_connect_phone;
	
	private int join_with_gear;
	
	private String join_subject_summary;
}
