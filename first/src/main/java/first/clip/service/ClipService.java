package first.clip.service;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.sound.sampled.Clip;

public interface ClipService {

	List<Map<String, Object>> list(Map<String, Object> map) throws Exception;
	
	List<Clip> lists(Map<String, Object> map) throws Exception;
	
	Map<String, Object> detail(Map<String, Object> map) throws Exception;
	
	Object insert(Map<String, Object> map, HttpServletRequest request) throws Exception;
	
	Object update(Map<String, Object> map, HttpServletRequest request) throws Exception;

	Object delete(Map<String, Object> map) throws Exception;

}
