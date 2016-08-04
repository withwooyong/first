package first.common.vo;

import org.apache.ibatis.type.Alias;

@Alias("ChannelUrl")
public class ChannelUrl extends BaseObject {

	private static final long serialVersionUID = 1454808891550293891L;
	
	private String CODE_NAME;
	private String BROAD_URL;
	private String PREVIEW_URL;
	private String AUDIO_ONLY_URL;
	private String DEL_YN;
	/**
	 * @return the cODE_NAME
	 */
	public String getCODE_NAME() {
		return CODE_NAME;
	}
	/**
	 * @param cODE_NAME the cODE_NAME to set
	 */
	public void setCODE_NAME(String cODE_NAME) {
		CODE_NAME = cODE_NAME;
	}
	/**
	 * @return the bROAD_URL
	 */
	public String getBROAD_URL() {
		return BROAD_URL;
	}
	/**
	 * @param bROAD_URL the bROAD_URL to set
	 */
	public void setBROAD_URL(String bROAD_URL) {
		BROAD_URL = bROAD_URL;
	}
	/**
	 * @return the pREVIEW_URL
	 */
	public String getPREVIEW_URL() {
		return PREVIEW_URL;
	}
	/**
	 * @param pREVIEW_URL the pREVIEW_URL to set
	 */
	public void setPREVIEW_URL(String pREVIEW_URL) {
		PREVIEW_URL = pREVIEW_URL;
	}
	/**
	 * @return the aUDIO_ONLY_URL
	 */
	public String getAUDIO_ONLY_URL() {
		return AUDIO_ONLY_URL;
	}
	/**
	 * @param aUDIO_ONLY_URL the aUDIO_ONLY_URL to set
	 */
	public void setAUDIO_ONLY_URL(String aUDIO_ONLY_URL) {
		AUDIO_ONLY_URL = aUDIO_ONLY_URL;
	}
	/**
	 * @return the dEL_YN
	 */
	public String getDEL_YN() {
		return DEL_YN;
	}
	/**
	 * @param dEL_YN the dEL_YN to set
	 */
	public void setDEL_YN(String dEL_YN) {
		DEL_YN = dEL_YN;
	}
}
