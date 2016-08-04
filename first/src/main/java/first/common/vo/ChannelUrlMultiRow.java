package first.common.vo;

import java.util.List;

import org.apache.ibatis.type.Alias;

@Alias("ChannelUrlMultiRow")
public class ChannelUrlMultiRow extends BaseObject {

	private static final long serialVersionUID = -3407774091565916209L;
	
	private List<ChannelUrl> channrlUrls;

    public List<ChannelUrl> getTargets() {
        return channrlUrls;
    }
    public void setTargets(List<ChannelUrl> channrlUrls) {
        this.channrlUrls = channrlUrls;
    }
}
