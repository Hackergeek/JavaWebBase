package service;

import java.util.List;

import entity.Student;

//学生业务逻辑接口
public interface StudentDao {

	// 查询所有学生资料
	public List<Student> queryAllStudent();

	// 根据学生编号查询学生资料
	public Student queryStudentBySid(String sid);
	
	// 添加学生资料
	public boolean addStudent(Student s);

	// 修改学生资料
	public boolean updateStudent(Student s);

	// 删除学生资料
	public boolean deleteStudent(String sid);
}
