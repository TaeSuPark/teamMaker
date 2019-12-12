package com.peachBro.teammaker.cmm.session;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.peachBro.teammaker.login.vo.LoginVO;

public class SessionManageUtil {

	private static final Logger LOGGER = LoggerFactory.getLogger(SessionManageUtil.class);
    /**
     * 세션에 로그인정보를 설정한다.
     *
     * @param request HttpServletRequest
     * @param loginVO 로그인정보
     */
    public static void setLoginInfo(HttpServletRequest request, LoginVO loginvo) {
        HttpSession session = request.getSession(true);
        if(session!=null&&loginvo!=null) {
            session.setAttribute("loginvo", loginvo);
            request.getSession().setMaxInactiveInterval(60*30);
        }
    }
    /**
     * 세션에서 로그인정보를 가져온다.
     *
     * @param request HttpServletRequest
     * @return 로그인정보
     */
    public static LoginVO getLoginInfo(HttpServletRequest request ) {
    	LoginVO loginvo = null;

        HttpSession session = request.getSession(false);
        if(session != null){
	        Object obj = session.getAttribute("loginvo");
	        if(obj!=null) loginvo = (LoginVO)obj;
        }
    	else LOGGER.debug("Session is null");
        return loginvo;
    }
    /**
     * 세션에 LoginInfoVO가 존재하는지 체크
     *
     * @param request HttpServletRequest
     * @return true: 로그인된경우, false: 로그아웃된경우
     */
    public static boolean isValidSession(HttpServletRequest request) {
        boolean isValid = false;

        LoginVO loginvo = SessionManageUtil.getLoginInfo(request);
        if (loginvo != null) {
            isValid = true;
        }
        return isValid;
    }
}
