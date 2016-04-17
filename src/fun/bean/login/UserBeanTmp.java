package fun.bean.login;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import fun.bean.base.ActivityBean;
import fun.bean.base.LeaderCardBean;

@Entity
@Table(name="FUN_TMP_USER")
@SequenceGenerator(name="usersquence",sequenceName="USER_ID_SEQUENCE",allocationSize=1)
public class UserBeanTmp {
	
	private int id;
	
	private String username;
	
	private String password;

	private String email;
	
	private LeaderCardBean leadcard;
	
	private String photograph;
	
	private Set<ActivityBean> activitys = new HashSet<ActivityBean>();
	
	//mappedBy=多对多另一方中该类的对象
	@ManyToMany(mappedBy="joinusers")
	public Set<ActivityBean> getActivitys() {
		return activitys;
	}

	public void setActivitys(Set<ActivityBean> activitys) {
		this.activitys = activitys;
	}

	@Column(name="USER_PHOTOGRAPH")
	public String getPhotograph() {
		return photograph;
	}

	public void setPhotograph(String photograph) {
		this.photograph = photograph;
	}

	@OneToOne(mappedBy="user")
	public LeaderCardBean getLeadcard() {
		return leadcard;
	}

	public void setLeadcard(LeaderCardBean leadcard) {
		this.leadcard = leadcard;
	}

	@Column(name="USER_NAME")
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name="PASS_WORD")
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	//业务逻辑，判断帐号密码
	public boolean validate(){
		if(username.equals("redhat")&&password.equals("000"))
			return true;
		else
			return false;
	}

	@Column(name="EMAIL")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Id
	@Column(name="USER_ID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="usersquence")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
