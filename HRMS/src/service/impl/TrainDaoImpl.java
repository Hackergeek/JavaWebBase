package service.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import db.MyHibernateSessionFactory;
import entity.Train;
import service.TrainDao;
import util.Util;

public class TrainDaoImpl implements TrainDao{

	@Override
	public boolean addTrain(Train t) {
		t.setTid(Util.getNewId("tid", "Train"));
		Transaction ts = null;
		try {
			Session session = MyHibernateSessionFactory.getSessionFactory()
					.getCurrentSession();
			ts = session.beginTransaction();
			session.save(t);
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
	public boolean deleteTrain(String tid) {
		Transaction ts = null;
		try {
			Session session = MyHibernateSessionFactory.getSessionFactory()
					.getCurrentSession();
			ts = session.beginTransaction();
			Train s = session.get(Train.class, tid);
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
	public boolean updateTrain(Train t) {
		Transaction ts = null;
		try {
			Session session = MyHibernateSessionFactory.getSessionFactory()
					.getCurrentSession();
			ts = session.beginTransaction();
			session.update(t);
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
	public Train queryTrainByTid(String tid) {
		Transaction ts = null;
		Train s = null;
		try {
			Session session = MyHibernateSessionFactory.getSessionFactory()
					.getCurrentSession();
			ts = session.beginTransaction();
			s = session.get(Train.class, tid);
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
	public List<Train> queryAllTrain() {
		Transaction ts = null;
		List<Train> list = null;
		String hql = "";
		try {
			Session session = MyHibernateSessionFactory.getSessionFactory()
					.getCurrentSession();
			hql = "from Train";
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
