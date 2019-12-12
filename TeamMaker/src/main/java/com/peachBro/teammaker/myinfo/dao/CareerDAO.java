package com.peachBro.teammaker.myinfo.dao;

import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.peachBro.teammaker.myinfo.vo.CareerVO;

import egovframework.rte.psl.dataaccess.mapper.Mapper;

@Mapper("careerDAO")
public interface CareerDAO {

	 public List<CareerVO> careerList(CareerVO vo);
}