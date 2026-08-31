package util;

import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;

import entity.Student;

public class HibernateUtil {
	   SessionFactory factory;
	   public SessionFactory getSessionFactory() {
		   factory = new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();
		   return factory;
	   }
}
