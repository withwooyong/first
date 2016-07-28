package first.channel.service;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

public interface ChannelService {

	List<Map<String, Object>> selectChannelList(Map<String, Object> map) throws Exception;

	void insertChannel(Map<String, Object> map, HttpServletRequest request) throws Exception;

	Map<String, Object> selectChannelDetail(Map<String, Object> map) throws Exception;

	void updateChannel(Map<String, Object> map, HttpServletRequest request) throws Exception;

	void deleteChannel(Map<String, Object> map) throws Exception;
	
}