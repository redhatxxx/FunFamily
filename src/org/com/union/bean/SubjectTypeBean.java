package org.com.union.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * 团队类型类
 * 团队类型信息
 * 映射用户表sys_subject_type
 * 
 * author by redhat;
 * date 2016.5.9
 * 
 * */
@Entity
@Table(name="sys_subject_type")
public class SubjectTypeBean {

	@Id
	@Column(name="subject_type_id")
	public int getSubject_type_id() {
		return subject_type_id;
	}

	public void setSubject_type_id(int subject_type_id) {
		this.subject_type_id = subject_type_id;
	}

	@Column(name="subject_type_code")
	public int getSubject_type_code() {
		return subject_type_code;
	}

	public void setSubject_type_code(int subject_type_code) {
		this.subject_type_code = subject_type_code;
	}

	@Column(name="subject_type_name")
	public String getSubject_type_name() {
		return subject_type_name;
	}

	public void setSubject_type_name(String subject_type_name) {
		this.subject_type_name = subject_type_name;
	}

	@Column(name="subject_type_summary")
	public String getSubject_type_summary() {
		return subject_type_summary;
	}

	public void setSubject_type_summary(String subject_type_summary) {
		this.subject_type_summary = subject_type_summary;
	}

	private int subject_type_id;
	
	private	int subject_type_code;
	
	private String subject_type_name;
	
	private String subject_type_summary;
}
