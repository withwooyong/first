package first.common.vo;

import org.apache.ibatis.type.Alias;

@Alias("Episode")
public class Episode extends BaseObject {
	
	private static final long serialVersionUID = -3668846358588363239L;
	
	private String EPI_CD; //	에피소드코드											
	private String EPI_NM; //	에피소드명											
	private String EPI_NM_EN; //	에피소드명_영문											
	private String EPI_NM_SUB; //	에피소드명_SUB											
	private String CATE1_CD; //	카테고리1코드											
	private String CATE2_CD; //	카테고리2코드											
	private String FREQUENCY; //	회차											
	private String BROAD_DT; //	방영일											
	private String GRADE_CD; //	등급코드											
	private String HD_DEF_CD; //	화질종류코드											
	private int RUNTIME_MI; //	재생시간(분)											
	private String RATIO_CD; //	화면비율코드											
	private String ACTOR; //	출연자											
	private String SYNOP; //	시놉시스											
	private String KWD; //	키워드											
	private String KWD_SNS; //	키워드_SNS											
	private String RMRK; //	비고											
	private String DEL_YN; //	삭제여부											
	private String EPG_EPI_CD; //	EPG에피소드코드											
	private String PGM_CD; //	프로그램코드											
	private String GARBAGE_YN; //	GARBAGE_YN											
	private String INS_ID; //	등록ID											
	private String INS_DT; //	등록일시											
	private String UPD_ID; //	수정ID											
	private String UPD_DT; //	수정일시											
	private String DEL_ID; //	삭제ID											
	private String DEL_DT; //	삭제일시											
	private int HIST_SEQ; //	EPG_HIST_SEQ											
	private int VOD_AMT; //	VOD_가격											
	private int BIL_RULESET; //	빌링_룰셋											
	private int MCP_CD; //	MCP											
	private int SCP_CD; //	SCP											
	private int SETTLE_ID; //	정산ID											
	private String NOT_LOGIN_WATCH_YN; //	비로그인 시청 여부											
	private String VOD_WEEKDAY; //	본방영일요일											
	private int DWN_MCP_CD; //	다운로드 MCP											
	private int DWN_SCP_CD; //	다운로드 SCP											
	private int DWN_BIL_RULESET; //	다운로드 룰셋											
	private int DWN_AMT; //	다운로드 가격											
	private int DWN_SETTLE_ID; //	다운로드 정산ID											
	private int DWN_USE_CNT; //	다운로드 사용횟수											
	private String DWN_YN; //	다운로드 사용여부											
	private String CONTENT_ID; //	콘텐츠ID											
	private String TARGETING_CD; //	타게팅 코드 (광고 등)											
	private int STANDARD_PRICE; //	기준가격											
	private String KWD_NAVER; //	네이버 검색 키워드											
	private String ENM_YN; //	CJ E&M 컨텐츠 여부											
	private String SAME_CD; //	CJ E&M  동일 컨텐츠 코드											
	private String FHD_YN; //	Full HD 컨텐츠 여부(Y:Full HD, N:아님)											
	private String PREPIX_NM; //	메타 접두사											
	private String BROAD_TIME; //	방영시간											
	private String DRM_YN; //	DRM적용유무											
	private int AMT_RENTAL; //	대여가격											
	private int AMT_COLLECT; //	소장가격											
	private int DWN_AMT_RENTAL; //	다운로드대여가격											
	private int DWN_AMT_COLLECT; //	다운로드소장가격											
	private String SALE_GUBUN_CODE; //	1 소장, 2 대여, 03 ALL											
	private String ENM_CODE; //	이엔엠코드
	/**
	 * @return the ePI_CD
	 */
	public String getEPI_CD() {
		return EPI_CD;
	}
	/**
	 * @param ePI_CD the ePI_CD to set
	 */
	public void setEPI_CD(String ePI_CD) {
		EPI_CD = ePI_CD;
	}
	/**
	 * @return the ePI_NM
	 */
	public String getEPI_NM() {
		return EPI_NM;
	}
	/**
	 * @param ePI_NM the ePI_NM to set
	 */
	public void setEPI_NM(String ePI_NM) {
		EPI_NM = ePI_NM;
	}
	/**
	 * @return the ePI_NM_EN
	 */
	public String getEPI_NM_EN() {
		return EPI_NM_EN;
	}
	/**
	 * @param ePI_NM_EN the ePI_NM_EN to set
	 */
	public void setEPI_NM_EN(String ePI_NM_EN) {
		EPI_NM_EN = ePI_NM_EN;
	}
	/**
	 * @return the ePI_NM_SUB
	 */
	public String getEPI_NM_SUB() {
		return EPI_NM_SUB;
	}
	/**
	 * @param ePI_NM_SUB the ePI_NM_SUB to set
	 */
	public void setEPI_NM_SUB(String ePI_NM_SUB) {
		EPI_NM_SUB = ePI_NM_SUB;
	}
	/**
	 * @return the cATE1_CD
	 */
	public String getCATE1_CD() {
		return CATE1_CD;
	}
	/**
	 * @param cATE1_CD the cATE1_CD to set
	 */
	public void setCATE1_CD(String cATE1_CD) {
		CATE1_CD = cATE1_CD;
	}
	/**
	 * @return the cATE2_CD
	 */
	public String getCATE2_CD() {
		return CATE2_CD;
	}
	/**
	 * @param cATE2_CD the cATE2_CD to set
	 */
	public void setCATE2_CD(String cATE2_CD) {
		CATE2_CD = cATE2_CD;
	}
	/**
	 * @return the fREQUENCY
	 */
	public String getFREQUENCY() {
		return FREQUENCY;
	}
	/**
	 * @param fREQUENCY the fREQUENCY to set
	 */
	public void setFREQUENCY(String fREQUENCY) {
		FREQUENCY = fREQUENCY;
	}
	/**
	 * @return the bROAD_DT
	 */
	public String getBROAD_DT() {
		return BROAD_DT;
	}
	/**
	 * @param bROAD_DT the bROAD_DT to set
	 */
	public void setBROAD_DT(String bROAD_DT) {
		BROAD_DT = bROAD_DT;
	}
	/**
	 * @return the gRADE_CD
	 */
	public String getGRADE_CD() {
		return GRADE_CD;
	}
	/**
	 * @param gRADE_CD the gRADE_CD to set
	 */
	public void setGRADE_CD(String gRADE_CD) {
		GRADE_CD = gRADE_CD;
	}
	/**
	 * @return the hD_DEF_CD
	 */
	public String getHD_DEF_CD() {
		return HD_DEF_CD;
	}
	/**
	 * @param hD_DEF_CD the hD_DEF_CD to set
	 */
	public void setHD_DEF_CD(String hD_DEF_CD) {
		HD_DEF_CD = hD_DEF_CD;
	}
	/**
	 * @return the rUNTIME_MI
	 */
	public int getRUNTIME_MI() {
		return RUNTIME_MI;
	}
	/**
	 * @param rUNTIME_MI the rUNTIME_MI to set
	 */
	public void setRUNTIME_MI(int rUNTIME_MI) {
		RUNTIME_MI = rUNTIME_MI;
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
	 * @return the aCTOR
	 */
	public String getACTOR() {
		return ACTOR;
	}
	/**
	 * @param aCTOR the aCTOR to set
	 */
	public void setACTOR(String aCTOR) {
		ACTOR = aCTOR;
	}
	/**
	 * @return the sYNOP
	 */
	public String getSYNOP() {
		return SYNOP;
	}
	/**
	 * @param sYNOP the sYNOP to set
	 */
	public void setSYNOP(String sYNOP) {
		SYNOP = sYNOP;
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
	 * @return the kWD_SNS
	 */
	public String getKWD_SNS() {
		return KWD_SNS;
	}
	/**
	 * @param kWD_SNS the kWD_SNS to set
	 */
	public void setKWD_SNS(String kWD_SNS) {
		KWD_SNS = kWD_SNS;
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
	 * @return the ePG_EPI_CD
	 */
	public String getEPG_EPI_CD() {
		return EPG_EPI_CD;
	}
	/**
	 * @param ePG_EPI_CD the ePG_EPI_CD to set
	 */
	public void setEPG_EPI_CD(String ePG_EPI_CD) {
		EPG_EPI_CD = ePG_EPI_CD;
	}
	/**
	 * @return the pGM_CD
	 */
	public String getPGM_CD() {
		return PGM_CD;
	}
	/**
	 * @param pGM_CD the pGM_CD to set
	 */
	public void setPGM_CD(String pGM_CD) {
		PGM_CD = pGM_CD;
	}
	/**
	 * @return the gARBAGE_YN
	 */
	public String getGARBAGE_YN() {
		return GARBAGE_YN;
	}
	/**
	 * @param gARBAGE_YN the gARBAGE_YN to set
	 */
	public void setGARBAGE_YN(String gARBAGE_YN) {
		GARBAGE_YN = gARBAGE_YN;
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
	 * @return the hIST_SEQ
	 */
	public int getHIST_SEQ() {
		return HIST_SEQ;
	}
	/**
	 * @param hIST_SEQ the hIST_SEQ to set
	 */
	public void setHIST_SEQ(int hIST_SEQ) {
		HIST_SEQ = hIST_SEQ;
	}
	/**
	 * @return the vOD_AMT
	 */
	public int getVOD_AMT() {
		return VOD_AMT;
	}
	/**
	 * @param vOD_AMT the vOD_AMT to set
	 */
	public void setVOD_AMT(int vOD_AMT) {
		VOD_AMT = vOD_AMT;
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
	 * @return the mCP_CD
	 */
	public int getMCP_CD() {
		return MCP_CD;
	}
	/**
	 * @param mCP_CD the mCP_CD to set
	 */
	public void setMCP_CD(int mCP_CD) {
		MCP_CD = mCP_CD;
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
	 * @return the vOD_WEEKDAY
	 */
	public String getVOD_WEEKDAY() {
		return VOD_WEEKDAY;
	}
	/**
	 * @param vOD_WEEKDAY the vOD_WEEKDAY to set
	 */
	public void setVOD_WEEKDAY(String vOD_WEEKDAY) {
		VOD_WEEKDAY = vOD_WEEKDAY;
	}
	/**
	 * @return the dWN_MCP_CD
	 */
	public int getDWN_MCP_CD() {
		return DWN_MCP_CD;
	}
	/**
	 * @param dWN_MCP_CD the dWN_MCP_CD to set
	 */
	public void setDWN_MCP_CD(int dWN_MCP_CD) {
		DWN_MCP_CD = dWN_MCP_CD;
	}
	/**
	 * @return the dWN_SCP_CD
	 */
	public int getDWN_SCP_CD() {
		return DWN_SCP_CD;
	}
	/**
	 * @param dWN_SCP_CD the dWN_SCP_CD to set
	 */
	public void setDWN_SCP_CD(int dWN_SCP_CD) {
		DWN_SCP_CD = dWN_SCP_CD;
	}
	/**
	 * @return the dWN_BIL_RULESET
	 */
	public int getDWN_BIL_RULESET() {
		return DWN_BIL_RULESET;
	}
	/**
	 * @param dWN_BIL_RULESET the dWN_BIL_RULESET to set
	 */
	public void setDWN_BIL_RULESET(int dWN_BIL_RULESET) {
		DWN_BIL_RULESET = dWN_BIL_RULESET;
	}
	/**
	 * @return the dWN_AMT
	 */
	public int getDWN_AMT() {
		return DWN_AMT;
	}
	/**
	 * @param dWN_AMT the dWN_AMT to set
	 */
	public void setDWN_AMT(int dWN_AMT) {
		DWN_AMT = dWN_AMT;
	}
	/**
	 * @return the dWN_SETTLE_ID
	 */
	public int getDWN_SETTLE_ID() {
		return DWN_SETTLE_ID;
	}
	/**
	 * @param dWN_SETTLE_ID the dWN_SETTLE_ID to set
	 */
	public void setDWN_SETTLE_ID(int dWN_SETTLE_ID) {
		DWN_SETTLE_ID = dWN_SETTLE_ID;
	}
	/**
	 * @return the dWN_USE_CNT
	 */
	public int getDWN_USE_CNT() {
		return DWN_USE_CNT;
	}
	/**
	 * @param dWN_USE_CNT the dWN_USE_CNT to set
	 */
	public void setDWN_USE_CNT(int dWN_USE_CNT) {
		DWN_USE_CNT = dWN_USE_CNT;
	}
	/**
	 * @return the dWN_YN
	 */
	public String getDWN_YN() {
		return DWN_YN;
	}
	/**
	 * @param dWN_YN the dWN_YN to set
	 */
	public void setDWN_YN(String dWN_YN) {
		DWN_YN = dWN_YN;
	}
	/**
	 * @return the cONTENT_ID
	 */
	public String getCONTENT_ID() {
		return CONTENT_ID;
	}
	/**
	 * @param cONTENT_ID the cONTENT_ID to set
	 */
	public void setCONTENT_ID(String cONTENT_ID) {
		CONTENT_ID = cONTENT_ID;
	}
	/**
	 * @return the tARGETING_CD
	 */
	public String getTARGETING_CD() {
		return TARGETING_CD;
	}
	/**
	 * @param tARGETING_CD the tARGETING_CD to set
	 */
	public void setTARGETING_CD(String tARGETING_CD) {
		TARGETING_CD = tARGETING_CD;
	}
	/**
	 * @return the sTANDARD_PRICE
	 */
	public int getSTANDARD_PRICE() {
		return STANDARD_PRICE;
	}
	/**
	 * @param sTANDARD_PRICE the sTANDARD_PRICE to set
	 */
	public void setSTANDARD_PRICE(int sTANDARD_PRICE) {
		STANDARD_PRICE = sTANDARD_PRICE;
	}
	/**
	 * @return the kWD_NAVER
	 */
	public String getKWD_NAVER() {
		return KWD_NAVER;
	}
	/**
	 * @param kWD_NAVER the kWD_NAVER to set
	 */
	public void setKWD_NAVER(String kWD_NAVER) {
		KWD_NAVER = kWD_NAVER;
	}
	/**
	 * @return the eNM_YN
	 */
	public String getENM_YN() {
		return ENM_YN;
	}
	/**
	 * @param eNM_YN the eNM_YN to set
	 */
	public void setENM_YN(String eNM_YN) {
		ENM_YN = eNM_YN;
	}
	/**
	 * @return the sAME_CD
	 */
	public String getSAME_CD() {
		return SAME_CD;
	}
	/**
	 * @param sAME_CD the sAME_CD to set
	 */
	public void setSAME_CD(String sAME_CD) {
		SAME_CD = sAME_CD;
	}
	/**
	 * @return the fHD_YN
	 */
	public String getFHD_YN() {
		return FHD_YN;
	}
	/**
	 * @param fHD_YN the fHD_YN to set
	 */
	public void setFHD_YN(String fHD_YN) {
		FHD_YN = fHD_YN;
	}
	/**
	 * @return the pREPIX_NM
	 */
	public String getPREPIX_NM() {
		return PREPIX_NM;
	}
	/**
	 * @param pREPIX_NM the pREPIX_NM to set
	 */
	public void setPREPIX_NM(String pREPIX_NM) {
		PREPIX_NM = pREPIX_NM;
	}
	/**
	 * @return the bROAD_TIME
	 */
	public String getBROAD_TIME() {
		return BROAD_TIME;
	}
	/**
	 * @param bROAD_TIME the bROAD_TIME to set
	 */
	public void setBROAD_TIME(String bROAD_TIME) {
		BROAD_TIME = bROAD_TIME;
	}
	/**
	 * @return the dRM_YN
	 */
	public String getDRM_YN() {
		return DRM_YN;
	}
	/**
	 * @param dRM_YN the dRM_YN to set
	 */
	public void setDRM_YN(String dRM_YN) {
		DRM_YN = dRM_YN;
	}
	/**
	 * @return the aMT_RENTAL
	 */
	public int getAMT_RENTAL() {
		return AMT_RENTAL;
	}
	/**
	 * @param aMT_RENTAL the aMT_RENTAL to set
	 */
	public void setAMT_RENTAL(int aMT_RENTAL) {
		AMT_RENTAL = aMT_RENTAL;
	}
	/**
	 * @return the aMT_COLLECT
	 */
	public int getAMT_COLLECT() {
		return AMT_COLLECT;
	}
	/**
	 * @param aMT_COLLECT the aMT_COLLECT to set
	 */
	public void setAMT_COLLECT(int aMT_COLLECT) {
		AMT_COLLECT = aMT_COLLECT;
	}
	/**
	 * @return the dWN_AMT_RENTAL
	 */
	public int getDWN_AMT_RENTAL() {
		return DWN_AMT_RENTAL;
	}
	/**
	 * @param dWN_AMT_RENTAL the dWN_AMT_RENTAL to set
	 */
	public void setDWN_AMT_RENTAL(int dWN_AMT_RENTAL) {
		DWN_AMT_RENTAL = dWN_AMT_RENTAL;
	}
	/**
	 * @return the dWN_AMT_COLLECT
	 */
	public int getDWN_AMT_COLLECT() {
		return DWN_AMT_COLLECT;
	}
	/**
	 * @param dWN_AMT_COLLECT the dWN_AMT_COLLECT to set
	 */
	public void setDWN_AMT_COLLECT(int dWN_AMT_COLLECT) {
		DWN_AMT_COLLECT = dWN_AMT_COLLECT;
	}
	/**
	 * @return the sALE_GUBUN_CODE
	 */
	public String getSALE_GUBUN_CODE() {
		return SALE_GUBUN_CODE;
	}
	/**
	 * @param sALE_GUBUN_CODE the sALE_GUBUN_CODE to set
	 */
	public void setSALE_GUBUN_CODE(String sALE_GUBUN_CODE) {
		SALE_GUBUN_CODE = sALE_GUBUN_CODE;
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
