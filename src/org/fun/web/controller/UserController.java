package org.fun.web.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class UserController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("--------------Spring Mvc Start---------------");
		
		String hello = "fight ， redhat";
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("map1", "小红帽");
		map.put("map2", "springmvc");
		map.put("map3", "first test");
		return new ModelAndView("/welcome","map",map);
	}

}
