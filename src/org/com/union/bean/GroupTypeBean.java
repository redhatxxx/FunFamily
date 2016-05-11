package org.com.union.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 团队类型类
 * 团队类型信息
 * 映射用户表sys_group_type
 * 
 * author by redhat;
 * date 2016.5.8
 * 
 * */
@Entity
@Table(name = "sys_group_type")
public class GroupTypeBean {

	@Id
	@Column(name = "group_type_id")
	public int getGroup_type_id() {
		return group_type_id;
	}

	public void setGroup_type_id(int group_type_id) {
		this.group_type_id = group_type_id;
	}
	
	@Column(name = "group_type_code")
	public String getGroup_type_code() {
		return group_type_code;
	}

	public void setGroup_type_code(String group_type_code) {
		this.group_type_code = group_type_code;
	}

	@Column(name = "group_type_name")
	public String getGroup_type_name() {
		return group_type_name;
	}

	public void setGroup_type_name(String group_type_name) {
		this.group_type_name = group_type_name;
	}

	@Column(name = "group_type_summary")
	public String getGroup_type_summary() {
		return group_type_summary;
	}

	public void setGroup_type_summary(String group_type_summary) {
		this.group_type_summary = group_type_summary;
	}

	@ManyToOne
	@JoinColumn(name = "group_type_industry_id")
	public GroupIndustryBean getGroup_industry() {
		return group_industry;
	}

	public void setGroup_industry(GroupIndustryBean group_industry) {
		this.group_industry = group_industry;
	}

	private int group_type_id;
	
	private String group_type_code;
	
	private String group_type_name;
	
	private String group_type_summary;
	
	private GroupIndustryBean group_industry;
}
