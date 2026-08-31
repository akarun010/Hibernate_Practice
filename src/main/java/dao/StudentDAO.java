package dao;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import entity.Student;
import util.HibernateUtil;

public class StudentDAO {
	HibernateUtil util = new HibernateUtil();
	public void addStudent(Student student) {
		try(Session session = util.getSessionFactory().openSession()){
			Transaction tx = session.beginTransaction();
			session.persist(student);
			System.out.println("Student Added");
			tx.commit();
		} catch(Exception e) {
			System.out.println(e.getMessage()); 
		}
	}
	
	public void viewStudent() {
		try(Session session = util.getSessionFactory().openSession()){
			List<Student> students = session.createQuery("from Student", Student.class).list();
			for(Student s : students) {
				System.out.println(s.toString());
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void searchStudent(int id) {
		try(Session session = util.getSessionFactory().openSession()){
			Student s = session.find(Student.class, id);
			System.out.println(s);
		} catch(Exception e) {
			System.out.println(e.getMessage()); 
		}
	}
	
	public void updateStudent(Student student) {
		try(Session session = util.getSessionFactory().openSession()){
			Transaction tx = session.beginTransaction();
			session.merge(student);
			tx.commit();
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void deleteStudent(int id) {
		try(Session session = util.getSessionFactory().openSession()){
			Transaction tx = session.beginTransaction();
			Student s = session.get(Student.class, id);
			if(s != null) {session.remove(s);} else {System.out.println("Couldn't Find User");}
			tx.commit();
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
