package first.channel.dao;


import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import first.common.dao.AbstractDAO;

@Repository("channelDAO")
public class ChannelDAO extends AbstractDAO {
	
	protected Logger log = LoggerFactory.getLogger(this.getClass());

	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> channel_list(Map<String, Object> map) throws Exception {
		return (List<Map<String, Object>>) selectPagingList("channel_SQL.channel_list", map);
	}
	
	@SuppressWarnings("unchecked")
	public Map<String, Object> detail(Map<String, Object> map) throws Exception {
		return (Map<String, Object>) selectOne("channel_SQL.detail", map);
	}
	
	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> channel_image_list(Map<String, Object> map) throws Exception {
		return (List<Map<String, Object>>) selectPagingList("channel_SQL.channel_image_list", map);
	}
	
	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> channel_url_list(Map<String, Object> map) throws Exception {
		return (List<Map<String, Object>>) selectPagingList("channel_SQL.channel_url_list", map);
	}
	
	public void insertChannel(Map<String, Object> map) throws Exception {
		insert("channel_SQL.insertChannel", map);
	}

	public void updateHitCnt(Map<String, Object> map) throws Exception {
		update("channel_SQL.updateHitCnt", map);
	}	

	public int updateChannel(Map<String, Object> map) throws Exception {
		return (int)update("channel_SQL.updateChannel", map);
	}
	
	public int updateChannelInfo(Map<String, Object> map) throws Exception {
		return (int)update("channel_SQL.updateChannelInfo", map);
	}
	
	public int updateChannelImage(Map<String, Object> map) throws Exception {
		return (int)update("channel_SQL.updateChannelImage", map);
	}
	
	public int updateChannelUrl(Map<String, Object> map) throws Exception {
		return (int)update("channel_SQL.updateChannelUrl", map);
	}

	public void deleteChannel(Map<String, Object> map) throws Exception {
		update("channel_SQL.deleteChannel", map);
	}

	public void insertFile(Map<String, Object> map) throws Exception {
		insert("channel_SQL.insertFile", map);
	}

	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> selectFileList(Map<String, Object> map) throws Exception {
		return (List<Map<String, Object>>) selectList("channel_SQL.selectFileList", map);
	}

	public void deleteFileList(Map<String, Object> map) throws Exception {
		update("channel_SQL.deleteFileList", map);
	}

	public void updateFile(Map<String, Object> map) throws Exception {
		update("channel_SQL.updateFile", map);
	}

}
