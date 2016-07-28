package first.pp.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import first.common.common.CommandMap;
import first.common.vo.PP;
import first.pp.service.PPService;

@Controller
public class PPController {
	
	protected Logger log = LoggerFactory.getLogger(this.getClass());	

	@Resource(name = "ppService")
	private PPService service;
	
	@RequestMapping(value = "/pp/main.do")
	public String main(CommandMap commandMap) throws Exception {		
		return "/pp/main";
	}

	/**
	 * 리스트(검색리스트포함) 
	 * @param commandMap
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/pp/list.do")
	public ModelAndView list(CommandMap commandMap) throws Exception {
		ModelAndView mv = new ModelAndView("jsonView");
		List<Map<String, Object>> list = service.list(commandMap.getMap());
		mv.addObject("list", list);
		return mv;
	}
	
	@RequestMapping(value = "/pp/lists.do")
	public ModelAndView lists(CommandMap commandMap) throws Exception {
		ModelAndView mv = new ModelAndView("jsonView");
		List<PP> list = service.lists(commandMap.getMap());
		for (PP pp : list) {
			log.info("lists={}", pp.toString());
		}
		mv.addObject("list", list);
		return mv;
	}

	/**
	 * 상세
	 * @param commandMap
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/pp/detail.do")
	public ModelAndView detail(CommandMap commandMap) throws Exception {
		ModelAndView mv = new ModelAndView("jsonView");
		Map<String, Object> map = service.detail(commandMap.getMap());
		mv.addObject("map", map);
		return mv;
	}
		
	@RequestMapping(value="/pp/save.do")
	public ModelAndView save(CommandMap commandMap, HttpServletRequest request) throws Exception{
		ModelAndView mv = new ModelAndView("redirect:/pp/main.do");		
		//int msg = (int)service.update(commandMap.getMap(), request);
		//mv.addObject("success", "success count=" + msg);
		return mv;
	}

}
