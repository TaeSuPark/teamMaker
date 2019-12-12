package com.peachBro.teammaker.login.service.impl;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.peachBro.teammaker.login.dao.LoginDAO;
import com.peachBro.teammaker.login.service.LoginService;
import com.peachBro.teammaker.login.vo.LoginVO;



@Service("loginService")
public class LoginServiceImpl implements LoginService {

	 private static final Logger LOGGER = LoggerFactory.getLogger(LoginServiceImpl.class);
	 
	 @Resource(name="loginDAO")
	 private LoginDAO loginDAO;
	 
	 public LoginVO joinUser(LoginVO vo) {
		 LoginVO loginvo = new LoginVO();
		 try{
			 if(loginDAO.checkUser(vo) != null) { // 이미 있다는 소리 (null 반환)
				 loginvo = null;
			 }
			 else { //새로 유저 확인 가능
				 loginvo = loginDAO.joinUser(vo); // 회원등록 성공
				 loginvo = vo; //null로의 반환을 막기 위함
			 }
			 LOGGER.info("쿼리 실행 결과 : " + loginvo);
		 }catch(Exception ex){
			 LOGGER.error("",ex);
		 }
		 return loginvo;
	 }
	 
	 public LoginVO loginUser(LoginVO vo) { //아이디 찾아서 비번 확인 (틀리면 null반환)
		 LoginVO loginvo = new LoginVO();
		 try{      
			 loginvo = loginDAO.loginUser(vo);
			 if(vo.getPassword().equals(loginvo.getPassword())) {
				 
			 }
			 else {
				 loginvo = null;
			 }
			 LOGGER.info("쿼리 실행 결과 : " + loginvo);
		 }catch(Exception ex){
			 LOGGER.error("",ex);
		 }
		 return loginvo;
	 }
}
