package org.fun.web.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

public class UserBaseDao{

	private String user_id;
	
	private String user_name;
	
	private String user_password;
	
	private String user_repassword;

	private String user_sex;
	
	private String user_email;
	
	private String user_regist_time;
	
	private String user_last_login_time;
	
	private String sculptrue_path;
	
	public String getSculptrue_path() {
		return sculptrue_path;
	}

	public void setSculptrue_path(String sculptrue_path) {
		this.sculptrue_path = sculptrue_path;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_password() {
		return user_password;
	}

	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}

	public String getUser_sex() {
		return user_sex;
	}

	public void setUser_sex(String user_sex) {
		this.user_sex = user_sex;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public String getUser_regist_time() {
		return user_regist_time;
	}

	public void setUser_regist_time(String user_regist_time) {
		this.user_regist_time = user_regist_time;
	}

	public String getUser_last_login_time() {
		return user_last_login_time;
	}

	public void setUser_last_login_time(String user_last_login_time) {
		this.user_last_login_time = user_last_login_time;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	
	public String getUser_repassword() {
		return user_repassword;
	}

	public void setUser_repassword(String user_repassword) {
		this.user_repassword = user_repassword;
	}

}
