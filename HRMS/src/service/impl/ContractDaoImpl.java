package service.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import db.MyHibernateSessionFactory;
import entity.Contract;
import entity.Train;
import service.ContractDao;
import util.Util;

public class ContractDaoImpl implements ContractDao{

	@Override
	public boolean addContract(Contract c) {
		c.setCid(Util.getNewId("cid", "Contract"));
		Transaction ts = null;
		try {
			Session session = MyHibernateSessionFactory.getSessionFactory()
					.getCurrentSession();
			ts = session.beginTransaction();
			session.save(c);
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
	public boolean deleteContract(String cid) {
		Transaction ts = null;
		try {
			Session session = MyHibernateSessionFactory.getSessionFactory()
					.getCurrentSession();
			ts = session.beginTransaction();
			Contract s = session.get(Contract.class, cid);
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
	public boolean updateContract(Contract c) {
		Transaction ts = null;
		try {
			Session session = MyHibernateSessionFactory.getSessionFactory()
					.getCurrentSession();
			ts = session.beginTransaction();
			session.update(c);
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
	public Contract queryContractByCid(String cid) {
		Transaction ts = null;
		Contract s = null;
		try {
			Session session = MyHibernateSessionFactory.getSessionFactory()
					.getCurrentSession();
			ts = session.beginTransaction();
			s = session.get(Contract.class, cid);
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
	public List<Contract> queryAllContract() {
		Transaction ts = null;
		List<Contract> list = null;
		String hql = "";
		try {
			Session session = MyHibernateSessionFactory.getSessionFactory()
					.getCurrentSession();
			hql = "from Contract";
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
