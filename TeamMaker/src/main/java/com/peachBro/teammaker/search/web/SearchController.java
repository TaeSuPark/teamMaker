package com.peachBro.teammaker.search.web;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.peachBro.teammaker.search.service.SearchService;
import com.peachBro.teammaker.search.vo.SearchVO;


@Controller
public class SearchController {
	Logger LOGGER = LoggerFactory.getLogger(SearchController.class);
	
	
	@Resource(name="searchService")
	SearchService searchService;
	
	@RequestMapping(value="/search/searchHome_A.do")
	public String searchHome_A(Model model, SearchVO vo, HttpServletRequest request, HttpServletResponse response) throws Exception {
        LOGGER.debug("»£√‚µ ");
        model.addAttribute("List_A", searchService.contestList_A(vo));
        
		return "/search/searchHome_A";
    }
	
	@RequestMapping(value="/search/searchHome_B.do")
	public String searchHome_B(Model model, SearchVO vo, HttpServletRequest request, HttpServletResponse response) throws Exception {
        LOGGER.debug("»£√‚µ ");
        model.addAttribute("List_B", searchService.contestList_B(vo));
        
		return "/search/searchHome_B";
    }
	
	@RequestMapping(value="/search/searchDetail.do")
	public String searchDetail(Model model, SearchVO vo, HttpServletRequest request, HttpServletResponse response) throws Exception {
        LOGGER.debug("»£√‚µ ");
        LOGGER.info(vo + "æ»≥Á«œººø‰~~~~~~~~");
        model.addAttribute("list", searchService.contestDetail(vo));
        
		return "/search/searchDetail";
    }

}