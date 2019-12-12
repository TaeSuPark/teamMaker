package com.peachBro.teammaker.login.web;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.peachBro.teammaker.cmm.session.SessionManageUtil;
import com.peachBro.teammaker.login.service.LoginService;
import com.peachBro.teammaker.login.vo.LoginVO;


@Controller
public class LoginController {
	Logger LOGGER = LoggerFactory.getLogger(LoginController.class);
	
	
	@Resource(name="loginService")
	LoginService loginService;
	
	
	@RequestMapping(value="/login/loginHome.do")
	public String loginHome(Model model, LoginVO vo, HttpServletRequest request, HttpServletResponse response) throws Exception {
        LOGGER.debug("»£√‚µ ");
        
		return "/login/loginHome";
    }
	
	@RequestMapping(value="/login/joinHome.do")
	public String joinHome(Model model, LoginVO vo, HttpServletRequest request, HttpServletResponse response) throws Exception {
        LOGGER.debug("»£√‚µ ");
        
		return "/login/joinHome";
    }
	
	@RequestMapping(value="/login/loginCheck.do")
	public String loginCheck(Model model, LoginVO vo, HttpServletRequest request, HttpServletResponse response) throws Exception {
        LOGGER.debug("»£√‚µ ");
        LoginVO login = new LoginVO();
        int temp = 0;
        login = loginService.loginUser(vo);
        if(login != null) {
        	SessionManageUtil.setLoginInfo(request, login);
        	temp = 1;
        }
        model.addAttribute("login", login);
        model.addAttribute("temp", temp);
		return "/login/loginCheck";
    }
	
	@RequestMapping(value="/login/joinCheck.do")
	public String joinCheck(Model model, LoginVO vo, HttpServletRequest request, HttpServletResponse response) throws Exception {
		LOGGER.debug("»£√‚µ ");
		LoginVO join = new LoginVO();
		int temp = 0;
        join = loginService.joinUser(vo);
        if(join != null) {
        	temp = 1;
        }
        model.addAttribute("join",join);
        model.addAttribute("temp",temp);
		return "/login/joinCheck";
    }
	
}