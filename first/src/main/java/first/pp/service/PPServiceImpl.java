package first.pp.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import first.common.util.FileUtils;
import first.pp.dao.PPDAO;

@Service("ppService")
public class PPServiceImpl implements PPService {
	
	protected Logger log = LoggerFactory.getLogger(this.getClass());

	@Resource(name = "fileUtils")
	private FileUtils fileUtils;

	@Resource(name = "ppDAO")
	private PPDAO dao;
	
	@Override
	public List<Map<String, Object>> mcp_list(Map<String, Object> map) throws Exception {
		return dao.mcp_list(map);
	}
	
	@Override
	public List<Map<String, Object>> scp_list(Map<String, Object> map) throws Exception {
		return dao.scp_list(map);
	}
	
	@Override
	public Map<String, Object> detail(Map<String, Object> map) throws Exception {
		return dao.detail(map);
	}
	
	@Override
	public List<Map<String, Object>> channel_list(Map<String, Object> map) throws Exception {
		return dao.channel_list(map);
	}
}
