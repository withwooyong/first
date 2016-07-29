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
	 * 거래처번호, PP사명 
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
		List<Map<String, Object>> list = service.lists(commandMap.getMap());
		mv.addObject("list", list);
		return mv;
	}

	/**
	 * 상세
	 * 
	 * SCP 리스트
	 * 거래처번호, 거래처명, 사업자번호, 대표자명, 사용여부
	 * 
	 * PP사정보
	 * 거래처번호, 거래처명
	 * 사업자번호, 대표자명
	 * 업태, 종목, 거래처분류
	 * 우편번호, 주소
	 * 전화번호, 팩스번호, 사용유무
	 * 담당자이름, 담당자연락처, 담당자이메일
	 * 
	 * PP사 채널목록
	 * 번호, 채널구분, 방송구분, 채널명, HD, 등록일시
	 * @param commandMap
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/pp/detail.do")
	public ModelAndView detail(CommandMap commandMap) throws Exception {
		ModelAndView mv = new ModelAndView("jsonView");
		
		
//		// SCP 리스트
//		List<Map<String, Object>> list = service.list(commandMap.getMap());
//		mv.addObject("list", list);
//		// PP사정보
//		Map<String, Object> map = service.detail(commandMap.getMap());
//		mv.addObject("map", map);
//		// PP사 채널목록
//		List<Map<String, Object>> list = service.list(commandMap.getMap());
//		mv.addObject("list", list);
		
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
