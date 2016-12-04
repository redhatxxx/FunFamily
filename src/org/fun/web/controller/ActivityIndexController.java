package org.fun.web.controller;

import java.util.List;

import javax.annotation.Resource;

import org.fun.web.dao.bean.ActivityBaseBean;
import org.fun.web.server.IActivityBeanManager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ActivityIndexController {
	
	@Resource(name="activitymanager")
	private IActivityBeanManager activityserver;
	
	@RequestMapping(value="/activity_index")
	public String ActivityIndex(Model model){
		List<ActivityBaseBean> activitys = activityserver.getActivityList(null);
		model.addAttribute("activs", activitys);
		return "/jsp/activity/ActivityIndex";
	}
	
	@RequestMapping(value="/activity_view")
	public String ActivityInfoView(Model model){
		ActivityBaseBean activitydao = new ActivityBaseBean();
		activitydao.setActivity_id("321123");
		activitydao.setActivity_name("长白山");
		activitydao.setActivity_time("2016/10/24");
		activitydao.setActivity_markPrice("23.1");
		model.addAttribute("activity", activitydao);
		return "/jsp/activity/ActivityInfo";
	}
	
	@RequestMapping(value="/add_activity")
	public String addActivityInfo(RedirectAttributes redirect,ActivityBaseBean from){
		ActivityBaseBean dao = new ActivityBaseBean();
		dao.setActivity_name(from.getActivity_name());
		dao.setActivity_time(from.getActivity_time());
		dao.setActivity_markPrice(from.getActivity_markPrice());
		ActivityBaseBean newdao = activityserver.addActivity(dao);
		return "redirect:/activity_index";
//		redirect.addFlashAttribute("message", "save");
//		return "redirect:/activity_view/"+newdao.getActivity_id();
	}
	
	@RequestMapping(value="/activity_view/{id}")
	public String ActivityInfoView(@PathVariable String id,Model model){
		ActivityBaseBean activitydao = activityserver.getActivity(id);
		model.addAttribute("activity", activitydao);
		return "/jsp/activity/ActivityInfo";
	}
	
	@RequestMapping(value="/to_add_activity")
	public String toAddActivityInfo(){
		return "/jsp/activity/AddActivity";
	}
}
 