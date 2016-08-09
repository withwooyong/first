package first.clip.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.sound.sampled.Clip;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import first.clip.service.ClipService;
import first.common.common.CommandMap;

@Controller
public class ClipController {
	
	protected Logger log = LoggerFactory.getLogger(this.getClass());	

	@Resource(name = "clipService")
	private ClipService service;
	
	@RequestMapping(value = "/clip/clip.do")
	public String clip(CommandMap commandMap) throws Exception {
		return "/clip/clip";
	}

	/**
	 * 리스트(검색리스트포함) 
	 * @param commandMap
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/clip/list.do")
	public ModelAndView list(CommandMap commandMap) throws Exception {
		ModelAndView mv = new ModelAndView("jsonView");
		List<Map<String, Object>> list = service.list(commandMap.getMap());
		mv.addObject("list", list);
		return mv;
	}
	
	@RequestMapping(value = "/clip/lists.do")
	public ModelAndView lists(CommandMap commandMap) throws Exception {
		ModelAndView mv = new ModelAndView("jsonView");
		List<Clip> list = service.lists(commandMap.getMap());
		for (Clip clip : list) {
			log.info("lists={}", clip.toString());
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
	@RequestMapping(value = "/clip/detail.do")
	public ModelAndView detail(CommandMap commandMap) throws Exception {
		ModelAndView mv = new ModelAndView("jsonView");
		Map<String, Object> map = service.detail(commandMap.getMap());
		mv.addObject("map", map);
		return mv;
	}
		
	@RequestMapping(value="/clip/save.do")
	public ModelAndView save(CommandMap commandMap, HttpServletRequest request) throws Exception{
		ModelAndView mv = new ModelAndView("redirect:/clip/main.do");		
		int msg = (int)service.update(commandMap.getMap(), request);
		mv.addObject("success", "success count=" + msg);
		return mv;
	}

}
