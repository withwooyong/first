package first.common.vo;

import org.apache.ibatis.type.Alias;

@Alias("Channel")
public class Channel extends BaseObject {
	
	private static final long serialVersionUID = 9094066065786380283L;
	
	private String CH_CD; //	채널코드
	private String CH_NM; //	채널명
	private String CH_KIND_CD; //	채널종류코드
	private int CH_NO; //	채널번호
	private String RATIO_CD; //	화면비율코드
	private int SORT_NO; //	노출순서
	private String PAYFREE_YN; //	무료여부
	private String HD_YN; //	HD여부
	private String ADULT_YN; //	성인채널여부
	private String BROAD_KIND_CD; //	방송구분코드
	private String CH_RMRK; //	채널설명
	private String RMRK; //	비고
	private String AD_YN; //	광고여부
	private String AD_FILE_CD; //	광고파일코드
	private String DEL_YN; //	삭제여부
	private String EPG_CH_CD; //	EPG채널코드
	private String CATE_CD; //	카테고리코드
	private int TIME_SHIFT; //	Timeshift
	private String FP_YN; //	FingerPrinting여부
	private String KWD; //	키워드
	private String INS_ID; //	등록ID
	private String INS_DT; //	등록일시
	private String UPD_ID; //	수정ID
	private String UPD_DT; //	수정일시
	private String DEL_ID; //	삭제ID
	private String DEL_DT; //	삭제일시
	private int PP_CD; //	PP사코드
	private int AMT; //	채널가격
	private int BIL_RULESET; //	가격그룹(빌링연동)
	private String ALA_CARTE_YN; //	알라까르테 사용유무
	private String TRAFFIC_SHARE_CH_CD; //	시청율공유채널코드
	private int OPERATE_TRAFFIC; //	수동 시청율
	private int SCP_CD; //	Sub CP CORP ID(TCM_PP.CORPID)
	private int SETTLE_ID; //	정산율ID
	private String OVERSEA_BLOCK_YN; //	해외차단여부(Y:차단,N:허용)
	private String CH_SHORTCUT_CD; //	채널 바로가기 코드(DNS/URL) 방식
	private String CH_DNS; //	채널 바로가기 명
	private String NOT_LOGIN_WATCH_YN; //	채널 비로그인 시청 여부
	private int OTT_CH_NO; //	OTT채널고유번호
	private String URL_SHARE_CH_CD; //	스팟채널 방송URL공유 채널코드
	private String ENM_CODE; //	이엔엠코드
	/**
	 * @return the cH_CD
	 */
	public String getCH_CD() {
		return CH_CD;
	}
	/**
	 * @param cH_CD the cH_CD to set
	 */
	public void setCH_CD(String cH_CD) {
		CH_CD = cH_CD;
	}
	/**
	 * @return the cH_NM
	 */
	public String getCH_NM() {
		return CH_NM;
	}
	/**
	 * @param cH_NM the cH_NM to set
	 */
	public void setCH_NM(String cH_NM) {
		CH_NM = cH_NM;
	}
	/**
	 * @return the cH_KIND_CD
	 */
	public String getCH_KIND_CD() {
		return CH_KIND_CD;
	}
	/**
	 * @param cH_KIND_CD the cH_KIND_CD to set
	 */
	public void setCH_KIND_CD(String cH_KIND_CD) {
		CH_KIND_CD = cH_KIND_CD;
	}
	/**
	 * @return the cH_NO
	 */
	public int getCH_NO() {
		return CH_NO;
	}
	/**
	 * @param cH_NO the cH_NO to set
	 */
	public void setCH_NO(int cH_NO) {
		CH_NO = cH_NO;
	}
	/**
	 * @return the rATIO_CD
	 */
	public String getRATIO_CD() {
		return RATIO_CD;
	}
	/**
	 * @param rATIO_CD the rATIO_CD to set
	 */
	public void setRATIO_CD(String rATIO_CD) {
		RATIO_CD = rATIO_CD;
	}
	/**
	 * @return the sORT_NO
	 */
	public int getSORT_NO() {
		return SORT_NO;
	}
	/**
	 * @param sORT_NO the sORT_NO to set
	 */
	public void setSORT_NO(int sORT_NO) {
		SORT_NO = sORT_NO;
	}
	/**
	 * @return the pAYFREE_YN
	 */
	public String getPAYFREE_YN() {
		return PAYFREE_YN;
	}
	/**
	 * @param pAYFREE_YN the pAYFREE_YN to set
	 */
	public void setPAYFREE_YN(String pAYFREE_YN) {
		PAYFREE_YN = pAYFREE_YN;
	}
	/**
	 * @return the hD_YN
	 */
	public String getHD_YN() {
		return HD_YN;
	}
	/**
	 * @param hD_YN the hD_YN to set
	 */
	public void setHD_YN(String hD_YN) {
		HD_YN = hD_YN;
	}
	/**
	 * @return the aDULT_YN
	 */
	public String getADULT_YN() {
		return ADULT_YN;
	}
	/**
	 * @param aDULT_YN the aDULT_YN to set
	 */
	public void setADULT_YN(String aDULT_YN) {
		ADULT_YN = aDULT_YN;
	}
	/**
	 * @return the bROAD_KIND_CD
	 */
	public String getBROAD_KIND_CD() {
		return BROAD_KIND_CD;
	}
	/**
	 * @param bROAD_KIND_CD the bROAD_KIND_CD to set
	 */
	public void setBROAD_KIND_CD(String bROAD_KIND_CD) {
		BROAD_KIND_CD = bROAD_KIND_CD;
	}
	/**
	 * @return the cH_RMRK
	 */
	public String getCH_RMRK() {
		return CH_RMRK;
	}
	/**
	 * @param cH_RMRK the cH_RMRK to set
	 */
	public void setCH_RMRK(String cH_RMRK) {
		CH_RMRK = cH_RMRK;
	}
	/**
	 * @return the rMRK
	 */
	public String getRMRK() {
		return RMRK;
	}
	/**
	 * @param rMRK the rMRK to set
	 */
	public void setRMRK(String rMRK) {
		RMRK = rMRK;
	}
	/**
	 * @return the aD_YN
	 */
	public String getAD_YN() {
		return AD_YN;
	}
	/**
	 * @param aD_YN the aD_YN to set
	 */
	public void setAD_YN(String aD_YN) {
		AD_YN = aD_YN;
	}
	/**
	 * @return the aD_FILE_CD
	 */
	public String getAD_FILE_CD() {
		return AD_FILE_CD;
	}
	/**
	 * @param aD_FILE_CD the aD_FILE_CD to set
	 */
	public void setAD_FILE_CD(String aD_FILE_CD) {
		AD_FILE_CD = aD_FILE_CD;
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
	/**
	 * @return the ePG_CH_CD
	 */
	public String getEPG_CH_CD() {
		return EPG_CH_CD;
	}
	/**
	 * @param ePG_CH_CD the ePG_CH_CD to set
	 */
	public void setEPG_CH_CD(String ePG_CH_CD) {
		EPG_CH_CD = ePG_CH_CD;
	}
	/**
	 * @return the cATE_CD
	 */
	public String getCATE_CD() {
		return CATE_CD;
	}
	/**
	 * @param cATE_CD the cATE_CD to set
	 */
	public void setCATE_CD(String cATE_CD) {
		CATE_CD = cATE_CD;
	}
	/**
	 * @return the tIME_SHIFT
	 */
	public int getTIME_SHIFT() {
		return TIME_SHIFT;
	}
	/**
	 * @param tIME_SHIFT the tIME_SHIFT to set
	 */
	public void setTIME_SHIFT(int tIME_SHIFT) {
		TIME_SHIFT = tIME_SHIFT;
	}
	/**
	 * @return the fP_YN
	 */
	public String getFP_YN() {
		return FP_YN;
	}
	/**
	 * @param fP_YN the fP_YN to set
	 */
	public void setFP_YN(String fP_YN) {
		FP_YN = fP_YN;
	}
	/**
	 * @return the kWD
	 */
	public String getKWD() {
		return KWD;
	}
	/**
	 * @param kWD the kWD to set
	 */
	public void setKWD(String kWD) {
		KWD = kWD;
	}
	/**
	 * @return the iNS_ID
	 */
	public String getINS_ID() {
		return INS_ID;
	}
	/**
	 * @param iNS_ID the iNS_ID to set
	 */
	public void setINS_ID(String iNS_ID) {
		INS_ID = iNS_ID;
	}
	/**
	 * @return the iNS_DT
	 */
	public String getINS_DT() {
		return INS_DT;
	}
	/**
	 * @param iNS_DT the iNS_DT to set
	 */
	public void setINS_DT(String iNS_DT) {
		INS_DT = iNS_DT;
	}
	/**
	 * @return the uPD_ID
	 */
	public String getUPD_ID() {
		return UPD_ID;
	}
	/**
	 * @param uPD_ID the uPD_ID to set
	 */
	public void setUPD_ID(String uPD_ID) {
		UPD_ID = uPD_ID;
	}
	/**
	 * @return the uPD_DT
	 */
	public String getUPD_DT() {
		return UPD_DT;
	}
	/**
	 * @param uPD_DT the uPD_DT to set
	 */
	public void setUPD_DT(String uPD_DT) {
		UPD_DT = uPD_DT;
	}
	/**
	 * @return the dEL_ID
	 */
	public String getDEL_ID() {
		return DEL_ID;
	}
	/**
	 * @param dEL_ID the dEL_ID to set
	 */
	public void setDEL_ID(String dEL_ID) {
		DEL_ID = dEL_ID;
	}
	/**
	 * @return the dEL_DT
	 */
	public String getDEL_DT() {
		return DEL_DT;
	}
	/**
	 * @param dEL_DT the dEL_DT to set
	 */
	public void setDEL_DT(String dEL_DT) {
		DEL_DT = dEL_DT;
	}
	/**
	 * @return the pP_CD
	 */
	public int getPP_CD() {
		return PP_CD;
	}
	/**
	 * @param pP_CD the pP_CD to set
	 */
	public void setPP_CD(int pP_CD) {
		PP_CD = pP_CD;
	}
	/**
	 * @return the aMT
	 */
	public int getAMT() {
		return AMT;
	}
	/**
	 * @param aMT the aMT to set
	 */
	public void setAMT(int aMT) {
		AMT = aMT;
	}
	/**
	 * @return the bIL_RULESET
	 */
	public int getBIL_RULESET() {
		return BIL_RULESET;
	}
	/**
	 * @param bIL_RULESET the bIL_RULESET to set
	 */
	public void setBIL_RULESET(int bIL_RULESET) {
		BIL_RULESET = bIL_RULESET;
	}
	/**
	 * @return the aLA_CARTE_YN
	 */
	public String getALA_CARTE_YN() {
		return ALA_CARTE_YN;
	}
	/**
	 * @param aLA_CARTE_YN the aLA_CARTE_YN to set
	 */
	public void setALA_CARTE_YN(String aLA_CARTE_YN) {
		ALA_CARTE_YN = aLA_CARTE_YN;
	}
	/**
	 * @return the tRAFFIC_SHARE_CH_CD
	 */
	public String getTRAFFIC_SHARE_CH_CD() {
		return TRAFFIC_SHARE_CH_CD;
	}
	/**
	 * @param tRAFFIC_SHARE_CH_CD the tRAFFIC_SHARE_CH_CD to set
	 */
	public void setTRAFFIC_SHARE_CH_CD(String tRAFFIC_SHARE_CH_CD) {
		TRAFFIC_SHARE_CH_CD = tRAFFIC_SHARE_CH_CD;
	}
	/**
	 * @return the oPERATE_TRAFFIC
	 */
	public int getOPERATE_TRAFFIC() {
		return OPERATE_TRAFFIC;
	}
	/**
	 * @param oPERATE_TRAFFIC the oPERATE_TRAFFIC to set
	 */
	public void setOPERATE_TRAFFIC(int oPERATE_TRAFFIC) {
		OPERATE_TRAFFIC = oPERATE_TRAFFIC;
	}
	/**
	 * @return the sCP_CD
	 */
	public int getSCP_CD() {
		return SCP_CD;
	}
	/**
	 * @param sCP_CD the sCP_CD to set
	 */
	public void setSCP_CD(int sCP_CD) {
		SCP_CD = sCP_CD;
	}
	/**
	 * @return the sETTLE_ID
	 */
	public int getSETTLE_ID() {
		return SETTLE_ID;
	}
	/**
	 * @param sETTLE_ID the sETTLE_ID to set
	 */
	public void setSETTLE_ID(int sETTLE_ID) {
		SETTLE_ID = sETTLE_ID;
	}
	/**
	 * @return the oVERSEA_BLOCK_YN
	 */
	public String getOVERSEA_BLOCK_YN() {
		return OVERSEA_BLOCK_YN;
	}
	/**
	 * @param oVERSEA_BLOCK_YN the oVERSEA_BLOCK_YN to set
	 */
	public void setOVERSEA_BLOCK_YN(String oVERSEA_BLOCK_YN) {
		OVERSEA_BLOCK_YN = oVERSEA_BLOCK_YN;
	}
	/**
	 * @return the cH_SHORTCUT_CD
	 */
	public String getCH_SHORTCUT_CD() {
		return CH_SHORTCUT_CD;
	}
	/**
	 * @param cH_SHORTCUT_CD the cH_SHORTCUT_CD to set
	 */
	public void setCH_SHORTCUT_CD(String cH_SHORTCUT_CD) {
		CH_SHORTCUT_CD = cH_SHORTCUT_CD;
	}
	/**
	 * @return the cH_DNS
	 */
	public String getCH_DNS() {
		return CH_DNS;
	}
	/**
	 * @param cH_DNS the cH_DNS to set
	 */
	public void setCH_DNS(String cH_DNS) {
		CH_DNS = cH_DNS;
	}
	/**
	 * @return the nOT_LOGIN_WATCH_YN
	 */
	public String getNOT_LOGIN_WATCH_YN() {
		return NOT_LOGIN_WATCH_YN;
	}
	/**
	 * @param nOT_LOGIN_WATCH_YN the nOT_LOGIN_WATCH_YN to set
	 */
	public void setNOT_LOGIN_WATCH_YN(String nOT_LOGIN_WATCH_YN) {
		NOT_LOGIN_WATCH_YN = nOT_LOGIN_WATCH_YN;
	}
	/**
	 * @return the oTT_CH_NO
	 */
	public int getOTT_CH_NO() {
		return OTT_CH_NO;
	}
	/**
	 * @param oTT_CH_NO the oTT_CH_NO to set
	 */
	public void setOTT_CH_NO(int oTT_CH_NO) {
		OTT_CH_NO = oTT_CH_NO;
	}
	/**
	 * @return the uRL_SHARE_CH_CD
	 */
	public String getURL_SHARE_CH_CD() {
		return URL_SHARE_CH_CD;
	}
	/**
	 * @param uRL_SHARE_CH_CD the uRL_SHARE_CH_CD to set
	 */
	public void setURL_SHARE_CH_CD(String uRL_SHARE_CH_CD) {
		URL_SHARE_CH_CD = uRL_SHARE_CH_CD;
	}
	/**
	 * @return the eNM_CODE
	 */
	public String getENM_CODE() {
		return ENM_CODE;
	}
	/**
	 * @param eNM_CODE the eNM_CODE to set
	 */
	public void setENM_CODE(String eNM_CODE) {
		ENM_CODE = eNM_CODE;
	}
}
