package fun.bean.base;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import fun.bean.login.UserBean;

@Entity
@Table(name="FUN_TMP_GROUP")
@SequenceGenerator(name="activitysquence",sequenceName="GROUP_ID_SEQUENCE",allocationSize=1)

public class GroupBean {

	//团队唯一ID
	private int group_id;
	
	//团队唯一序号
	private String group_number;
	
	//团队名称
	private String group_name;
	
	//团队创建日期
	private String group_creat_date;
	
	//团队领导者
	private UserBean group_leader;
	
	//团队logo
	private String group_logo;
	
	//团队类型
	private String group_type;
	
	//团队QQ号码
	private String group_qq_number;
	
	//团队微信账号
	private String group_weixin_number;
	
	//团队新浪微博账号
	private String group_xinlang_number;
	
	//团队贴吧账号
	private String group_tieba;

	//团队简介
	private String group_summary;
	
	//备用字段1
	private String group_hold1;
	
	//备用字段2
	private String group_hold2;
	
	//备用字段3
	private String group_hold3;
	
	//备用字段4
	private String group_hold4;
	
	//备用字段5
	private String group_hold5;

	//使用多对一/一对多双向关联查找活动列表
	private Set<ActivityBean> activs = new HashSet<ActivityBean>();
	
	//双向关联使用mappedBy 等号后面为数量多的一方中数量少的实例名
	@OneToMany(mappedBy="group")
	public Set<ActivityBean> getActivs() {
		return activs;
	}

	public void setActivs(Set<ActivityBean> activs) {
		this.activs = activs;
	}

	@Id
	@Column(name="GROUP_TMP_ID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="activitysquence")
	public int getGroup_id() {
		return group_id;
	}

	public void setGroup_id(int group_id) {
		this.group_id = group_id;
	}

	@Column(name="GROUP_NUMBER")
	public String getGroup_number() {
		return group_number;
	}

	public void setGroup_number(String group_number) {
		this.group_number = group_number;
	}

	@Column(name="GROUP_NAME")
	public String getGroup_name() {
		return group_name;
	}

	public void setGroup_name(String group_name) {
		this.group_name = group_name;
	}

	@Column(name="GROUP_CREAT_DATE")
	public String getGroup_creat_date() {
		return group_creat_date;
	}

	public void setGroup_creat_date(String group_creat_date) {
		this.group_creat_date = group_creat_date;
	}

	//JoinColumn指定的是本类所映射表中的字段
	@OneToOne(targetEntity=UserBean.class)
	@JoinColumn(name="GROUP_LEADER_ID")
	public UserBean getGroup_leader() {
		return group_leader;
	}

	public void setGroup_leader(UserBean group_leader) {
		this.group_leader = group_leader;
	}

	@Column(name="GROUP_LOGO")
	public String getGroup_logo() {
		return group_logo;
	}

	public void setGroup_logo(String group_logo) {
		this.group_logo = group_logo;
	}

	@Column(name="GROUP_TYPE")
	public String getGroup_type() {
		return group_type;
	}

	public void setGroup_type(String group_type) {
		this.group_type = group_type;
	}

	@Column(name="GROUP_QQ_NUMBER")
	public String getGroup_qq_number() {
		return group_qq_number;
	}

	public void setGroup_qq_number(String group_qq_number) {
		this.group_qq_number = group_qq_number;
	}

	@Column(name="GROUP_WEIXIN_NUMBER")
	public String getGroup_weixin_number() {
		return group_weixin_number;
	}

	public void setGroup_weixin_number(String group_weixin_number) {
		this.group_weixin_number = group_weixin_number;
	}

	@Column(name="GROUP_XINLANG_NUMBER")
	public String getGroup_xinlang_number() {
		return group_xinlang_number;
	}

	public void setGroup_xinlang_number(String group_xinlang_number) {
		this.group_xinlang_number = group_xinlang_number;
	}

	@Column(name="GROUP_TIEBA")
	public String getGroup_tieba() {
		return group_tieba;
	}

	public void setGroup_tieba(String group_tieba) {
		this.group_tieba = group_tieba;
	}

	@Column(name="GROUP_SUMMARY")
	public String getGroup_summary() {
		return group_summary;
	}

	public void setGroup_summary(String group_summary) {
		this.group_summary = group_summary;
	}

	@Column(name="GROUP_HOLD1")
	public String getGroup_hold1() {
		return group_hold1;
	}

	public void setGroup_hold1(String group_hold1) {
		this.group_hold1 = group_hold1;
	}

	@Column(name="GROUP_HOLD2")
	public String getGroup_hold2() {
		return group_hold2;
	}

	public void setGroup_hold2(String group_hold2) {
		this.group_hold2 = group_hold2;
	}

	@Column(name="GROUP_HOLD3")
	public String getGroup_hold3() {
		return group_hold3;
	}

	public void setGroup_hold3(String group_hold3) {
		this.group_hold3 = group_hold3;
	}

	@Column(name="GROUP_HOLD4")
	public String getGroup_hold4() {
		return group_hold4;
	}

	public void setGroup_hold4(String group_hold4) {
		this.group_hold4 = group_hold4;
	}

	@Column(name="GROUP_HOLD5")
	public String getGroup_hold5() {
		return group_hold5;
	}

	public void setGroup_hold5(String group_hold5) {
		this.group_hold5 = group_hold5;
	}
}
