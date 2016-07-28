package first.movie.controller;

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
import first.common.vo.Movie;
import first.movie.service.MovieService;

@Controller
public class MovieController {
	
	protected Logger log = LoggerFactory.getLogger(this.getClass());	

	@Resource(name = "movieService")
	private MovieService service;

	// http://localhost:8080/first/movie/movie.do
	@RequestMapping(value = "/movie/main.do")
	public String movie(CommandMap commandMap) throws Exception {
		//response.setHeader("cache-control","no-cache,no-store"):
		return "/movie/main";
	}

	/**
	 * 영화리스트(검색리스트포함) 
	 * @param commandMap
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/movie/list.do")
	public ModelAndView list(CommandMap commandMap) throws Exception {
		ModelAndView mv = new ModelAndView("jsonView");
		List<Map<String, Object>> list = service.list(commandMap.getMap());
		mv.addObject("list", list);
		return mv;
	}
	
	@RequestMapping(value = "/movie/lists.do")
	public ModelAndView lists(CommandMap commandMap) throws Exception {
		ModelAndView mv = new ModelAndView("jsonView");
		List<Movie> list = service.lists(commandMap.getMap());
		for (Movie movie : list) {
			log.info("lists={}", movie.toString());
		}
		mv.addObject("list", list);
		return mv;
	}

	/**
	 * 영화상세
	 * @param commandMap
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/movie/detail.do")
	public ModelAndView detail(CommandMap commandMap) throws Exception {
		ModelAndView mv = new ModelAndView("jsonView");
		Map<String, Object> map = service.detail(commandMap.getMap());
		mv.addObject("map", map);
		return mv;
	}
		
	@RequestMapping(value="/movie/save.do")
	public ModelAndView save(CommandMap commandMap, HttpServletRequest request) throws Exception{
		ModelAndView mv = new ModelAndView("redirect:/movie/main.do");		
		//int msg = (int)service.update(commandMap.getMap(), request);
		//mv.addObject("success", "success count=" + msg);
		return mv;
	}

}
