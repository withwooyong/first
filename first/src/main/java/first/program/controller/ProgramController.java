package first.program.controller;

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
import first.common.vo.Program;
import first.program.service.ProgramService;

@Controller
public class ProgramController {
	
	protected Logger log = LoggerFactory.getLogger(this.getClass());	

	@Resource(name = "programService")
	private ProgramService service;
	
	@RequestMapping(value = "/program/main.do")
	public String movie(CommandMap commandMap) throws Exception {
		
		return "/program/main";
	}

	/**
	 * 리스트(검색리스트포함) 
	 * @param commandMap
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/program/list.do")
	public ModelAndView list(CommandMap commandMap) throws Exception {
		ModelAndView mv = new ModelAndView("jsonView");
		List<Map<String, Object>> list = service.list(commandMap.getMap());
		mv.addObject("list", list);
		return mv;
	}
	
	@RequestMapping(value = "/program/lists.do")
	public ModelAndView lists(CommandMap commandMap) throws Exception {
		ModelAndView mv = new ModelAndView("jsonView");
		List<Program> list = service.lists(commandMap.getMap());
		for (Program program : list) {
			log.info("lists={}", program.toString());
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
	@RequestMapping(value = "/program/detail.do")
	public ModelAndView detail(CommandMap commandMap) throws Exception {
		ModelAndView mv = new ModelAndView("jsonView");
		Map<String, Object> map = service.detail(commandMap.getMap());
		mv.addObject("map", map);
		return mv;
	}
		
	@RequestMapping(value="/program/save.do")
	public ModelAndView save(CommandMap commandMap, HttpServletRequest request) throws Exception{
		ModelAndView mv = new ModelAndView("redirect:/program/main.do");		
		int msg = (int)service.update(commandMap.getMap(), request);
		mv.addObject("success", "success count=" + msg);
		return mv;
	}

}
