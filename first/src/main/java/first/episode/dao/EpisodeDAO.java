package first.episode.dao;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import first.common.dao.AbstractDAO;
import first.common.vo.Episode;

@Repository("episodeDAO")
public class EpisodeDAO extends AbstractDAO {

	protected Logger log = LoggerFactory.getLogger(this.getClass());
	
	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> list(Map<String, Object> map) throws Exception {
		return (List<Map<String, Object>>) selectPagingList("episode.list", map);
	}	
	
	@SuppressWarnings("unchecked")
	public List<Episode> lists(Map<String, Object> map) throws Exception {
		return (List<Episode>) selectPagingList("episode.lists", map);
	}

	@SuppressWarnings("unchecked")
	public Map<String, Object> detail(Map<String, Object> map) throws Exception {
		return (Map<String, Object>) selectOne("episode.detail", map);
	}
	
	public Object insert(Map<String, Object> map) throws Exception{
		return update("episode.insert", map);
	}
	
	public Object update(Map<String, Object> map) throws Exception{
		return update("episode.update", map);
	}

	public Object delete(Map<String, Object> map) throws Exception{
		return update("episode.delete", map);
	}
}
