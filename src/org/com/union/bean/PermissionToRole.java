package org.com.union.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 权限与角色关系表
 * 映射用户表Permission_to_role
 * 
 * author by redhat;
 * date 2016.4.18
 * 
 * */
@Entity
@Table(name="permission_to_role")
public class PermissionToRole {

	@Id
	@Column(name="role_id")
	public int getRole_id() {
		return role_id;
	}

	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}
	
	@Column(name="permission_id")
	public int getPermission_id() {
		return permission_id;
	}

	public void setPermission_id(int permission_id) {
		this.permission_id = permission_id;
	}

	@Column(name="summary")
	public String getPtor_summary() {
		return ptor_summary;
	}

	public void setPtor_summary(String ptor_summary) {
		this.ptor_summary = ptor_summary;
	}

	private int role_id;
	
	private int permission_id;
	
	private String ptor_summary;
}
