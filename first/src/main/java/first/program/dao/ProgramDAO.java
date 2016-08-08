package first.program.dao;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import first.common.dao.AbstractDAO;
import first.common.vo.Program;

@Repository("programDAO")
public class ProgramDAO extends AbstractDAO {

	protected Logger log = LoggerFactory.getLogger(this.getClass());
	
	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> list(Map<String, Object> map) throws Exception {
		return (List<Map<String, Object>>) selectPagingList("program_SQL.list", map);
	}	
	
	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> program_list(Map<String, Object> map) throws Exception {
		return (List<Map<String, Object>>) selectPagingList("program_SQL.program_list", map);
	}
	
	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> episode_list(Map<String, Object> map) throws Exception {
		return (List<Map<String, Object>>) selectPagingList("program_SQL.episode_list", map);
	}
	
	@SuppressWarnings("unchecked")
	public List<Program> lists(Map<String, Object> map) throws Exception {
		return (List<Program>) selectPagingList("program_SQL.lists", map);
	}

	@SuppressWarnings("unchecked")
	public Map<String, Object> detail(Map<String, Object> map) throws Exception {
		return (Map<String, Object>) selectOne("program_SQL.detail", map);
	}
	
	@SuppressWarnings("unchecked")
	public Map<String, Object> program_detail(Map<String, Object> map) throws Exception {
		return (Map<String, Object>) selectOne("program_SQL.program_detail", map);
	}
	
	@SuppressWarnings("unchecked")
	public Map<String, Object> episode_detail(Map<String, Object> map) throws Exception {
		return (Map<String, Object>) selectOne("program_SQL.episode_detail", map);
	}
	
	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> program_image_list(Map<String, Object> map) throws Exception {
		return (List<Map<String, Object>>) selectPagingList("common.image_list", map);
	}
	
	public Object insert(Map<String, Object> map) throws Exception{
		return update("program_SQL.insert", map);
	}
	
	public Object update(Map<String, Object> map) throws Exception{
		return update("program_SQL.update", map);
	}

	public Object delete(Map<String, Object> map) throws Exception{
		return update("program_SQL.delete", map);
	}
}
