package com.wxkj.kd.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wxkj.kd.entity.Contro;
import com.wxkj.kd.entity.Student;
import com.wxkj.kd.service.ControService;

@Controller
public class ControController {

	@Autowired
	private ControService service;
	
	/**
	 * 登陆验证
	 * @param request
	 * @return
	 */
	@RequestMapping("login")
	public String login(HttpServletRequest request){
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		Contro contro = service.queryForContro(username);
		//System.out.println(contro);
		if(contro == null){
			request.setAttribute("errormsg", "用户不存在！");
			return "login";
		}else if(!contro.getPassword().equals(password)){
			request.setAttribute("errormsg", "请正确输入密码！");
			return "login";
		}
		request.setAttribute("contro", contro);
		return "index";
	}
	
	/**
	 * 查询学生列表
	 */
	@RequestMapping("queryForStudentList")
	public String queryForStudentList(HttpServletRequest request){
		List<Student> stuList = service.queryForStudentList();
		if(stuList!=null){
			//System.out.println(stuList);
			return "student/studentList";
		}
		return null;
	}
}
