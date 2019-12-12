package com.peachBro.teammaker.main.web;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.peachBro.teammaker.main.service.MainService;
import com.peachBro.teammaker.main.vo.MainVO;
import com.peachBro.teammaker.search.service.SearchService;
import com.peachBro.teammaker.search.vo.SearchVO;

@Controller
public class MainController {
	Logger LOGGER = LoggerFactory.getLogger(MainController.class);
	
	
	@Resource(name="mainService")
	MainService mainService;
	
	@Resource(name="searchService")
	SearchService searchService;
	
	
	@RequestMapping(value="/main/index.do")
	public String index(Model model, SearchVO vo, HttpServletRequest request, HttpServletResponse response) throws Exception {
        LOGGER.debug("»£√‚µ ");
        model.addAttribute("List_A", searchService.contestList_A(vo));
        model.addAttribute("List_B", searchService.contestList_B(vo));
        
		return "/main/index";
    }
}