package com.wxkj.kd.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wxkj.kd.dao.ControDaoMapper;
import com.wxkj.kd.entity.Contro;
import com.wxkj.kd.service.ControService;

@Service
public class ControServiceImpl implements ControService {

	@Autowired
	private ControDaoMapper dao;
	
	@Override
	public Contro queryForContro(String name) {
		Contro contro = dao.queryForContro(name);
		if(contro != null){
			return contro;
		}
		return null;
	}

}
