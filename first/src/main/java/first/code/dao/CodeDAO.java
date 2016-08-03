package first.code.dao;


import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import first.common.dao.AbstractDAO;

@Repository("codeDAO")
public class CodeDAO extends AbstractDAO {
	
	protected Logger log = LoggerFactory.getLogger(this.getClass());

	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> selectJworkCode(Map<String, Object> map) throws Exception {
		return (List<Map<String, Object>>) selectPagingList("code_SQL.selectJworkCode", map);
	}

}
