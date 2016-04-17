package fun.bean.base;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import fun.bean.login.UserBeanTmp;

@Entity
@Table(name="FUN_TMP_ACTIVITYS")
@SequenceGenerator(name="activitysquence",sequenceName="ACTIVITY_ID_SEQUENCE",allocationSize=1)
public class ActivityBean {

	private long activityID;
	
	
	private String activityTitle;
	
	private String activLeader;
	
	private Date activCreateDate;
	
	private GroupBean group;
	
	private Set<UserBeanTmp> joinusers = new HashSet<UserBeanTmp>();
	
	//多对多关联
	@ManyToMany
	@JoinTable(name="FUN_TMP_USER_JOIN_ACTIV",
			//当前bean所对应中间表中的外键字段
			joinColumns= {@JoinColumn(name="JOIN_ACTIVTY_ID")},
			//多对多关系另一方在中间表中的外键字段
			inverseJoinColumns={@JoinColumn(name="JOIN_USER_ID")}
	)
	public Set<UserBeanTmp> getJoinusers() {
		return joinusers;
	}

	public void setJoinusers(Set<UserBeanTmp> joinusers) {
		this.joinusers = joinusers;
	}

	@ManyToOne
	@JoinColumn(name="group_id")
	public GroupBean getGroup() {
		return group;
	}

	public void setGroup(GroupBean group) {
		this.group = group;
	}
	
	@Temporal(TemporalType.TIME)
	public Date getActivCreateDate() {
		return activCreateDate;
	}
	public void setActivCreateDate(Date activCreateDate) {
		this.activCreateDate = activCreateDate;
	}
	public ActivityBean(){
		
	}	

	@Id
	@Column(name="ACTIVITYID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="activitysquence")
	public long getActivityID() {
		return activityID;
	}
	public void setActivityID(long activityID) {
		this.activityID = activityID;
	}
	
	@Column(name="ACTIVITYTITLE")
	public String getActivityTitle() {
		return activityTitle;
	}
	public void setActivityTitle(String activityTitle) {
		this.activityTitle = activityTitle;
	}	

	@Column(name="ACTIVITYLEADER")
	public String getActivLeader() {
		return activLeader;
	}
	public void setActivLeader(String activLeader) {
		this.activLeader = activLeader;
	}
	
}
