package org.fun.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class RegisterAndWelController extends MultiActionController {
	
	public ModelAndView RegisterAction(HttpServletRequest request,HttpServletResponse repost){
		return new ModelAndView("/WEB-INF/jsp/register","method","register");
	}
	
	public ModelAndView WelcomeAction(HttpServletRequest request,HttpServletResponse repost){
		return new ModelAndView("/WEB-INF/jsp/register","method","welcome");
	}
}
