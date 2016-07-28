package first.channel.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import first.channel.dao.ChannelDAO;
import first.common.util.FileUtils;

@Service("channelService")
public class ChannelServiceImpl implements ChannelService {
	Logger log = Logger.getLogger(this.getClass());

	@Resource(name = "fileUtils")
	private FileUtils fileUtils;

	@Resource(name = "channelDao")
	private ChannelDAO dao;

	@Override
	public List<Map<String, Object>> list(Map<String, Object> map) throws Exception {
		return dao.list(map);
	}
	
	@Override
	public Map<String, Object> detail(Map<String, Object> map) throws Exception {
		return dao.detail(map);
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
	public void updateChannel(Map<String, Object> map, HttpServletRequest request) throws Exception {
		dao.updateChannel(map);

		dao.deleteFileList(map);
		List<Map<String, Object>> list = fileUtils.parseUpdateFileInfo(map, request);
		Map<String, Object> tempMap = null;
		for (int i = 0, size = list.size(); i < size; i++) {
			tempMap = list.get(i);
			if (tempMap.get("IS_NEW").equals("Y")) {
				dao.insertFile(tempMap);
			} else {
				dao.updateFile(tempMap);
			}
		}
	}

	@Override
	public void deleteChannel(Map<String, Object> map) throws Exception {
		dao.deleteChannel(map);
	}

}
