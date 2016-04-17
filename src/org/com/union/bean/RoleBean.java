package org.com.union.bean;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * 用户角色类
 * 保存角色信息
 * 映射用户表sys_role
 * 
 * author by redhat;
 * date 2016.4.18
 * 
 * */
@Entity
@Table(name="sys_role")
public class RoleBean {

	public RoleBean(){
		
	}
	
	@Id
	@Column(name="role_id")
	@GeneratedValue
	public String getRole_id() {
		return role_id;
	}

	public void setRole_id(String role_id) {
		this.role_id = role_id;
	}
	
	@Column(name="role_name")
	public String getRole_name() {
		return role_name;
	}

	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}

	@Column(name="role_parent_id")
	public String getRole_parent_id() {
		return role_parent_id;
	}

	public void setRole_parent_id(String role_parent_id) {
		this.role_parent_id = role_parent_id;
	}

	@Column(name="role_summary")
	public String getRole_summary() {
		return role_summary;
	}

	public void setRole_summary(String role_summary) {
		this.role_summary = role_summary;
	}
	
	@OneToMany(targetEntity=RoleToUserBean.class)
	@JoinColumn(name="ROLE_ID")
	public Set<RoleToUserBean> getUser_role() {
		return user_role;
	}

	public void setUser_role(Set<RoleToUserBean> user_role) {
		this.user_role = user_role;
	}

	@OneToMany(targetEntity=PermissionToRole.class)
	@JoinColumn(name="ROLE_ID")
	public Set<PermissionToRole> getPermission_role() {
		return permission_role;
	}

	public void setPermission_role(Set<PermissionToRole> permission_role) {
		this.permission_role = permission_role;
	}
	private String role_id;
	
	private String role_name;
	
	private String role_parent_id;
	
	private String role_summary;
	
	private Set<RoleToUserBean> user_role;

	private Set<PermissionToRole> permission_role;


}
