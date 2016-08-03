package first.channel.service;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

public interface ChannelService {

	List<Map<String, Object>> channel_list(Map<String, Object> map) throws Exception;

	Map<String, Object> detail(Map<String, Object> map) throws Exception;
	
	List<Map<String, Object>> channel_image_list(Map<String, Object> map) throws Exception;
	
	List<Map<String, Object>> channel_url_list(Map<String, Object> map) throws Exception;
	
	void insertChannel(Map<String, Object> map, HttpServletRequest request) throws Exception;

	int updateChannel(Map<String, Object> map) throws Exception;
	
	int updateChannelInfo(Map<String, Object> map) throws Exception;
	
	int updateChannelImage(Map<String, Object> map) throws Exception;
	
	int updateChannelUrl(Map<String, Object> map) throws Exception;

	void deleteChannel(Map<String, Object> map) throws Exception;
	
}
