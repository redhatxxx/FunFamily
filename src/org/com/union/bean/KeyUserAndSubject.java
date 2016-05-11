package org.com.union.bean;

import java.io.Serializable;

import javax.persistence.Column;

//联合主键用户ID和主题ID
public class KeyUserAndSubject implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	
	public int getJoin_user_id() {
		return join_user_id;
	}

	public void setJoin_user_id(int join_user_id) {
		this.join_user_id = join_user_id;
	}

	public int getSubject_id() {
		return subject_id;
	}

	public void setSubject_id(int subject_id) {
		this.subject_id = subject_id;
	}

	private int join_user_id;
	
	private int subject_id;
}
