package fun.dao.user;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import fun.bean.login.UserBean;

public class UserDAO {
	
	Configuration cfg = new Configuration().addResource("hibernate.cfg.xml");
	ServiceRegistry sr = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();// .getBootstrapServiceRegistry();
	// SessionFactory类似数据库库的一个Connection
	SessionFactory sf = cfg.buildSessionFactory(sr);

	Session session = sf.openSession();
	
	public UserDAO(){
		cfg = new Configuration().addResource("hibernate.cfg.xml");
		cfg.configure();
		sr = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();// .getBootstrapServiceRegistry();
		// SessionFactory类似数据库库的一个Connection
		sf = cfg.buildSessionFactory(sr);
		session = sf.openSession();
		session.beginTransaction();
	}
	public void saveUserInfo(UserBean bean){
		session.save(bean);
		session.getTransaction().commit();
	}
	public void updateUserInfo(UserBean bean){
		session.update(bean);
		session.getTransaction().commit();
	}
	public void closeConnection(){
		session.close();
		sf.close();
	}
}
