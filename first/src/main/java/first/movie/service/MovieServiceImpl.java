package first.movie.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import first.common.util.FileUtils;
import first.common.vo.Movie;
import first.movie.dao.MovieDAO;

@Service("movieService")
public class MovieServiceImpl implements MovieService {
	
	protected Logger log = LoggerFactory.getLogger(this.getClass());

	@Resource(name = "fileUtils")
	private FileUtils fileUtils;

	@Resource(name = "movieDAO")
	private MovieDAO dao;

	@Override
	public List<Map<String, Object>> list(Map<String, Object> map) throws Exception {
		return dao.list(map);
	}
	
	@Override
	public List<Movie> lists(Map<String, Object> map) throws Exception {
		return dao.lists(map);
	}

	@Override
	public Map<String, Object> detail(Map<String, Object> map) throws Exception {
		return dao.detail(map);
	}
	
	@Override
	public List<Map<String, Object>> movie_image_list(Map<String, Object> map) throws Exception {
		return dao.movie_image_list(map);
	}
	
	@Override
	public int updateMovieImage(Map<String, Object> map, HttpServletRequest request) throws Exception {		
		int result = 0;
		List<Map<String, Object>> list = fileUtils.parseInsertFileInfo(map, request);
		for (int i = 0, size = list.size(); i < size; i++) {
			//result = dao.updateMovieImage(map);
		}
		return result;		
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
	
//	@Override
//	public Map<String, Object> selectMovieDetail(Map<String, Object> map) throws Exception {
//		Map<String, Object> resultMap = new HashMap<String, Object>();
//		Map<String, Object> tempMap = dao.selectMovieDetail(map);
//		resultMap.put("map", tempMap);
//		return resultMap;
//	}

}
