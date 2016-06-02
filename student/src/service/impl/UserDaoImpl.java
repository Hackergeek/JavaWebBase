package service.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import service.UserDao;
import db.MyHibernateSessionFactory;
import entity.User;

public class UserDaoImpl implements UserDao {

	@Override
	public boolean userLogin(User u) {
		Transaction ts = null;
		String hql = "";
		try {
			hql = "from User where username=? and password=?";
			Session session = MyHibernateSessionFactory.getSessionFactory()
					.getCurrentSession();
			ts = session.beginTransaction();
			Query query = session.createQuery(hql);
			query.setParameter(0, u.getUsername());
			query.setParameter(1, u.getPassword());
			List list = query.list();
			ts.commit();
			if (list.size() > 0) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			if (ts != null) {
				ts = null;
			}
		}
	}

}
