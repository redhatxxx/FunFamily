package org.fun.test;

import java.util.Date;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
//import org.hibernate.service.ServiceRegistryBuilder;

import fun.bean.base.ActivityBean;
import fun.bean.base.GroupBean;
import fun.bean.base.LeaderCardBean;
import org.com.union.bean.UserBean;

public class HibernateTest {

	Configuration cfg = new Configuration().addResource("hibernate.cfg.xml").configure();
	ServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();// .getBootstrapServiceRegistry();
	SessionFactory sf = cfg.buildSessionFactory(sr);

	public HibernateTest(){

	}
	public static void main(String[] args) {

		UserBean bean = new UserBean();
//		bean.setUser_id(12345678);
		bean.setUser_nickname("redhat5");
		bean.setUser_password("ers5f@redhat.com");
		bean.setUser_password("U5F");
		Date now = new Date();
		bean.setUser_create_date(now);
		GroupBean group = new GroupBean();
		group.setGroup_number("xxndws2112");
		group.setGroup_name("鲜花户外");
		
		ActivityBean activity = new ActivityBean();
		activity.setActivityTitle("库布齐沙漠");
		activity.setActivLeader("东dong");
		activity.setActivCreateDate(new Date());
		
		LeaderCardBean card = new LeaderCardBean();
		card.setCardno("sdfghsidfnwerih");
		card.setCreatedate(new Date());

		HibernateTest test = new HibernateTest();
//		UserBean cuser = test.getuser();
//		card.setUser(cuser);
		test.adduserdata(bean);
//		Set<ActivityBean>  group_tmp = test.getActivsbyGoupId();
//		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>"+group_tmp.size());
//		GroupBean  group_tmp = test.getgroup();
//		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>"+group_tmp.getGroup_name());
		
//		activity.setGroup(group_tmp);
//		group.setGroup_leader(cuser);
//		test.adddata(bean,activity);
//		test.loaddata();
//		test.updatedata3();
//		test.addcard(card);
//		test.addGroup(group);
		test.closeSessionFactory();
	}
 
	private Set<ActivityBean> getActivsbyGoupId() {
		// TODO Auto-generated method stub
		Session session2 = sf.getCurrentSession();
		session2.beginTransaction();
		GroupBean groupbean = (GroupBean)session2.get(GroupBean.class, 2000003);

		Set<ActivityBean> avtivitys = groupbean.getActivs();
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>"+avtivitys.size());
		session2.getTransaction().commit();
		return avtivitys;
	}
	private GroupBean getgroup() {
		// TODO Auto-generated method stub
		Session session2 = sf.getCurrentSession();
		session2.beginTransaction();
		GroupBean groupbean = (GroupBean)session2.get(GroupBean.class, 2000003);
		session2.getTransaction().commit();
		return groupbean;
	}
	private void addGroup(GroupBean card) {
		// TODO Auto-generated method stub
		Session session = sf.getCurrentSession();
		session.beginTransaction();
		session.save(card);
		session.getTransaction().commit();
	}
	//插入
	private void addcard(LeaderCardBean card) {
		// TODO Auto-generated method stub
		Session session = sf.getCurrentSession();
		session.beginTransaction();
		session.save(card);
		session.getTransaction().commit();
	}
	//查询
	private UserBean getuser() {
		// TODO Auto-generated method stub
		Session session2 = sf.getCurrentSession();
		session2.beginTransaction();
		UserBean user = (UserBean)session2.get(UserBean.class, 500000010);
		session2.getTransaction().commit();
		return user;
	}
	private void closeSessionFactory(){
		sf.close();
	}
	
	//插入
	public void adduserdata(UserBean usr){
		
		Session session = sf.getCurrentSession();
		session.beginTransaction();
		session.save(usr);
		session.getTransaction().commit();
		sf.close();
	}
	//插入
	public void adddata(UserBean usr,ActivityBean activity){
		
		Session session = sf.getCurrentSession();
		session.beginTransaction();
		session.save(usr);
		session.save(activity);
		session.getTransaction().commit();

//		System.out.println(usr.getId());

		sf.close();
	}
	//删除
	public void deleteBean(UserBean usr,ActivityBean activity){
		Session session2 = sf.getCurrentSession();
		session2.beginTransaction();
		session2.delete(usr);
		session2.getTransaction().commit();
	}
	//查询
	public GroupBean loadgroup(){
		Session session2 = sf.getCurrentSession();
		session2.beginTransaction();
		GroupBean groupbean = (GroupBean)session2.get(GroupBean.class, 2000003);
		session2.getTransaction().commit();
		return groupbean;

	}
	//查询
	public void loaddata(){
		Session session2 = sf.getCurrentSession();
		session2.beginTransaction();
		UserBean user = (UserBean)session2.load(UserBean.class, 500000034);
//		System.out.println("<><><"+user.getEmail());
		session2.getTransaction().commit();

	}
	//查询
	public void getdata(){
		Session session2 = sf.getCurrentSession();
		session2.beginTransaction();
		UserBean user = (UserBean)session2.get(UserBean.class, 500000034);
//		System.out.println("<><><"+user.getEmail());
		session2.getTransaction().commit();

	}
	//更新
	public void updatedata(){
		Session session2 = sf.getCurrentSession();
		session2.beginTransaction();
		UserBean user = (UserBean)session2.get(UserBean.class, 500000034);	
		session2.getTransaction().commit();
//		user.setUsername("wolf");
		Session session3 = sf.getCurrentSession();
		session3.beginTransaction();
		session3.update(user);
		session3.getTransaction().commit();
	}
	//更新
	public void updatedata2(){
		UserBean user = new UserBean();
//		user.setId(500000033);
//		user.setUsername("wolf");
		Session session3 = sf.getCurrentSession();
		session3.beginTransaction();
		session3.update(user);
		session3.getTransaction().commit();
	}
	//更新推荐
	public void updatedata3(){

		Session session3 = sf.getCurrentSession();
		session3.beginTransaction();
		Query query = session3.createQuery("update UserBean u set u.username='sdasdg' where u.id="+500000033);
		query.executeUpdate();
		session3.getTransaction().commit();
	}
	
	public void saveorUpdate(UserBean user){
		Session session3 = sf.getCurrentSession();
		session3.beginTransaction();
		session3.saveOrUpdate(user);  
		session3.getTransaction().commit();
	}
	//清缓存
	public void clear(){
		Session session3 = sf.getCurrentSession();
		session3.beginTransaction();
		UserBean user = (UserBean)session3.load(UserBean.class, 500000020);
//		System.out.println(user.getEmail());
		//清缓存
		session3.clear(); 
		UserBean user2 = (UserBean)session3.load(UserBean.class, 500000020);
//		System.out.println(user2.getEmail());
		session3.getTransaction().commit();
	}
	

	//强制提交，同步缓存和数据库
	public void flush(){
		Session session3 = sf.getCurrentSession();
		session3.beginTransaction();
		UserBean user = (UserBean)session3.load(UserBean.class, 500000020);
//		user.setUsername("AAAA");
		//强制提交，同步缓存和数据库
		session3.flush();
//		user.setUsername("QQQQQQQQ");
		session3.getTransaction().commit();
	}
}
