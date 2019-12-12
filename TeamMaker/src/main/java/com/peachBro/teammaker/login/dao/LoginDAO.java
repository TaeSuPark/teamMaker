package com.peachBro.teammaker.login.dao;

import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.peachBro.teammaker.login.vo.LoginVO;

import egovframework.rte.psl.dataaccess.mapper.Mapper;

@Mapper("loginDAO")
public interface LoginDAO {
	
	public LoginVO joinUser(LoginVO vo);
	
	public LoginVO checkUser(LoginVO vo);
	
	public LoginVO loginUser(LoginVO vo);
}