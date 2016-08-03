package first.code.controller;


import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import first.code.service.CodeService;
import first.common.common.CommandMap;

@Controller
public class CodeController {
	
	protected Logger log = LoggerFactory.getLogger(this.getClass());

	@Resource(name = "codeService")
	private CodeService service;		

	/**
	 *  
	 * @param commandMap
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/code/selectJworkCode.do")
	public ModelAndView selectJworkCode(CommandMap commandMap) throws Exception {
		ModelAndView mv = new ModelAndView("jsonView");
		List<Map<String, Object>> ch_kind_cd_list = service.selectJworkCode(commandMap.getMap());
		mv.addObject("ch_kind_cd_list", ch_kind_cd_list);
		return mv;
	}
	
	
}
