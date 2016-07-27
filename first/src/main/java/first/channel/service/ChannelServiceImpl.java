package first.channel.service;

import java.util.HashMap;
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

	@Resource(name = "channelDAO")
	private ChannelDAO channelDao;

	@Override
	public List<Map<String, Object>> selectChannelList(Map<String, Object> map) throws Exception {
		return channelDao.selectChannelList(map);
	}

	@Override
	public void insertChannel(Map<String, Object> map, HttpServletRequest request) throws Exception {
		channelDao.insertChannel(map);

		List<Map<String, Object>> list = fileUtils.parseInsertFileInfo(map, request);
		for (int i = 0, size = list.size(); i < size; i++) {
			channelDao.insertFile(list.get(i));
		}
	}

	@Override
	public Map<String, Object> selectChannelDetail(Map<String, Object> map) throws Exception {
		//channelDao.updateHitCnt(map);
		Map<String, Object> resultMap = new HashMap<String, Object>();
		Map<String, Object> tempMap = channelDao.selectChannelDetail(map);
		resultMap.put("map", tempMap);
//		List<Map<String, Object>> list = channelDao.selectFileList(map);
//		resultMap.put("list", list);

		return resultMap;
	}

	@Override
	public void updateChannel(Map<String, Object> map, HttpServletRequest request) throws Exception {
		channelDao.updateChannel(map);

		channelDao.deleteFileList(map);
		List<Map<String, Object>> list = fileUtils.parseUpdateFileInfo(map, request);
		Map<String, Object> tempMap = null;
		for (int i = 0, size = list.size(); i < size; i++) {
			tempMap = list.get(i);
			if (tempMap.get("IS_NEW").equals("Y")) {
				channelDao.insertFile(tempMap);
			} else {
				channelDao.updateFile(tempMap);
			}
		}
	}

	@Override
	public void deleteChannel(Map<String, Object> map) throws Exception {
		channelDao.deleteChannel(map);
	}

}
