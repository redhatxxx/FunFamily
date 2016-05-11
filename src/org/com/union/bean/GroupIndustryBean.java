package org.com.union.bean;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
/**
 * 团体所属领域类
 * 团体所属领域信息
 * 映射用户表sys_group_industry
 * 
 * author by redhat;
 * date 2016.5.8
 * 
 * */
@Entity
@Table(name="sys_group_industry")
public class GroupIndustryBean {

	@Id
	@Column(name = "group_industry_id")
	public int getGroup_industry_id() {
		return group_industry_id;
	}

	public void setGroup_industry_id(int group_industry_id) {
		this.group_industry_id = group_industry_id;
	}

	@Column(name = "group_industry_code")
	public String getGroup_industry_code() {
		return group_industry_code;
	}

	public void setGroup_industry_code(String group_industry_code) {
		this.group_industry_code = group_industry_code;
	}

	@Column(name = "group_industry_name")
	public String getGroup_industry_name() {
		return group_industry_name;
	}

	public void setGroup_industry_name(String group_industry_name) {
		this.group_industry_name = group_industry_name;
	}
	
	@Column(name = "group_industry_summary")
	public String getGroup_industry_summary() {
		return group_industry_summary;
	}

	public void setGroup_industry_summary(String group_industry_summary) {
		this.group_industry_summary = group_industry_summary;
	}

	@OneToMany(mappedBy="group_industry")
	public Set<GroupTypeBean> getTypelist() {
		return typelist;
	}

	public void setTypelist(Set<GroupTypeBean> typelist) {
		this.typelist = typelist;
	}
	
	private int group_industry_id;
	
	private String group_industry_code;
	
	private String group_industry_name;
	
	private String group_industry_summary;	
	
	private Set<GroupTypeBean> typelist = new HashSet<GroupTypeBean>();


}
