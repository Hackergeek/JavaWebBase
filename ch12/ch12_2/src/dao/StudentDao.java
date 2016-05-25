package dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import po.Student;
import util.HibernateUtil;

public class StudentDao {
	public boolean saveStudent(Student student) {
		Session s = null;
		Transaction tx = null;
		try {
			s = HibernateUtil.getThreadLocalSession();
			tx = s.beginTransaction();
			s.save(student);
			tx.commit();
			return true;
		} catch (Exception e) {
			return false;
		} finally {
			HibernateUtil.closeSession();
		}
	}

	public void updateStudent(Student student) {
		Session s = null;
		Transaction tx = null;
		try {
			s = HibernateUtil.getThreadLocalSession();
			tx = s.beginTransaction();
			s.update(student);
			tx.commit();
		} finally {
			HibernateUtil.closeSession();
		}
	}

	public void remove(Student student) {
		Session s = null;
		Transaction tx = null;
		try {
			s = HibernateUtil.getThreadLocalSession();

			tx = s.beginTransaction();
			s.delete(student);
			tx.commit();
		} finally {
			HibernateUtil.closeSession();
		}
	}

	public Student findStudentById(int id) {
		Session s = null;
		try {
			s = HibernateUtil.getThreadLocalSession();
			Student student = (Student) s.get(Student.class, id);
			return student;
		} finally {
			HibernateUtil.closeSession();
		}
	}

	public List<Student> QueryAll() {
		Session s = null;
		try {
			s = HibernateUtil.getThreadLocalSession();
			Query query = s.createQuery("from Stu_info");
			return query.list();
		} finally {
			HibernateUtil.closeSession();
		}
	}

	public List findStudent(String columnName, String value) {
		Session s = null;
		try {
			s = HibernateUtil.getThreadLocalSession();
			Query query = s.createQuery("from stu_info where " + columnName + "=?");
			query.setParameter(0, value);
			return query.list();
		} finally {
			HibernateUtil.closeSession();
		}
	}

}
