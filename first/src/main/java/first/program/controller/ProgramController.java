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

/**
 * 방송프로그램, 에피소드 포함한다.
 * @author user
 *
 */
@Controller
public class ProgramController {
	
	protected Logger log = LoggerFactory.getLogger(this.getClass());	

	@Resource(name = "programService")
	private ProgramService service;

	// http://localhost:8080/first/program/program.do
	@RequestMapping(value = "/program/program.do")
	public String movie(CommandMap commandMap) throws Exception {
		//response.setHeader("cache-control","no-cache,no-store"):
		return "/program/program";
	}

	/**
	 * 검색리스트포함 
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
	
	/**
	 * 검색리스트포함 
	 * @param commandMap
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/program/program_list.do")
	public ModelAndView program_list(CommandMap commandMap) throws Exception {
		ModelAndView mv = new ModelAndView("jsonView");
		List<Map<String, Object>> program_list = service.program_list(commandMap.getMap());
		mv.addObject("program_list", program_list);
		return mv;
	}
	
	@RequestMapping(value = "/program/episode_list.do")
	public ModelAndView episode_list(CommandMap commandMap) throws Exception {
		ModelAndView mv = new ModelAndView("jsonView");
		List<Map<String, Object>> episode_list = service.episode_list(commandMap.getMap());
		mv.addObject("episode_list", episode_list);
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
		// 이미지리스트
		List<Map<String, Object>> program_image_list = service.program_image_list(commandMap.getMap());
		mv.addObject("program_image_list", program_image_list);
		return mv;
	}
	
	/**
	 * 상세
	 * @param commandMap
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/program/program_detail.do")
	public ModelAndView program_detail(CommandMap commandMap) throws Exception {
		ModelAndView mv = new ModelAndView("jsonView");
		Map<String, Object> map = service.program_detail(commandMap.getMap());
		mv.addObject("map", map);
		// 이미지리스트
//		List<Map<String, Object>> program_image_list = service.program_image_list(commandMap.getMap());
//		mv.addObject("program_image_list", program_image_list);
		
		List<Map<String, Object>> episode_list = service.episode_list(commandMap.getMap());
		mv.addObject("episode_list", episode_list);
		
		return mv;
	}
	
	/**
	 * 상세
	 * @param commandMap
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/program/episode_detail.do")
	public ModelAndView episode_detail(CommandMap commandMap) throws Exception {
		ModelAndView mv = new ModelAndView("jsonView");
		Map<String, Object> map = service.episode_detail(commandMap.getMap());
		mv.addObject("map", map);
		return mv;
	}
	
	@RequestMapping(value = "/program/updateProgramImage.do")
	public ModelAndView updateProgramInfoImage(CommandMap commandMap, HttpServletRequest request) throws Exception {
		ModelAndView mv = new ModelAndView("jsonView");
		//ModelAndView mv = new ModelAndView("redirect:/program/program.do");
		service.updateProgramImage(commandMap.getMap(), request);
		return mv;
	}
		
	@RequestMapping(value="/program/save.do")
	public ModelAndView save(CommandMap commandMap, HttpServletRequest request) throws Exception{
		ModelAndView mv = new ModelAndView("redirect:/program/main.do");		
		//int msg = (int)service.update(commandMap.getMap(), request);
		//mv.addObject("success", "success count=" + msg);
		return mv;
	}
}

