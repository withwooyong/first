package first.pp.dao;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import first.common.dao.AbstractDAO;

@Repository("ppDAO")
public class PPDAO extends AbstractDAO {

	protected Logger log = LoggerFactory.getLogger(this.getClass());
	
	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> mcp_list(Map<String, Object> map) throws Exception {
		return (List<Map<String, Object>>) selectPagingList("pp_SQL.mcp_list", map);
	}
	
	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> scp_list(Map<String, Object> map) throws Exception {
		return (List<Map<String, Object>>) selectPagingList("pp_SQL.scp_list", map);
	}
	
	@SuppressWarnings("unchecked")
	public Map<String, Object> detail(Map<String, Object> map) throws Exception {
		return (Map<String, Object>) selectOne("pp_SQL.detail", map);
	}
	
	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> channel_list(Map<String, Object> map) throws Exception {
		return (List<Map<String, Object>>) selectPagingList("pp_SQL.channel_list", map);
	}	
}
