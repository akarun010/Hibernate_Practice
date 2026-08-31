package util;

import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;

import entity.Student;

public class HibernateUtil {
	   public SessionFactory getSessionFactory() {
		   return new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();
	   }
}
