package org.fun.web.controller;

import java.io.File;
import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.fun.web.dao.bean.UserBaseBean;
import org.fun.web.server.IUserBeanManager;
import org.fun.web.server.UserAcionMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping(value="/user")
public class UserController{

	@Autowired(required=true)
	private UserAcionMethod usermethod;
	
	@Resource(name="usermanager")
	private IUserBeanManager usermanager;
	
	@RequestMapping(value="/user_register")
	public String addUser(UserBaseBean user,Model model){
		usermanager.addUser(user);
		model.addAttribute("username", user.getUser_name());
		model.addAttribute("userid", user.getUser_id());
//		UserBaseBean userdao = usermethod.addUser(user);
//		String user_name = userdao.getUser_name();
//		model.addAttribute("username", user_name);
		return "/jsp/user/welcomeuser";
	}
	
	@RequestMapping(value="/user_login")
	public String userLogin(UserBaseBean dao,Model model){
		String username = dao.getUser_name();
		model.addAttribute("username", username);
		return "/jsp/user/welcomeuser";
	}
	
	@RequestMapping(value="/save_userinfo")
	public String saveUserInfo(@RequestParam("usersculpture") MultipartFile usersculpture,UserBaseBean dao,Model model,HttpServletRequest request){
		String imagename = usersculpture.getOriginalFilename();
		File savefile = new File(request.getServletContext().getRealPath("/images"), "upload" + imagename);
		try {
			usersculpture.transferTo(savefile);
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		UserBaseBean user = usermethod.addUser(dao);
		user.setSculptrue_path("upload" + imagename);
		model.addAttribute("userinfo", user);
		return "/jsp/user/userinfo";
	}
	
	@RequestMapping(value="/edit_userinfo")
	public String saveUserInfo(Model model){
		
		return "/jsp/user/edituserinfo";
	}
	@RequestMapping(value="/login")
	public String loginView(){
		return "/jsp/user/userlogin";
	}
	
	@RequestMapping(value="/register")
	public String registerView(){
		return "/jsp/user/userregister";
	}
	

	@RequestMapping(value="/testspring")
	public String testSpring(Model model){
		UserBaseBean user = new UserBaseBean();
		user.setUser_name("Spring");
		user.setUser_password("mvc");
		usermanager.addUser(user);
		model.addAttribute("username", user.getUser_name());
		model.addAttribute("userid", user.getUser_id());
		return "/jsp/user/welcomeuser";
	}
}
