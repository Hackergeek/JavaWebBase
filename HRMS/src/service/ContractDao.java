package service;

import java.util.List;

import entity.Contract;

public interface ContractDao {
	// 发布招聘信息
	public boolean addContract(Contract c);

	// 删除招聘信息
	public boolean deleteContract(String cid);

	// 修改招聘信息
	public boolean updateContract(Contract c);

	// 查询招聘信息
	public Contract queryContractByCid(String cid);

	// 查询所有招聘信息
	public List<Contract> queryAllContract();
}
