package org.fun.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class WelcomeController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		UserTmpInfo user = new UserTmpInfo();
		user.setUsername(arg0.getParameter("name"));
		user.setPassword(arg0.getParameter("password"));
		
		return new ModelAndView("/WEB-INF/jsp/welcomeuser","loginuser",user);
	}

}
