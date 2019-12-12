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
			 if(loginDAO.checkUser(vo) != null) { // �̹� �ִٴ� �Ҹ� (null ��ȯ)
				 loginvo = null;
			 }
			 else { //���� ���� Ȯ�� ����
				 loginvo = loginDAO.joinUser(vo); // ȸ����� ����
				 loginvo = vo; //null���� ��ȯ�� ���� ����
			 }
			 LOGGER.info("���� ���� ��� : " + loginvo);
		 }catch(Exception ex){
			 LOGGER.error("",ex);
		 }
		 return loginvo;
	 }
	 
	 public LoginVO loginUser(LoginVO vo) { //���̵� ã�Ƽ� ��� Ȯ�� (Ʋ���� null��ȯ)
		 LoginVO loginvo = new LoginVO();
		 try{      
			 loginvo = loginDAO.loginUser(vo);
			 if(vo.getPassword().equals(loginvo.getPassword())) {
				 
			 }
			 else {
				 loginvo = null;
			 }
			 LOGGER.info("���� ���� ��� : " + loginvo);
		 }catch(Exception ex){
			 LOGGER.error("",ex);
		 }
		 return loginvo;
	 }
}
