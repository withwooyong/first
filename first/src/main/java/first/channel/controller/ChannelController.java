package first.channel.controller;


import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import first.channel.service.ChannelService;
import first.common.common.CommandMap;

@Controller
public class ChannelController {
	
	protected Logger log = LoggerFactory.getLogger(this.getClass());

	@Resource(name = "channelService")
	private ChannelService service;

	// http://localhost:8080/first/channel/channel.do
	@RequestMapping(value = "/channel/list.do")
	public String channel(CommandMap commandMap) throws Exception {
		return "/channel/list";
	}	

	@RequestMapping(value = "/channel/selectChannelList.do")
	public ModelAndView selectChannelList(CommandMap commandMap) throws Exception {
		ModelAndView mv = new ModelAndView("jsonView");

		List<Map<String, Object>> list = service.selectChannelList(commandMap.getMap());
		mv.addObject("list", list);
		if (list.size() > 0) {
			mv.addObject("TOTAL", list.get(0).get("TOTAL_COUNT"));
		} else {
			mv.addObject("TOTAL", 0);
		}
		return mv;
	}
	
	@RequestMapping(value = "/channel/selectChannelDetail.do")
	public ModelAndView selectChannelDetail(CommandMap commandMap) throws Exception {
		ModelAndView mv = new ModelAndView("jsonView");
		Map<String, Object> map = service.selectChannelDetail(commandMap.getMap());
		mv.addObject("map", map.get("map"));
		//mv.addObject("list", map.get("list"));
		return mv;
	}

	@RequestMapping(value = "/channel/insertChannel.do")
	public ModelAndView insertChannel(CommandMap commandMap, HttpServletRequest request) throws Exception {
		ModelAndView mv = new ModelAndView("redirect:/channel/openChannelList.do");
		service.insertChannel(commandMap.getMap(), request);
		return mv;
	}	

	@RequestMapping(value = "/channel/openChannelUpdate.do")
	public ModelAndView openChannelUpdate(CommandMap commandMap) throws Exception {
		ModelAndView mv = new ModelAndView("/channel/ChannelUpdate");

		Map<String, Object> map = service.selectChannelDetail(commandMap.getMap());
		mv.addObject("map", map.get("map"));
		mv.addObject("list", map.get("list"));

		return mv;
	}

	@RequestMapping(value = "/channel/updateChannel.do")
	public ModelAndView updateChannel(CommandMap commandMap, HttpServletRequest request) throws Exception {
		ModelAndView mv = new ModelAndView("redirect:/channel/openChannelDetail.do");

		service.updateChannel(commandMap.getMap(), request);

		mv.addObject("IDX", commandMap.get("IDX"));
		return mv;
	}

	@RequestMapping(value = "/channel/deleteChannel.do")
	public ModelAndView deleteChannel(CommandMap commandMap) throws Exception {
		ModelAndView mv = new ModelAndView("redirect:/channel/openChannelList.do");

		service.deleteChannel(commandMap.getMap());

		return mv;
	}
}
