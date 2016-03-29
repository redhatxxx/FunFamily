package org.fun.test;

import java.util.Date;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
//import org.hibernate.service.ServiceRegistryBuilder;

import fun.bean.base.ActivityBean;
import fun.bean.base.LeaderCardBean;
import fun.bean.login.UserBean;

public class HibernateTest {

	Configuration cfg = new Configuration().addResource("hibernate.cfg.xml").configure();
	ServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();// .getBootstrapServiceRegistry();
	SessionFactory sf = cfg.buildSessionFactory(sr);

	public HibernateTest(){

	}
	public static void main(String[] args) {
		UserBean bean = new UserBean();
		bean.setUsername("redhat5");
		bean.setEmail("ers5f@redhat.com");
		bean.setPassword("U5F");
		
		ActivityBean activity = new ActivityBean();
		activity.setActivityTitle("库布齐沙漠");
		activity.setActivLeader("东dong");
		activity.setActivCreateDate(new Date());
		
		LeaderCardBean card = new LeaderCardBean();
		card.setCardno("sdfghsidfnwerih");
		card.setCreatedate(new Date());

		HibernateTest test = new HibernateTest();
		UserBean cuser = test.getuser();
		card.setUser(cuser);
		
//		test.adddata(bean,activity);
//		test.loaddata();
//		test.updatedata3();
		test.addcard(card);
		test.closeSessionFactory();
	}
 
	private void addcard(LeaderCardBean card) {
		// TODO Auto-generated method stub
		Session session = sf.getCurrentSession();
		session.beginTransaction();
		session.save(card);
		session.getTransaction().commit();
	}
	private UserBean getuser() {
		// TODO Auto-generated method stub
		Session session2 = sf.getCurrentSession();
		session2.beginTransaction();
		UserBean user = (UserBean)session2.get(UserBean.class, 500000034);
		session2.getTransaction().commit();
		return user;
	}
	private void closeSessionFactory(){
		sf.close();
	}
	public void adddata(UserBean usr,ActivityBean activity){
		
		Session session = sf.getCurrentSession();
		session.beginTransaction();
		session.save(usr);
		session.save(activity);
		session.getTransaction().commit();

		System.out.println(usr.getId());

		sf.close();
	}
	
	public void deleteBean(UserBean usr,ActivityBean activity){
		Session session2 = sf.getCurrentSession();
		session2.beginTransaction();
		session2.delete(usr);
		session2.getTransaction().commit();
	}
	
	public void loaddata(){
		Session session2 = sf.getCurrentSession();
		session2.beginTransaction();
		UserBean user = (UserBean)session2.load(UserBean.class, 500000034);
		System.out.println("<><><"+user.getEmail());
		session2.getTransaction().commit();

	}
	
	public void getdata(){
		Session session2 = sf.getCurrentSession();
		session2.beginTransaction();
		UserBean user = (UserBean)session2.get(UserBean.class, 500000034);
		System.out.println("<><><"+user.getEmail());
		session2.getTransaction().commit();

	}
	public void updatedata(){
		Session session2 = sf.getCurrentSession();
		session2.beginTransaction();
		UserBean user = (UserBean)session2.get(UserBean.class, 500000034);	
		session2.getTransaction().commit();
		user.setUsername("wolf");
		Session session3 = sf.getCurrentSession();
		session3.beginTransaction();
		session3.update(user);
		session3.getTransaction().commit();
	}
	public void updatedata2(){
		UserBean user = new UserBean();
		user.setId(500000033);
		user.setUsername("wolf");
		Session session3 = sf.getCurrentSession();
		session3.beginTransaction();
		session3.update(user);
		session3.getTransaction().commit();
	}
	//推荐
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
	
	public void clear(){
		Session session3 = sf.getCurrentSession();
		session3.beginTransaction();
		UserBean user = (UserBean)session3.load(UserBean.class, 500000020);
		System.out.println(user.getEmail());
		//清缓存
		session3.clear(); 
		UserBean user2 = (UserBean)session3.load(UserBean.class, 500000020);
		System.out.println(user2.getEmail());
		session3.getTransaction().commit();
	}
	
	public void flush(){
		Session session3 = sf.getCurrentSession();
		session3.beginTransaction();
		UserBean user = (UserBean)session3.load(UserBean.class, 500000020);
		user.setUsername("AAAA");
		//强制提交，同步缓存和数据库
		session3.flush();
		user.setUsername("QQQQQQQQ");
		session3.getTransaction().commit();
	}
}
