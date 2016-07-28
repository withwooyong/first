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
	public List<Map<String, Object>> list(Map<String, Object> map) throws Exception {
		return (List<Map<String, Object>>) selectPagingList("channel.list", map);
	}
	
	@SuppressWarnings("unchecked")
	public Map<String, Object> detail(Map<String, Object> map) throws Exception {
		return (Map<String, Object>) selectOne("channel.detail", map);
	}
	
	public void insertChannel(Map<String, Object> map) throws Exception {
		insert("channel.insertChannel", map);
	}

	public void updateHitCnt(Map<String, Object> map) throws Exception {
		update("channel.updateHitCnt", map);
	}	

	public void updateChannel(Map<String, Object> map) throws Exception {
		update("channel.updateChannel", map);
	}

	public void deleteChannel(Map<String, Object> map) throws Exception {
		update("channel.deleteChannel", map);
	}

	public void insertFile(Map<String, Object> map) throws Exception {
		insert("channel.insertFile", map);
	}

	@SuppressWarnings("unchecked")
	public List<Map<String, Object>> selectFileList(Map<String, Object> map) throws Exception {
		return (List<Map<String, Object>>) selectList("channel.selectFileList", map);
	}

	public void deleteFileList(Map<String, Object> map) throws Exception {
		update("channel.deleteFileList", map);
	}

	public void updateFile(Map<String, Object> map) throws Exception {
		update("channel.updateFile", map);
	}

}
