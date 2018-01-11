package org.fun.android.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.fun.web.server.IUserBeanManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/android/user")
public class UserControllerforAndroid {

	@Resource(name="usermanager")
	private IUserBeanManager usermanager;
	
	@RequestMapping("/test")
	@ResponseBody
	public Map<String,String> testInfo(HttpServletRequest req,HttpServletResponse rep){
        String username = req.getParameter("username");
        String pass = req.getParameter("pass");
        
        System.out.println("使用Spring内置的支持："+username +"--->" + pass);

        Map<String, String> map = new HashMap<String, String>();
        if(username.equals("zhr") && pass.equals("123"))
        {
            map.put("results", "login success");
        }
        else
        {
            map.put("results", "login fail");
        }        
        
        
        return map;
	}
	
}
