package com.peachBro.teammaker.login.service;

import com.peachBro.teammaker.login.vo.LoginVO;

public interface LoginService {

	public LoginVO joinUser(LoginVO vo);
	
	public LoginVO loginUser(LoginVO vo);
}
