package first.code.service;

import java.util.List;
import java.util.Map;

public interface CodeService {

	List<Map<String, Object>> selectJworkCode(Map<String, Object> map) throws Exception;
	
}
