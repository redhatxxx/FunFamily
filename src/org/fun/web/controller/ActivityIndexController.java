package org.fun.web.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.fun.web.dao.ActivityBaseDao;
import org.fun.web.server.ActivityActionMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ActivityIndexController {
	
	@Autowired(required=true)
	private ActivityActionMethod activityserver;
	
	@RequestMapping(value="/activity_index")
	public String ActivityIndex(Model model){
		List activitys = new ArrayList();
		ActivityBaseDao activitydao1 = new ActivityBaseDao();
		activitydao1.setActivityId("321123");
		activitydao1.setActivityName("长白山");
		activitydao1.setActivityTime("2016/10/24");
		activitydao1.setMarkPrice("23.1");
		ActivityBaseDao activitydao2 = new ActivityBaseDao();
		activitydao2.setActivityId("321123");
		activitydao2.setActivityName("玉龙雪山");
		activitydao2.setActivityTime("2016/10/24");
		activitydao2.setMarkPrice("300");
		activitys.add(activitydao1);
		activitys.add(activitydao2);
		activityserver.addActivity(activitydao1);
		activityserver.addActivity(activitydao2);
		model.addAttribute("activs", activitys);
		return "/WEB-INF/jsp/ActivityIndex";
	}
	
	@RequestMapping(value="/activity_view")
	public String ActivityInfoView(Model model){
		ActivityBaseDao activitydao = new ActivityBaseDao();
		activitydao.setActivityId("321123");
		activitydao.setActivityName("长白山");
		activitydao.setActivityTime("2016/10/24");
		activitydao.setMarkPrice("23.1");
		model.addAttribute("activity", activitydao);
		return "/WEB-INF/jsp/ActivityInfo";
	}
	
	@RequestMapping(value="/add_activity")
	public String addActivityInfo(RedirectAttributes redirect,ActivityBaseDao from){
		ActivityBaseDao dao = new ActivityBaseDao();
		dao.setActivityName(from.getActivityName());
		dao.setActivityTime(from.getActivityTime());
		dao.setMarkPrice(from.getMarkPrice());
		ActivityBaseDao newdao = activityserver.addActivity(dao);
		redirect.addFlashAttribute("message", "save");
		return "redirect:/activity_view/"+newdao.getActivityId();
	}
	
	@RequestMapping(value="/activity_view/{id}")
	public String ActivityInfoView(@PathVariable String id,Model model){
		ActivityBaseDao activitydao = activityserver.getActivity(id);
		model.addAttribute("activity", activitydao);
		return "/WEB-INF/jsp/ActivityInfo";
	}
	
	@RequestMapping(value="/to_add_activity")
	public String toAddActivityInfo(){
		return "/WEB-INF/jsp/AddActivity";
	}
}
 