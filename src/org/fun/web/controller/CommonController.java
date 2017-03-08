package org.fun.web.controller;

import java.util.List;

import javax.annotation.Resource;

import org.fun.web.dao.bean.ActivityBaseBean;
import org.fun.web.server.IActivityBeanManager;
import org.fun.web.server.IUserBeanManager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 基础控制器
 * */
@Controller
public class CommonController {
	
	@Resource(name="usermanager")
	private IUserBeanManager usersever;
	
	@Resource(name="activitymanager")
	private IActivityBeanManager activityserver;
	//主页
	@RequestMapping(value="/index")
	public String jumpFrontPage(Model model){
		List<ActivityBaseBean> activitys = activityserver.getActivityList(null);
		model.addAttribute("activs", activitys);
		return "/jsp/frontpage";
	}

}
