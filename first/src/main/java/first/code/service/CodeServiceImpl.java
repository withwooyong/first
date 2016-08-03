package first.code.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import first.code.dao.CodeDAO;

@Service("codeService")
public class CodeServiceImpl implements CodeService {
	Logger log = Logger.getLogger(this.getClass());

	@Resource(name = "codeDAO")
	private CodeDAO dao;

	@Override
	public List<Map<String, Object>> selectJworkCode(Map<String, Object> map) throws Exception {
		return dao.selectJworkCode(map);
	}
}
