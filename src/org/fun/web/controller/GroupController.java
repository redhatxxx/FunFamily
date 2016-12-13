package org.fun.web.controller;

import javax.annotation.Resource;

import org.fun.web.dao.bean.GroupBaseBean;
import org.fun.web.server.IGroupBeanManager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/group")
public class GroupController {
	
	@Resource
	private IGroupBeanManager groupmanager;

	public IGroupBeanManager getGroupmanager() {
		return groupmanager;
	}

	public void setGroupmanager(IGroupBeanManager groupmanager) {
		this.groupmanager = groupmanager;
	}
	
	@RequestMapping("addgroup")
	public void addGroup(GroupBaseBean bean,Model model){
		
	}
	
	@RequestMapping("deletegroup")
	public void deleteGroup(String groupId,Model model){
		
	}
	
	@RequestMapping("getgroup")
	public void getGroup(String groupId,Model model){
		
	}
	
	@RequestMapping("grouplist")
	public void getGroupList(Model model){
		
	}
	
	@RequestMapping("savegroup")
	public void saveGroup(GroupBaseBean bean,Model model){
		
	}
}
