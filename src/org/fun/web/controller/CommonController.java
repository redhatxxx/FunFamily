package org.fun.web.controller;

import java.util.List;

import javax.annotation.Resource;

import org.fun.web.dao.bean.ActivityBaseBean;
import org.fun.web.server.IActivityBeanManager;
import org.fun.web.server.IGroupBeanManager;
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
	
	@Resource(name="groupmanager")
	private IGroupBeanManager groupserver;
	//主页
	@RequestMapping(value="/index")
	public String jumpFrontPage(Model model){
		List<ActivityBaseBean> activitys = activityserver.getActivityList(null);
		model.addAttribute("activs", activitys);
		return "/jsp/frontpage";
	}
	
	@RequestMapping(value="/managerpage")
	public String jumpManagerPage(Model model){
		return "/jsp/manager/managercontroller";
	}

	@RequestMapping(value="/reloadmanagerpage")
	public String reloadmanagerpage(String param,Model model){
		if(param.equals("1")){//团队
			List grouplist = this.groupserver.getGroupList(null);
			model.addAttribute("grouplist", grouplist);
			model.addAttribute("showgroup", "1");
			model.addAttribute("showuser", "0");
			model.addAttribute("showactiv", "0");
		}
		if(param.equals("2")){//用户
			List userlist = this.usersever.getUserList(null);
			model.addAttribute("userlist", userlist);
			model.addAttribute("showgroup", "0");
			model.addAttribute("showuser", "1");
			model.addAttribute("showactiv", "0");
		}
		if(param.equals("3")){//活动
			List activlist = this.activityserver.getActivityList(null);
			model.addAttribute("activlist", activlist);
			model.addAttribute("showgroup", "0");
			model.addAttribute("showuser", "0");
			model.addAttribute("showactiv", "1");
		}
		return "/jsp/manager/managercontroller";
	}
}
