package first.common.dao;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository("commonDAO")
public class CommonDAO extends AbstractDAO {

	protected Logger log = LoggerFactory.getLogger(this.getClass());

	@SuppressWarnings("unchecked")
	public Map<String, Object> selectFileInfo(Map<String, Object> map) throws Exception {
		return (Map<String, Object>) selectOne("common.selectFileInfo", map);
	}
}
