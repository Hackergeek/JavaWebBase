package service.impl;

import java.util.Date;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

import service.EmployDao;
import util.Util;
import entity.Employ;

public class TestEmployDaoImpl {
	@Test
	public void TestQueryAllEmploy() {
		List<Employ> list = new EmployDaoImpl().queryAllEmploy();
		for(Employ s : list) {
			System.out.println(s.toString());
		}
	}
	
	@Test
	public void TestGetNewSid() {
		System.out.println(Util.getNewId("eid", "Employ"));
	}
	
	@Test
	public void TestAddEmploy() {
		Employ e = new Employ();
		e.setCount(100);
		e.setEndTime(new Date());
		e.setIllustration("’–∆∏≥¨»À");
		e.setJob("≥¨»À");
		e.setStartTime(new Date());
		EmployDao employDao = new EmployDaoImpl();
		Assert.assertEquals(true, employDao.addEmploy(e));
	}
}
