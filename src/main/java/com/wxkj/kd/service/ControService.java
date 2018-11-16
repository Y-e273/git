package com.wxkj.kd.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wxkj.kd.entity.Contro;
import com.wxkj.kd.entity.Student;

@Service
public interface ControService {

	public Contro queryForContro(String name);

	public List<Student> queryForStudentList();
}
