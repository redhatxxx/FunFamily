package org.com.union.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 权限类
 * 保存权限信息
 * 映射用户表sys_permission
 * 
 * author by redhat;
 * date 2016.4.18
 * 
 * */
@Entity
@Table(name="sys_permission")
public class PermissionBean {

	@Id
	@Column(name="permission_id")
	@GeneratedValue
	public int getPermission_id() {
		return permission_id;
	}

	public void setPermission_id(int permission_id) {
		this.permission_id = permission_id;
	}

	@Column(name="permission_name")
	public String getPermission_name() {
		return permission_name;
	}

	public void setPermission_name(String permission_name) {
		this.permission_name = permission_name;
	}

	@Column(name="permission_summary")
	public String getPermission_summary() {
		return permission_summary;
	}

	public void setPermission_summary(String permission_summary) {
		this.permission_summary = permission_summary;
	}

	//权限Id
	public int permission_id;
	
	//权限名称
	public String permission_name;
	
	//权限备注
	public String permission_summary;
	
}
