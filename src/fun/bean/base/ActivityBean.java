package fun.bean.base;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="FUN_TMP_ACTIVITYS")
@SequenceGenerator(name="activitysquence",sequenceName="ACTIVITY_ID_SEQUENCE",allocationSize=1)
public class ActivityBean {

	private long activityID;
	
	
	private String activityTitle;
	
	private String activLeader;
	
	private Date activCreateDate;

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
