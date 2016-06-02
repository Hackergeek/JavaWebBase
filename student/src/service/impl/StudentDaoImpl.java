package service.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import db.MyHibernateSessionFactory;
import entity.Student;
import service.StudentDao;

//学生业务逻辑接口的实现类
public class StudentDaoImpl implements StudentDao {

	// 查询所有学生资料
	@Override
	public List<Student> queryAllStudent() {
		Transaction ts = null;
		List<Student> list = null;
		String hql = "";
		try {
			Session session = MyHibernateSessionFactory.getSessionFactory()
					.getCurrentSession();
			hql = "from Student";
			ts = session.beginTransaction();
			Query query = session.createQuery(hql);

			list = query.list();
			ts.commit();
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			ts.commit();
			return list;
		} finally {
			if (ts != null) {
				ts = null;
			}
		}
	}

	// 根据学生编号查询学生资料
	@Override
	public Student queryStudentBySid(String sid) {
		Transaction ts = null;
		Student s = null;
		try {
			Session session = MyHibernateSessionFactory.getSessionFactory()
					.getCurrentSession();
			ts = session.beginTransaction();
			s = session.get(Student.class, sid);
			ts.commit();
			return s;
		} catch (Exception e) {
			e.printStackTrace();
			ts.commit();
			return s;
		} finally {
			if (ts != null) {
				ts = null;
			}
		}
	}

	// 修改学生资料
	@Override
	public boolean updateStudent(Student s) {
		Transaction ts = null;
		try {
			Session session = MyHibernateSessionFactory.getSessionFactory()
					.getCurrentSession();
			ts = session.beginTransaction();
			session.update(s);
			ts.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			ts.commit();
			return false;
		} finally {
			if (ts != null) {
				ts = null;
			}
		}
	}

	// 删除学生资料
	@Override
	public boolean deleteStudent(String sid) {
		Transaction ts = null;
		try {
			Session session = MyHibernateSessionFactory.getSessionFactory()
					.getCurrentSession();
			ts = session.beginTransaction();
			Student s = session.get(Student.class, sid);
			session.delete(s);
			ts.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			ts.commit();
			return false;
		} finally {
			if (ts != null) {
				ts = null;
			}
		}
	}

	// 添加学生资料
	@Override
	public boolean addStudent(Student s) {
		s.setSid(getNewSid());
		Transaction ts = null;
		try {
			Session session = MyHibernateSessionFactory.getSessionFactory()
					.getCurrentSession();
			ts = session.beginTransaction();
			session.save(s);
			ts.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			ts.commit();
			return false;
		} finally {
			if (ts != null) {
				ts = null;
			}
		}
	}

	// 生成学生的学号
	public String getNewSid() {
		Transaction ts = null;
		String hql = "";
		String sid = null;
		try {
			hql = "select max(sid) from Student";
			Session session = MyHibernateSessionFactory.getSessionFactory()
					.getCurrentSession();
			ts = session.beginTransaction();
			Query query = session.createQuery(hql);
			sid = (String) query.uniqueResult();
			if (sid == null || sid.equals("")) {
				// 默认的最大编号
				sid = "S0000001";
			} else {
				String temp = sid.substring(1); // 去后七位
				int i = Integer.parseInt(temp); // 转成数字
				i++;
				temp = String.valueOf(i);
				int len = temp.length();
				for (int k = 0; k < 7 - len; k++) {
					temp = "0" + temp;
				}
				sid = "S" + temp;
			}
			ts.commit();
			return sid;
		} catch (Exception e) {
			e.printStackTrace();
			ts.commit();
			return sid;
		} finally {
			if (ts != null) {
				ts = null;
			}
		}
	}
}
