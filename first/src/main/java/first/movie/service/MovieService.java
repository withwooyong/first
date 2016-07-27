package first.movie.service;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

public interface MovieService {

	List<Map<String, Object>> list(Map<String, Object> map) throws Exception;
	
	Map<String, Object> detail(Map<String, Object> map) throws Exception;
	
	Object insert(Map<String, Object> map, HttpServletRequest request) throws Exception;
	
	Object update(Map<String, Object> map, HttpServletRequest request) throws Exception;

	Object delete(Map<String, Object> map) throws Exception;

}
