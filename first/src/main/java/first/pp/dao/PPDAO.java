package first.pp.dao;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import first.common.dao.AbstractDAO;
import first.common.vo.PP;

@Repository("ppDAO")
public class PPDAO extends AbstractDAO {

	protected Logger log = LoggerFactory.getLogger(this.getClass());
	
	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> list(Map<String, Object> map) throws Exception {
		return (List<Map<String, Object>>) selectPagingList("pp.list", map);
	}	
	
	@SuppressWarnings("unchecked")
	public List<PP> lists(Map<String, Object> map) throws Exception {
		return (List<PP>) selectPagingList("pp.lists", map);
	}

	@SuppressWarnings("unchecked")
	public Map<String, Object> detail(Map<String, Object> map) throws Exception {
		return (Map<String, Object>) selectOne("pp.detail", map);
	}
	
	public Object insert(Map<String, Object> map) throws Exception{
		return update("pp.insert", map);
	}
	
	public Object update(Map<String, Object> map) throws Exception{
		return update("pp.update", map);
	}

	public Object delete(Map<String, Object> map) throws Exception{
		return update("pp.delete", map);
	}
}
