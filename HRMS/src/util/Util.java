package util;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import db.MyHibernateSessionFactory;

public class Util {
	// 生成学生的学号
			public static String getNewId(String primaryName, String tableName) {
				Transaction ts = null;
				String hql = "";
				String id = null;
				String prefix = primaryName.substring(0, 1);
				prefix = prefix.toUpperCase();
				System.out.println(prefix);
				try {
					hql = "select max(" + primaryName + ") from " + tableName;
					Session session = MyHibernateSessionFactory.getSessionFactory()
							.getCurrentSession();
					ts = session.beginTransaction();
					Query query = session.createQuery(hql);
					id = (String) query.uniqueResult();
					if (id == null || id.equals("")) {
						// 默认的最大编号
						id = prefix + "0000001";
					} else {
						String temp = id.substring(1); // 去后七位
						int i = Integer.parseInt(temp); // 转成数字
						i++;
						temp = String.valueOf(i);
						int len = temp.length();
						for (int k = 0; k < 7 - len; k++) {
							temp = "0" + temp;
						}
						id = prefix + temp;
					}
					ts.commit();
					return id;
				} catch (Exception e) {
					e.printStackTrace();
					ts.commit();
					return id;
				} finally {
					if (ts != null) {
						ts = null;
					}
				}
			}
}
