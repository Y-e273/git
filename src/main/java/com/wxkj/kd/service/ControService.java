package com.wxkj.kd.service;

import org.springframework.stereotype.Service;

import com.wxkj.kd.entity.Contro;

@Service
public interface ControService {

	public Contro queryForContro(String name);
}
