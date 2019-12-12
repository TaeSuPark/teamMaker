package com.peachBro.teammaker.search.dao;

import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.peachBro.teammaker.search.vo.SearchVO;

import egovframework.rte.psl.dataaccess.mapper.Mapper;

@Mapper("searchDAO")
public interface SearchDAO {

	public List<SearchVO> contestList_A(SearchVO vo);
	
	public List<SearchVO> contestList_B(SearchVO vo);
	
	 public SearchVO contestDetail(SearchVO vo);
}