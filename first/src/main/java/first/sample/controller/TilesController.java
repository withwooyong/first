package first.sample.controller;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import first.common.common.CommandMap;

@Controller
public class TilesController {
	
	protected Logger log = LoggerFactory.getLogger(this.getClass());

	// http://localhost:8080/first/sample/openBoardList.do
	@RequestMapping(value = "/tiles.do")
	public String tilesSample(CommandMap commandMap) throws Exception {
		return "tiles";
	}
}
