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
import first.code.service.CodeService;
import first.common.common.CommandMap;

@Controller
public class ChannelController {
	
	protected Logger log = LoggerFactory.getLogger(this.getClass());

	@Resource(name = "channelService")
	private ChannelService service;
	
	@Resource(name = "codeService")
	private CodeService codeService;

	// http://localhost:8080/first/channel/channel.do
	@RequestMapping(value = "/channel/channel.do")
	public String channel(CommandMap commandMap) throws Exception {
		return "/channel/channel";
	}	

	/**
	 * 리스트(검색리스트포함) 
	 * 검색어 : 채널코드, 채널명, PP사명, 채널종류 
	 * @param commandMap
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/channel/channel_list.do")
	public ModelAndView channel_list(CommandMap commandMap) throws Exception {
		// 번호, 채널코드, 채널명, 채널번호, OTT채널번호, 화질, 화면비율, 노출순서, 채널종류, PP사명, 알라까르떼, 비로그인시청, 무료여부, 서비스여부, 등록일시, 수정일시 
		ModelAndView mv = new ModelAndView("jsonView");
		List<Map<String, Object>> channel_list = service.channel_list(commandMap.getMap());
		mv.addObject("channel_list", channel_list);
		
		commandMap.getMap().put("code_group", "CPCS"); // 채널종류코드
		List<Map<String, Object>> channel_kind_cd_list = codeService.selectJworkCode(commandMap.getMap());
		mv.addObject("channel_kind_cd_list", channel_kind_cd_list);
		
		commandMap.getMap().put("code_group", "CVPR"); // 화면비율코드
		List<Map<String, Object>> channel_ratio_cd_list = codeService.selectJworkCode(commandMap.getMap());
		mv.addObject("channel_ratio_cd_list", channel_ratio_cd_list);
		
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
		mv.addObject("map", map);
		
		// 이미지리스트
		List<Map<String, Object>> channel_image_list = service.channel_image_list(commandMap.getMap());
		mv.addObject("channel_image_list", channel_image_list);
		
		// URL리스트
		List<Map<String, Object>> channel_url_list = service.channel_url_list(commandMap.getMap());
		mv.addObject("channel_url_list", channel_url_list);
		
		return mv;
	}

	@RequestMapping(value = "/channel/insertChannel.do")
	public ModelAndView insertChannel(CommandMap commandMap, HttpServletRequest request) throws Exception {
		ModelAndView mv = new ModelAndView("redirect:/channel/openChannelList.do");
		service.insertChannel(commandMap.getMap(), request);
		return mv;
	}	

	@RequestMapping(value = "/channel/updateChannel.do")
	public ModelAndView update_channel(CommandMap commandMap) throws Exception {
		ModelAndView mv = new ModelAndView("jsonView");
		service.updateChannel(commandMap.getMap());
//		mv.addObject("map", map.get("map"));
//		mv.addObject("list", map.get("list"));
		return mv;
	}	
	
	@RequestMapping(value = "/channel/updateChannelInfo.do")
	public ModelAndView updateChannelInfo(CommandMap commandMap) throws Exception {
		ModelAndView mv = new ModelAndView("jsonView");
		service.updateChannelInfo(commandMap.getMap());
		return mv;
	}
	
	@RequestMapping(value = "/channel/updateChannelImage.do")
	public ModelAndView updateChannelInfoImage(CommandMap commandMap) throws Exception {
		ModelAndView mv = new ModelAndView("jsonView");
		service.updateChannelImage(commandMap.getMap());
		return mv;
	}
	
	@RequestMapping(value = "/channel/updateChannelUrl.do")
	public ModelAndView updateChannelInfoUrl(CommandMap commandMap) throws Exception {
		ModelAndView mv = new ModelAndView("jsonView");
		log.debug(commandMap.getMap().toString());
		//service.updateChannelUrl(commandMap.getMap());
		return mv;
	}

	@RequestMapping(value = "/channel/deleteChannel.do")
	public ModelAndView deleteChannel(CommandMap commandMap) throws Exception {
		ModelAndView mv = new ModelAndView("redirect:/channel/openChannelList.do");

		service.deleteChannel(commandMap.getMap());

		return mv;
	}
}
