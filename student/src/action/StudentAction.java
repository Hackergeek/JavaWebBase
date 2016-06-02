package action;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import service.StudentDao;
import service.impl.StudentDaoImpl;
import entity.Student;

//学生Action类
public class StudentAction extends SuperAction{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	//查询所有学生资料的动作
	public String query() {
		StudentDao studentDao = new StudentDaoImpl();
		List<Student> list = studentDao.queryAllStudent();
		if(list != null && list.size() > 0) {
			session.setAttribute("student_list", list);
		}
		return "student_query_success";
	}
	
	//删除学生资料的动作
	public String delete() {
		StudentDao studentDao = new StudentDaoImpl();
		String sid = request.getParameter("sid");
		studentDao.deleteStudent(sid);
		return "student_delete_success";
	}
	
	//添加学生资料的动作
	public String add() throws Exception {
		StudentDao studentDao = new StudentDaoImpl();
		Student s = new Student();
		s.setSname(request.getParameter("sname"));
		s.setGender(request.getParameter("gender"));
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		s.setBirthday(sdf.parse(request.getParameter("birthday")));
		s.setAddress(request.getParameter("address"));
		studentDao.addStudent(s);
		return "student_add_success";
	}
	
	//修改学生资料的动作
	public String modify() {
		
		String sid = request.getParameter("sid");
		StudentDao studentDao = new StudentDaoImpl();
		Student s = studentDao.queryStudentBySid(sid);
		//保存在会话中
		session.setAttribute("modify_student", s);
		return "student_modify_success";
	}
	
	//保存修改后的学生资料动作
	public String save() throws Exception {
		StudentDao studentDao = new StudentDaoImpl();
		Student s = new Student();
		s.setSid(request.getParameter("sid"));
		s.setSname(request.getParameter("sname"));
		s.setGender(request.getParameter("gender"));
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		s.setBirthday(sdf.parse(request.getParameter("birthday")));
		s.setAddress(request.getParameter("address"));
		studentDao.updateStudent(s);
		return "student_save_success";
	}
	
}
