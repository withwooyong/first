package first.episode.controller;

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
import first.common.vo.Episode;
import first.episode.service.EpisodeService;

@Controller
public class EpisodeController {
	
	protected Logger log = LoggerFactory.getLogger(this.getClass());	

	@Resource(name = "episodeService")
	private EpisodeService service;
	
	@RequestMapping(value = "/episode/main.do")
	public String main(CommandMap commandMap) throws Exception {
		
		return "/episode/main";
	}

	/**
	 * 리스트(검색리스트포함) 
	 * @param commandMap
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/episode/list.do")
	public ModelAndView list(CommandMap commandMap) throws Exception {
		ModelAndView mv = new ModelAndView("jsonView");
		List<Map<String, Object>> list = service.list(commandMap.getMap());
		mv.addObject("list", list);
		return mv;
	}
	
	@RequestMapping(value = "/episode/lists.do")
	public ModelAndView lists(CommandMap commandMap) throws Exception {
		ModelAndView mv = new ModelAndView("jsonView");
		List<Episode> list = service.lists(commandMap.getMap());
		for (Episode episode : list) {
			log.info("lists={}", episode.toString());
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
	@RequestMapping(value = "/episode/detail.do")
	public ModelAndView detail(CommandMap commandMap) throws Exception {
		ModelAndView mv = new ModelAndView("jsonView");
		Map<String, Object> map = service.detail(commandMap.getMap());
		mv.addObject("map", map);
		return mv;
	}
		
	@RequestMapping(value="/episode/save.do")
	public ModelAndView save(CommandMap commandMap, HttpServletRequest request) throws Exception{
		ModelAndView mv = new ModelAndView("redirect:/episode/main.do");		
		int msg = (int)service.update(commandMap.getMap(), request);
		mv.addObject("success", "success count=" + msg);
		return mv;
	}

}
