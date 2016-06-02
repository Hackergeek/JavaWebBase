package entity;

import java.util.EnumSet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.hibernate.tool.schema.TargetType;
import org.junit.Test;

public class TestDatabase {
//
//	// 添加测试数据
//	@Test
//	public void testAddStudent() {
//		// 创建配置对象
//		Configuration configuration = new Configuration().configure();
//		// 创建SessionFactory对象
//		SessionFactory sessionFactory = configuration.buildSessionFactory();
//		// 创建session对象
//		Session session = sessionFactory.getCurrentSession();
//		// 创建事务对象
//		Transaction ts = session.beginTransaction();
//
//		Student s1 = new Student("S0000001", "skyward", "男", new Date(), "未知行星");
//		Student s2 = new Student("S0000002", "geek", "男", new Date(), "未知行星");
//		Student s3 = new Student("S0000004", "hacker", "男", new Date(), "未知行星");
//
//		session.save(s1);
//		session.save(s2);
//		session.save(s3);
//
//		ts.commit();
//		sessionFactory.close();
//	}

	@Test
	public void testSchemaExport() {
		// 创建配置对象
		Configuration configuration = new Configuration().configure();
		// 创建服务注册对象
		StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
				.configure().build();
		// 创建SessionFactory
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		// 创建session对象
		Session session = sessionFactory.getCurrentSession();
		// 创建SchemaExport对象
		SchemaExport schemaExport = new SchemaExport();

		Metadata metadata = new MetadataSources(serviceRegistry)
				.buildMetadata();

		schemaExport.create(EnumSet.of(TargetType.DATABASE), metadata);
	}

}
