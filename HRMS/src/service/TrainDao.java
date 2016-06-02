package service;

import java.util.List;

import entity.Train;

public interface TrainDao {
	// 发布招聘信息
	public boolean addTrain(Train t);

	// 删除招聘信息
	public boolean deleteTrain(String tid);

	// 修改招聘信息
	public boolean updateTrain(Train t);

	// 查询招聘信息
	public Train queryTrainByTid(String tid);

	// 查询所有招聘信息
	public List<Train> queryAllTrain();
}
