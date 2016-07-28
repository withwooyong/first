package first.episode.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import first.common.util.FileUtils;
import first.common.vo.Episode;
import first.episode.dao.EpisodeDAO;

@Service("episodeService")
public class EpisodeServiceImpl implements EpisodeService {
	
	protected Logger log = LoggerFactory.getLogger(this.getClass());

	@Resource(name = "fileUtils")
	private FileUtils fileUtils;

	@Resource(name = "episodeDAO")
	private EpisodeDAO dao;

	@Override
	public List<Map<String, Object>> list(Map<String, Object> map) throws Exception {
		return dao.list(map);
	}
	
	@Override
	public List<Episode> lists(Map<String, Object> map) throws Exception {
		return dao.lists(map);
	}

	@Override
	public Map<String, Object> detail(Map<String, Object> map) throws Exception {
		return dao.detail(map);
	}
	
	public Object insert(Map<String, Object> map, HttpServletRequest request) throws Exception {
		return dao.insert(map); 
	}
	
	@Override
	public Object update(Map<String, Object> map, HttpServletRequest request) throws Exception {
		return dao.update(map);
	}

	@Override
	public Object delete(Map<String, Object> map) throws Exception {
		return dao.delete(map);
	}
}
