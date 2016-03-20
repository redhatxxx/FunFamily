package org.fun.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
//import org.hibernate.service.ServiceRegistryBuilder;

import fun.bean.login.UserBean;

public class HibernateTest {

	public static void main(String[] args) {
		UserBean bean = new UserBean();
		bean.setId("004");
		bean.setUsername("redhat3");
		bean.setEmail("ers2rf@redhat.com");
		bean.setPassword("U3RF");

		Configuration cfg = new Configuration().addResource("hibernate.cfg.xml");
		cfg.configure();
		ServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();// .getBootstrapServiceRegistry();
		// SessionFactory类似数据库库的一个Connection
		SessionFactory sf = cfg.buildSessionFactory(sr);

		Session session = sf.openSession();
		session.beginTransaction();
		session.save(bean);
		session.getTransaction().commit();
		session.close();
		sf.close();
	}

	public void adddata(UserBean usr){
	}
}
