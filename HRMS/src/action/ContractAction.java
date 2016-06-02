package action;

import java.util.List;

import service.ContractDao;
import service.impl.ContractDaoImpl;
import entity.Contract;

public class ContractAction extends SuperAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String query() {
		ContractDao ContractDao = new ContractDaoImpl();
		List<Contract> list = ContractDao.queryAllContract();
		if (list != null && list.size() > 0) {
			session.setAttribute("Contract_list", list);
		}
		return "Contract_query_success";
	}

	public String delete() {
		ContractDao ContractDao = new ContractDaoImpl();
		String eid = request.getParameter("cid");
		ContractDao.deleteContract(eid);
		return "Contract_delete_success";
	}

	public String add() throws Exception {
		ContractDao ContractDao = new ContractDaoImpl();
		Contract c = new Contract();
		c.setSalary(Float.parseFloat(request.getParameter("salary")));
		c.setSid(request.getParameter("sid"));
		c.setType(request.getParameter("type"));
		c.setYear(Integer.parseInt(request.getParameter("year")));
		ContractDao.addContract(c);
		return "Contract_add_success";
	}

	public String modify() {
		String cid = request.getParameter("cid");
		ContractDao ContractDao = new ContractDaoImpl();
		Contract s = ContractDao.queryContractByCid(cid);
		// 保存在会话中
		session.setAttribute("modify_Contract", s);
		return "Contract_modify_success";
	}

	public String save() throws Exception {
		ContractDao ContractDao = new ContractDaoImpl();
		Contract c = new Contract();
		c.setCid(request.getParameter("cid"));
		c.setSalary(Float.parseFloat(request.getParameter("salary")));
		c.setSid(request.getParameter("sid"));
		c.setType(request.getParameter("type"));
		c.setYear(Integer.parseInt(request.getParameter("year")));
		ContractDao.updateContract(c);
		return "Contract_save_success";
	}

}
