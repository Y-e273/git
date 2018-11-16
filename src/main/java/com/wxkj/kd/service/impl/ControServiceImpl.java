package com.wxkj.kd.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wxkj.kd.dao.ControDaoMapper;
import com.wxkj.kd.entity.Contro;
import com.wxkj.kd.entity.Student;
import com.wxkj.kd.service.ControService;

@Service
public class ControServiceImpl implements ControService {

	@Autowired
	private ControDaoMapper dao;
	
	/**
	 * 登陆查询
	 */
	@Override
	public Contro queryForContro(String name) {
		Contro contro = dao.queryForContro(name);
		if(contro != null){
			return contro;
		}
		return null;
	}

	/**
	 * 学生查询
	 */
	@Override
	public List<Student> queryForStudentList() {
		List<Student> stuList = dao.queryForStudentList();
		if(stuList!=null){
			return stuList;
		}
		return null;
	}

}
