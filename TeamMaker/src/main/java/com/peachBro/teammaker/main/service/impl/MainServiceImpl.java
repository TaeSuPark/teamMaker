package com.peachBro.teammaker.main.service.impl;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.peachBro.teammaker.main.dao.MainDAO;
import com.peachBro.teammaker.main.service.MainService;
import com.peachBro.teammaker.main.vo.MainVO;


@Service("mainService")
public class MainServiceImpl implements MainService {

	 private static final Logger LOGGER = LoggerFactory.getLogger(MainServiceImpl.class);
	 
	 @Resource(name="mainDAO")
	    private MainDAO mainDAO;
	 
	 public MainVO insertTest(MainVO vo) {
	        MainVO mainvo = new MainVO();
	        try{
	            mainvo = mainDAO.insertTest(vo);
	            
	        }catch(Exception ex){
	            LOGGER.error("",ex);
	        }
	        return mainvo;
	    }
}
