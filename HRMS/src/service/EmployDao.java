package service;

import java.util.List;

import entity.Employ;

public interface EmployDao {
	// 发布招聘信息
	public boolean addEmploy(Employ e);

	// 删除招聘信息
	public boolean deleteEmploy(String eid);

	// 修改招聘信息
	public boolean updateEmploy(Employ e);

	// 查询招聘信息
	public Employ queryEmployByEid(String eid);

	// 查询所有招聘信息
	public List<Employ> queryAllEmploy();
}
