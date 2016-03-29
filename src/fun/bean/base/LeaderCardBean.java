package fun.bean.base;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import fun.bean.login.UserBean;

@Entity
@Table(name="FUN_LEADER_CARD")
@SequenceGenerator(name="activitysquence",sequenceName="LEADER_ID_SEQUENCE",allocationSize=1)
public class LeaderCardBean {
	
	private int id;
	
	private String cardno;
	
	private UserBean user;
	
	private Date createdate;

	@Id
	@Column(name="CARD_ID")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="activitysquence")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name="CARD_NO")
	public String getCardno() {
		return cardno;
	}

	public void setCardno(String cardno) {
		this.cardno = cardno;
	}
	@OneToOne(targetEntity=UserBean.class)
	@JoinColumn(name="USER_ID")
	public UserBean getUser() {
		return user;
	}

	public void setUser(UserBean user) {
		this.user = user;
	}

	@Temporal(TemporalType.TIME)
	@Column(name="CREATEDATE")
	public Date getCreatedate() {
		return createdate;
	}

	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}

}
