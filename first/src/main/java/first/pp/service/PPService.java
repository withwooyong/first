package first.pp.service;

import java.util.List;
import java.util.Map;

public interface PPService {

	List<Map<String, Object>> mcp_list(Map<String, Object> map) throws Exception;
	
	List<Map<String, Object>> scp_list(Map<String, Object> map) throws Exception;
	
	Map<String, Object> detail(Map<String, Object> map) throws Exception;
	
	List<Map<String, Object>> channel_list(Map<String, Object> map) throws Exception;
	
}
