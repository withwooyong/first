package first.channel.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.json.JSONArray;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import first.channel.dao.ChannelDAO;
import first.common.util.FileUtils;
import first.common.util.JsonUtils;

@Service("channelService")
public class ChannelServiceImpl implements ChannelService {
	
	protected Logger log = LoggerFactory.getLogger(this.getClass());

	@Resource(name = "fileUtils")
	private FileUtils fileUtils;

	@Resource(name = "channelDAO")
	private ChannelDAO dao;

	@Override
	public List<Map<String, Object>> channel_list(Map<String, Object> map) throws Exception {
		return dao.channel_list(map);
	}
	
	@Override
	public Map<String, Object> detail(Map<String, Object> map) throws Exception {
		return dao.detail(map);
	}
	
	@Override
	public List<Map<String, Object>> channel_image_list(Map<String, Object> map) throws Exception {
		return dao.channel_image_list(map);
	}
	
	@Override
	public List<Map<String, Object>> channel_url_list(Map<String, Object> map) throws Exception {
		return dao.channel_url_list(map);
	}

	@Override
	public void insertChannel(Map<String, Object> map, HttpServletRequest request) throws Exception {
		dao.insertChannel(map);

		List<Map<String, Object>> list = fileUtils.parseInsertFileInfo(map, request);
		for (int i = 0, size = list.size(); i < size; i++) {
			dao.insertFile(list.get(i));
		}
	}

	@Override
	public int updateChannel(Map<String, Object> map) throws Exception {
		return dao.updateChannel(map);		
	}
	
	@Override
	public int updateChannelInfo(Map<String, Object> map) throws Exception {
		return dao.updateChannelInfo(map);		
	}
	
	@Override
	public int updateChannelImage(Map<String, Object> map, HttpServletRequest request) throws Exception {		
		int result = 0;
		List<Map<String, Object>> list = fileUtils.parseInsertFileInfo(map, request);
		for (int i = 0, size = list.size(); i < size; i++) {
			//result = dao.updateChannelImage(map);
		}
		return result;		
	}
	
	@Override
	public int updateChannelUrl(Map<String, Object> map) throws Exception {		
		int result = 0;
		JSONObject jsnobject = new JSONObject(map.get("json").toString());
		JSONArray jsonArray = jsnobject.getJSONArray(map.get("arrKey").toString());
		
		for (int i = 0; i < jsonArray.length(); i++) {
	        JSONObject jsonObj = jsonArray.getJSONObject(i);
	        Map<String, Object> jsonMap = JsonUtils.jsonToMap(jsonObj);
	        map.putAll(jsonMap);
	        result = dao.updateChannelUrl(map);
	    }
		return result;
	}

	@Override
	public void deleteChannel(Map<String, Object> map) throws Exception {
		dao.deleteChannel(map);
	}

}
