package first.clip.dao;

import java.util.List;
import java.util.Map;

import javax.sound.sampled.Clip;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import first.common.dao.AbstractDAO;

@Repository("clipDAO")
public class ClipDAO extends AbstractDAO {

	protected Logger log = LoggerFactory.getLogger(this.getClass());
	
	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> list(Map<String, Object> map) throws Exception {
		return (List<Map<String, Object>>) selectPagingList("clip_SQL.list", map);
	}	
	
	@SuppressWarnings("unchecked")
	public List<Clip> lists(Map<String, Object> map) throws Exception {
		return (List<Clip>) selectPagingList("clip_SQL.lists", map);
	}

	@SuppressWarnings("unchecked")
	public Map<String, Object> detail(Map<String, Object> map) throws Exception {
		return (Map<String, Object>) selectOne("clip_SQL.detail", map);
	}
	
	public Object insert(Map<String, Object> map) throws Exception{
		return update("clip_SQL.insert", map);
	}
	
	public Object update(Map<String, Object> map) throws Exception{
		return update("clip_SQL.update", map);
	}

	public Object delete(Map<String, Object> map) throws Exception{
		return update("clip_SQL.delete", map);
	}
}
