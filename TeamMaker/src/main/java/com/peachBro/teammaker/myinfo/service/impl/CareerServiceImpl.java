package com.peachBro.teammaker.myinfo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.peachBro.teammaker.myinfo.dao.CareerDAO;
import com.peachBro.teammaker.myinfo.service.CareerService;
import com.peachBro.teammaker.myinfo.vo.CareerVO;



@Service("careerService")
public class CareerServiceImpl implements CareerService {

	 private static final Logger LOGGER = LoggerFactory.getLogger(CareerServiceImpl.class);
	 
	 @Resource(name="careerDAO")
	 private CareerDAO careerDAO;
	 
	 public List<CareerVO> careerList(CareerVO vo) {
		 List<CareerVO> careervo = null;
	     try{
	    	 careervo = careerDAO.careerList(vo);    
	     }catch(Exception ex){
	    	 LOGGER.error("",ex);
	     }
	     return careervo;
	 }
}
