package com.wxkj.kd.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.wxkj.kd.entity.Contro;
import com.wxkj.kd.entity.Student;

@Component
public interface ControDaoMapper {

	public Contro queryForContro(String name);

	public List<Student> queryForStudentList();
}
