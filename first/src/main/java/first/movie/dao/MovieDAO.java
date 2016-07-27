package first.movie.dao;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import first.common.dao.AbstractDAO;

@Repository("movieDAO")
public class MovieDAO extends AbstractDAO {

	protected Logger log = LoggerFactory.getLogger(this.getClass());
	
	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> list(Map<String, Object> map) throws Exception {
		return (List<Map<String, Object>>) selectPagingList("movie.list", map);
	}

	@SuppressWarnings("unchecked")
	public Map<String, Object> detail(Map<String, Object> map) throws Exception {
		return (Map<String, Object>) selectOne("movie.detail", map);
	}
	
	public Object insert(Map<String, Object> map) throws Exception{
		return update("movie.insert", map);
	}
	
	public Object update(Map<String, Object> map) throws Exception{
		return update("movie.update", map);
	}

	public Object delete(Map<String, Object> map) throws Exception{
		return update("movie.delete", map);
	}
}
