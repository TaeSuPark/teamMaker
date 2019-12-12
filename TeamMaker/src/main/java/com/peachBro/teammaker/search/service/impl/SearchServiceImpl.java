package com.peachBro.teammaker.search.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.peachBro.teammaker.search.dao.SearchDAO;
import com.peachBro.teammaker.search.service.SearchService;
import com.peachBro.teammaker.search.vo.SearchVO;


@Service("searchService")
public class SearchServiceImpl implements SearchService {

	 private static final Logger LOGGER = LoggerFactory.getLogger(SearchServiceImpl.class);
	 
	 @Resource(name="searchDAO")
	    private SearchDAO searchDAO;
	 
	 public List<SearchVO> contestList_A(SearchVO vo) {
		 List<SearchVO> searchvo = null;
	     try{
	    	 searchvo = searchDAO.contestList_A(vo);    
	     }catch(Exception ex){
	    	 LOGGER.error("",ex);
	     }
	     return searchvo;
	 }
	 
	 public List<SearchVO> contestList_B(SearchVO vo) {
		 List<SearchVO> searchvo = null;
	     try{
	    	 searchvo = searchDAO.contestList_B(vo);    
	     }catch(Exception ex){
	    	 LOGGER.error("",ex);
	     }
	     return searchvo;
	 }
	 
	 public SearchVO contestDetail(SearchVO vo) {
		 SearchVO searchvo = new SearchVO();
	     try{
	    	 searchvo = searchDAO.contestDetail(vo);    
	     }catch(Exception ex){
	    	 LOGGER.error("",ex);
	     }
	     return searchvo;
	 }
}
