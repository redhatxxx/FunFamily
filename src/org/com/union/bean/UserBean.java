package org.com.union.bean;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * 用户类
 * 保函用户的基本信息
 * 映射用户表sys_user
 * 
 * author by redhat;
 * date 2016.4.18
 * 
 * */
@Entity
@Table(name="SYS_USERS")
public class UserBean {
	
	public UserBean(){
		
	}

	@Id
	@Column(name="user_id")
	@GeneratedValue
	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	@Column(name="user_nickname")
	public String getUser_nickname() {
		return user_nickname;
	}

	public void setUser_nickname(String user_nickname) {
		this.user_nickname = user_nickname;
	}

	@Column(name="user_email")
	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	@Column(name="user_phone")
	public String getUser_phone() {
		return user_phone;
	}

	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}

	@Column(name="user_password")
	public String getUser_password() {
		return user_password;
	}

	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}

	@Column(name="user_sex")
	public int getUser_sex() {
		return user_sex;
	}

	public void setUser_sex(int user_sex) {
		this.user_sex = user_sex;
	}

	@Column(name="user_photo_path")
	public String getUser_photo_path() {
		return user_photo_path;
	}

	public void setUser_photo_path(String user_photo_path) {
		this.user_photo_path = user_photo_path;
	}
	
	@Column(name="user_create_date")
	public Date getUser_create_date() {
		return user_create_date;
	}

	public void setUser_create_date(Date user_create_date) {
		this.user_create_date = user_create_date;
	}

	@Column(name="user_qq_number")
	public String getUser_qq_number() {
		return user_qq_number;
	}

	public void setUser_qq_number(String user_qq_number) {
		this.user_qq_number = user_qq_number;
	}

	@Column(name="user_weixin_account")
	public String getUser_weixin_account() {
		return user_weixin_account;
	}

	public void setUser_weixin_account(String user_weixin_account) {
		this.user_weixin_account = user_weixin_account;
	}

	@Column(name="user_real_name")
	public String getUser_real_name() {
		return user_real_name;
	}

	public void setUser_real_name(String user_real_name) {
		this.user_real_name = user_real_name;
	}

	@Column(name="user_identity_number")
	public String getUser_identity_number() {
		return user_identity_number;
	}

	public void setUser_identity_number(String user_identity_number) {
		this.user_identity_number = user_identity_number;
	}

	@Column(name="user_last_login")
	public Date getUser_last_login() {
		return user_last_login;
	}

	public void setUser_last_login(Date user_last_login) {
		this.user_last_login = user_last_login;
	}

	@Column(name="user_login_count")
	public int getUser_login_count() {
		return user_login_count;
	}

	public void setUser_login_count(int user_login_count) {
		this.user_login_count = user_login_count;
	}

	@OneToOne
	@JoinColumn(name="status_code")
	public StatusBean getUser_status() {
		return user_status;
	}

	public void setUser_status(StatusBean user_status_code) {
		this.user_status = user_status_code;
	}

	@Column(name="user_hold1")
	public String getUser_hold1() {
		return user_hold1;
	}

	public void setUser_hold1(String user_hold1) {
		this.user_hold1 = user_hold1;
	}

	@Column(name="user_hold2")
	public String getUser_hold2() {
		return user_hold2;
	}

	public void setUser_hold2(String user_hold2) {
		this.user_hold2 = user_hold2;
	}

	@OneToOne(targetEntity=RoleToUserBean.class)
	@JoinColumn(name="USER_ID")
	public RoleToUserBean getUser_role() {
		return user_role;
	}

	public void setUser_role(RoleToUserBean user_role) {
		this.user_role = user_role;
	}

	@OneToMany(targetEntity=UserToSubject.class)
	@JoinColumn(name="USER_ID")
	public Set<UserToSubject> getSubjects() {
		return subjects;
	}

	public void setSubjects(Set<UserToSubject> subjects) {
		this.subjects = subjects;
	}

	private int user_id;
	
	private String user_nickname;
	
	private String user_email;
	
	private String user_phone;

	private String user_password;
	
	private int user_sex;
	
	private String user_photo_path;
	
	private Date user_create_date;
	
	private String user_qq_number;
	
	private String user_weixin_account;
	
	private String user_real_name;
	
	private String user_identity_number;
	
	private Date user_last_login;
	
	private int user_login_count;
	
	private StatusBean user_status;
	
	private String user_hold1;
	
	private String user_hold2;
	
	private RoleToUserBean user_role;

	private Set<UserToSubject> subjects;
	
	public boolean validate() {
		// TODO Auto-generated method stub
		return false;
	}
}

