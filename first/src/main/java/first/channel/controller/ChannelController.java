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
	@RequestMapping(value = "/channel/main.do")
	public String main(CommandMap commandMap) throws Exception {
		return "/channel/list";
	}	

	/**
	 * 리스트(검색리스트포함) 
	 * 검색어 : 채널코드, 채널명, PP사명, 채널종류 
	 * @param commandMap
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/channel/list.do")
	public ModelAndView list(CommandMap commandMap) throws Exception {
		// 번호, 채널코드, 채널명, 채널번호, OTT채널번호, 화질, 화면비율, 노출순서, 채널종류, PP사명, 알라까르떼, 비로그인시청, 무료여부, 서비스여부, 등록일시, 수정일시 
		ModelAndView mv = new ModelAndView("jsonView");
		List<Map<String, Object>> list = service.list(commandMap.getMap());
		mv.addObject("list", list);
		return mv;
	}
	
	/**
	 * 채널번호, 채널코드, 알라까르떼
	 * 채널명, 채널종류, 비로그인시청
	 * MCP, SCP, 정산ID
	 * 화면비율, 노출순서, 무료여부
	 * 카테고리선택, 가격
	 * HD, 방송구분, 성인채널
	 * 타임시프트, 해외차단, OTT채널번호
	 * 채널설명
	 * 검색어 
	 * 
	 * 채널이미지정보
	 * 
	 * 채널URL정보
	 * 
	 * 
	 * @param commandMap
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/channel/detail.do")
	public ModelAndView detail(CommandMap commandMap) throws Exception {
		ModelAndView mv = new ModelAndView("jsonView");
		Map<String, Object> map = service.detail(commandMap.getMap());
		mv.addObject("map", map.get("map"));
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

		Map<String, Object> map = service.detail(commandMap.getMap());
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
