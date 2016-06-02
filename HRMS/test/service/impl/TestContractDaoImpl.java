package service.impl;

import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

import service.ContractDao;
import util.Util;
import entity.Contract;

public class TestContractDaoImpl {
	
	//测试合同查询单元
	@Test
	public void TestQueryAllContract() {
		List<Contract> list = new ContractDaoImpl().queryAllContract();
		for (Contract c : list) {
			System.out.println(c.toString());
		}
	}

	//测试添加合同单元
	@Test
	public void TestAddContract() {
		Contract c = new Contract();
		c.setSalary(1000000);
		c.setSid("1");
		c.setType("未知类型");
		c.setYear(10000);
		ContractDao ContractDao = new ContractDaoImpl();
		Assert.assertEquals(true, ContractDao.addContract(c));
	}

	//测试修改合同单元
	@Test
	public void TestUpdateContract() {
		Contract c = new Contract();
		c.setCid("C0000004");
		c.setSalary(1000000);
		c.setSid("1");
		c.setType("kk类型");
		c.setYear(10000);
		ContractDao ContractDao = new ContractDaoImpl();
		Assert.assertEquals(true, ContractDao.updateContract(c));
	}

	//测试删除合同单元
	@Test
	public void TestDeleteContract() {
		ContractDao ContractDao = new ContractDaoImpl();
		Assert.assertEquals(true, ContractDao.deleteContract("C0000002"));
	}
}
