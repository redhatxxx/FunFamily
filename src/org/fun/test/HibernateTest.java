package org.fun.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
//import org.hibernate.service.ServiceRegistryBuilder;

import fun.bean.base.ActivityBean;
import fun.bean.login.UserBean;

public class HibernateTest {

	public static void main(String[] args) {
		UserBean bean = new UserBean();
		bean.setUsername("redhat5");
		bean.setEmail("ers5f@redhat.com");
		bean.setPassword("U5F");
		
		ActivityBean activity = new ActivityBean();
		activity.setActivityTitle("库布齐沙漠");
		activity.setActivLeader("东dong");
		activity.setActivCreateDate(new Date());
		Configuration cfg = new Configuration().addResource("hibernate.cfg.xml");
		cfg.configure();
		ServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();// .getBootstrapServiceRegistry();
		// SessionFactory类似数据库库的一个Connection
		SessionFactory sf = cfg.buildSessionFactory(sr);

		Session session = sf.getCurrentSession();
//		Session session = sf.openSession();
		session.beginTransaction();
		session.save(bean);
		session.save(activity);
		session.getTransaction().commit();
//		session.close();
		sf.close();
	}

	public void adddata(UserBean usr){
	}
}
