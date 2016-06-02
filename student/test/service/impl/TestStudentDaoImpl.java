package service.impl;

import java.util.Date;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

import service.StudentDao;
import entity.Student;

public class TestStudentDaoImpl {
	@Test
	public void TestQueryAllStudent() {
		List<Student> list = new StudentDaoImpl().queryAllStudent();
		for(Student s : list) {
			System.out.println(s.toString());
		}
	}
	
	@Test
	public void TestGetNewSid() {
		System.out.println(new StudentDaoImpl().getNewSid());
	}
	
	@Test
	public void TestAddStudent() {
		Student s = new Student();
		s.setAddress("Î´ÖªÐÇÏµ");
		s.setBirthday(new Date());
		s.setGender("ÄÐ");
		s.setSname("skyward");
		StudentDao studentDao = new StudentDaoImpl();
		Assert.assertEquals(true, studentDao.addStudent(s));
	}
}
