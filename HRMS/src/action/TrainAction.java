package action;

import java.text.SimpleDateFormat;
import java.util.List;

import service.TrainDao;
import service.impl.TrainDaoImpl;
import entity.Train;

public class TrainAction extends SuperAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String query() {
		TrainDao TrainDao = new TrainDaoImpl();
		List<Train> list = TrainDao.queryAllTrain();
		if (list != null && list.size() > 0) {
			session.setAttribute("Train_list", list);
		}
		return "Train_query_success";
	}

	public String delete() {
		TrainDao TrainDao = new TrainDaoImpl();
		String tid = request.getParameter("tid");
		TrainDao.deleteTrain(tid);
		return "Train_delete_success";
	}

	public String add() throws Exception {
		TrainDao TrainDao = new TrainDaoImpl();
		Train t = new Train();
		t.setCount(Integer.parseInt(request.getParameter("count")));
		t.setName(request.getParameter("name"));
		t.setTutor(request.getParameter("tutor"));
		t.setType(request.getParameter("type"));
		TrainDao.addTrain(t);
		return "Train_add_success";
	}

	public String modify() {
		String tid = request.getParameter("tid");
		TrainDao TrainDao = new TrainDaoImpl();
		Train s = TrainDao.queryTrainByTid(tid);
		// 保存在会话中
		session.setAttribute("modify_Train", s);
		return "Train_modify_success";
	}

	public String save() throws Exception {
		TrainDao TrainDao = new TrainDaoImpl();
		Train t = new Train();
		t.setTid(request.getParameter("tid"));
		t.setCount(Integer.parseInt(request.getParameter("count")));
		t.setName(request.getParameter("name"));
		t.setTutor(request.getParameter("tutor"));
		t.setType(request.getParameter("type"));
		TrainDao.updateTrain(t);
		return "Train_save_success";
	}

}
