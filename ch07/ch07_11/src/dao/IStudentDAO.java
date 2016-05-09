package dao;

import java.util.List;

import bean.Student;

public interface IStudentDAO {
	Student create(Student stu) throws Exception;
	void remove(Student stu) throws Exception;
	Student find(Student stu) throws Exception;
	List<Student> findAll() throws Exception;
	void update(Student stu) throws Exception;
}
