package first.program.service;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import first.common.vo.Program;

public interface ProgramService {

	List<Map<String, Object>> list(Map<String, Object> map) throws Exception;
	
	List<Map<String, Object>> program_list(Map<String, Object> map) throws Exception;
	
	List<Map<String, Object>> episode_list(Map<String, Object> map) throws Exception;
	
	List<Program> lists(Map<String, Object> map) throws Exception;
	
	Map<String, Object> detail(Map<String, Object> map) throws Exception;
	
	Map<String, Object> program_detail(Map<String, Object> map) throws Exception;
	
	Map<String, Object> episode_detail(Map<String, Object> map) throws Exception;
	
	List<Map<String, Object>> program_image_list(Map<String, Object> map) throws Exception;
	
	int updateProgramImage(Map<String, Object> map, HttpServletRequest request) throws Exception;
	
	Object insert(Map<String, Object> map, HttpServletRequest request) throws Exception;
	
	Object update(Map<String, Object> map, HttpServletRequest request) throws Exception;

	Object delete(Map<String, Object> map) throws Exception;

}
