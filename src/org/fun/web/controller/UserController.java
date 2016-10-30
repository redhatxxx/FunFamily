package org.fun.web.controller;

import org.fun.web.dao.UserBaseDao;
import org.fun.web.server.UserAcionMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController{

	@Autowired(required=true)
	private UserAcionMethod usermethod;
	
	@RequestMapping(value="/user_register")
	public String addUser(UserBaseDao dao,Model model){
		UserBaseDao userdao = usermethod.addUser(dao);
		String user_name = userdao.getUser_name();
		model.addAttribute("username", user_name);
		return "/WEB-INF/jsp/user/welcomeuser";
	}
	
	@RequestMapping(value="/user_login")
	public String userLogin(UserBaseDao dao,Model model){
		String username = dao.getUser_name();
		model.addAttribute("username", username);
		return "/WEB-INF/jsp/user/welcomeuser";
	}
	
	@RequestMapping(value="login")
	public String loginView(){
		return "/WEB-INF/jsp/user/userlogin";
	}
	
	@RequestMapping(value="register")
	public String registerView(){
		return "/WEB-INF/jsp/user/userregister";
	}
}
