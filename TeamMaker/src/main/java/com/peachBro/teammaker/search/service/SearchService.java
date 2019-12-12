package com.peachBro.teammaker.search.service;

import java.util.List;

import com.peachBro.teammaker.main.vo.MainVO;
import com.peachBro.teammaker.search.vo.SearchVO;

public interface SearchService {

	public List<SearchVO> contestList_A(SearchVO vo);
	
	public List<SearchVO> contestList_B(SearchVO vo);
	
	 public SearchVO contestDetail(SearchVO vo);
}
