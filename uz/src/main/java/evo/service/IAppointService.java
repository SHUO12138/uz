package evo.service;

import java.util.List;

import evo.model.Appoint;
import evo.util.Page;

public interface IAppointService {

	/**
	 * 插入Appoint对象
	 */
	public void insertAppoint(Appoint appoint);
	
	/**
	 * 删除预约信息(根据预约id)
	 */
	public void deleteAppointByAppointId(Integer appointId);
	
	/**
	 * 根据手机号修改预约信息
	 */
	public void updateAppointByPhoneNum(Appoint appoint);
	
	/**
	 * 查询所有预约信息
	 */
	public List<Appoint> findAppointList();
	
	/**
	 * 查询所有预约信息-分页
	 */
	public List<Appoint> findAppointListByPage(Appoint appoint, Page page);
	
	/**
	 * 根据手机号查询Appoint对象
	 */
	public Appoint findAppointByPhoneNum(String phoneNum);
}
