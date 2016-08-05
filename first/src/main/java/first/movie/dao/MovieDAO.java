package first.movie.dao;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import first.common.dao.AbstractDAO;
import first.common.vo.Movie;

@Repository("movieDAO")
public class MovieDAO extends AbstractDAO {

	protected Logger log = LoggerFactory.getLogger(this.getClass());
	
	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> list(Map<String, Object> map) throws Exception {
		return (List<Map<String, Object>>) selectPagingList("movie_SQL.list", map);
	}	
	
	@SuppressWarnings("unchecked")
	public List<Movie> lists(Map<String, Object> map) throws Exception {
		return (List<Movie>) selectPagingList("movie_SQL.lists", map);
	}

	@SuppressWarnings("unchecked")
	public Map<String, Object> detail(Map<String, Object> map) throws Exception {
		return (Map<String, Object>) selectOne("movie_SQL.detail", map);
	}
	
	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> movie_image_list(Map<String, Object> map) throws Exception {
		return (List<Map<String, Object>>) selectPagingList("movie_SQL.movie_image_list", map);
	}
	
	public Object insert(Map<String, Object> map) throws Exception{
		return update("movie_SQL.insert", map);
	}
	
	public Object update(Map<String, Object> map) throws Exception{
		return update("movie_SQL.update", map);
	}

	public Object delete(Map<String, Object> map) throws Exception{
		return update("movie_SQL.delete", map);
	}
}
