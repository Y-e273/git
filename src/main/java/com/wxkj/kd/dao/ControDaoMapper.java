package com.wxkj.kd.dao;

import org.springframework.stereotype.Component;

import com.wxkj.kd.entity.Contro;

@Component
public interface ControDaoMapper {

	public Contro queryForContro(String name);
}
