package action;

import java.text.SimpleDateFormat;
import java.util.List;

import service.EmployDao;
import service.impl.EmployDaoImpl;
import entity.Employ;

public class EmployAction extends SuperAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String query() {
		EmployDao EmployDao = new EmployDaoImpl();
		List<Employ> list = EmployDao.queryAllEmploy();
		if (list != null && list.size() > 0) {
			session.setAttribute("Employ_list", list);
		}
		return "Employ_query_success";
	}

	public String delete() {
		EmployDao EmployDao = new EmployDaoImpl();
		String eid = request.getParameter("eid");
		EmployDao.deleteEmploy(eid);
		return "Employ_delete_success";
	}

	public String add() throws Exception {
		EmployDao EmployDao = new EmployDaoImpl();
		Employ e = new Employ();
		e.setCount(Integer.parseInt(request.getParameter("count")));
		e.setIllustration(request.getParameter("illustration"));
		e.setJob(request.getParameter("job"));
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		e.setEndTime(sdf.parse(request.getParameter("endTime")));
		e.setStartTime(sdf.parse(request.getParameter("startTime")));
		EmployDao.addEmploy(e);
		return "Employ_add_success";
	}

	public String modify() {
		String eid = request.getParameter("eid");
		EmployDao EmployDao = new EmployDaoImpl();
		Employ s = EmployDao.queryEmployByEid(eid);
		// 保存在会话中
		session.setAttribute("modify_Employ", s);
		return "Employ_modify_success";
	}

	public String save() throws Exception {
		EmployDao EmployDao = new EmployDaoImpl();
		Employ e = new Employ();
		e.setEid(request.getParameter("eid"));
		e.setCount(Integer.parseInt(request.getParameter("count")));
		e.setIllustration(request.getParameter("illustration"));
		e.setJob(request.getParameter("job"));
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		e.setEndTime(sdf.parse(request.getParameter("endTime")));
		e.setStartTime(sdf.parse(request.getParameter("startTime")));
		EmployDao.updateEmploy(e);
		return "Employ_save_success";
	}

}
