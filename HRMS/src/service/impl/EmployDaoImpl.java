package service.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import db.MyHibernateSessionFactory;
import entity.Employ;
import service.EmployDao;
import util.Util;

public class EmployDaoImpl implements EmployDao {

	@Override
	public boolean addEmploy(Employ e) {
		e.setEid(Util.getNewId("eid", "Employ"));
		Transaction ts = null;
		try {
			Session session = MyHibernateSessionFactory.getSessionFactory()
					.getCurrentSession();
			ts = session.beginTransaction();
			session.save(e);
			ts.commit();
			return true;
		} catch (Exception ep) {
			ep.printStackTrace();
			ts.commit();
			return false;
		} finally {
			if (ts != null) {
				ts = null;
			}
		}
	}

	@Override
	public boolean deleteEmploy(String eid) {
		Transaction ts = null;
		try {
			Session session = MyHibernateSessionFactory.getSessionFactory()
					.getCurrentSession();
			ts = session.beginTransaction();
			Employ s = session.get(Employ.class, eid);
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

	@Override
	public boolean updateEmploy(Employ e) {
		Transaction ts = null;
		try {
			Session session = MyHibernateSessionFactory.getSessionFactory()
					.getCurrentSession();
			ts = session.beginTransaction();
			session.update(e);
			ts.commit();
			return true;
		} catch (Exception ep) {
			ep.printStackTrace();
			ts.commit();
			return false;
		} finally {
			if (ts != null) {
				ts = null;
			}
		}
	}

	@Override
	public Employ queryEmployByEid(String eid) {
		Transaction ts = null;
		Employ s = null;
		try {
			Session session = MyHibernateSessionFactory.getSessionFactory()
					.getCurrentSession();
			ts = session.beginTransaction();
			s = session.get(Employ.class, eid);
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

	@Override
	public List<Employ> queryAllEmploy() {
		Transaction ts = null;
		List<Employ> list = null;
		String hql = "";
		try {
			Session session = MyHibernateSessionFactory.getSessionFactory()
					.getCurrentSession();
			hql = "from Employ";
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

}
