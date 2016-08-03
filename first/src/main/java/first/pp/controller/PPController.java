package first.pp.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import first.common.common.CommandMap;
import first.pp.service.PPService;

@Controller
public class PPController {
	
	protected Logger log = LoggerFactory.getLogger(this.getClass());	

	@Resource(name = "ppService")
	private PPService service;
	
	@RequestMapping(value = "/pp/pp.do")
	public String pp(CommandMap commandMap) throws Exception {		
		return "/pp/pp";
	}
	
	/**
	 * 리스트(검색리스트포함)
	 * 거래처번호, PP사명 
	 * @param commandMap
	 * @return
	 * @throws Exception
	 */	
	@RequestMapping(value = "/pp/mcp_list.do")
	public ModelAndView mcp_list(CommandMap commandMap) throws Exception {
		ModelAndView mv = new ModelAndView("jsonView");
		List<Map<String, Object>> list = service.mcp_list(commandMap.getMap());
		mv.addObject("list", list);
		return mv;
	}
	
	@RequestMapping(value = "/pp/scp_list.do")
	public ModelAndView scp_list(CommandMap commandMap) throws Exception {
		ModelAndView mv = new ModelAndView("jsonView");
		List<Map<String, Object>> list = service.scp_list(commandMap.getMap());
		mv.addObject("list", list);
		return mv;
	}
	
	/**
	 * @param commandMap
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/pp/detail.do")
	public ModelAndView detail(CommandMap commandMap) throws Exception {
		ModelAndView mv = new ModelAndView("jsonView");		
		// PP사정보
		Map<String, Object> map = service.detail(commandMap.getMap());
		List<Map<String, Object>> scp_list = null;
		if ("CPDS0100".equals(commandMap.getMap().get("s_cp_kind"))) {
			scp_list = service.scp_list(commandMap.getMap());
		}
		
		List<Map<String, Object>> channel_list = service.channel_list(commandMap.getMap());
		mv.addObject("map", map);
		mv.addObject("scp_list", scp_list);
		mv.addObject("channel_list", channel_list);
		return mv;
	}
}
