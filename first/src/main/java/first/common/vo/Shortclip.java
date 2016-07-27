package first.common.vo;

import org.apache.ibatis.type.Alias;

@Alias("Shortclip")
public class Shortclip extends BaseObject {
	
	private static final long serialVersionUID = -8160363676798233778L;
	
	private String SHORTCLIP_CD; //	SHORTCLIP코드
	private String SHORTCLIP_NM; //	SHORTCLIP명
	private String SHORTCLIP_NM_EN; //	SHORTCLIP 영문명
	private String PL_KIND_CD; //	논리/물리 구분
	private String META_KIND_CD; //	메타구분
	private String CH_CD; //	모컨텐츠 채널코드
	private String CH_NM; //	모컨텐츠 채널명
	private String MAST_CD; //	프로그램코드
	private String MAST_NM; //	모컨텐츠 마스터명(프로그램,영화)
	private String EPI_CD; //	에피소드코드
	private String EPI_NM; //	모컨텐츠 에피소드명(프로그램)
	private String FREQUENCY; //	회차
	private String BROAD_DT; //	일방송
	private String VOD_FILE_CD; //	원본VOD_FILE_CD
	private String PARENT_CONTS_KIND_CD; //	모컨텐츠구분
	private String SHORTCLIP_KIND_CD; //	SHORTCLIP구분
	private String MAIN_CATE_CD; //	메인카테고리
	private String SUB_CATE_CD; //	보조카테고리
	private int ST_POINT_SEC; //	시작지점
	private int END_POINT_SEC; //	종료지점
	private String HD_DEF_CD; //	화질코드
	private String RATIO_CD; //	화면비율코드
	private String GRADE_CD; //	등급
	private String NOT_LOGIN_WATCH_YN; //	비로그인시청여부
	private String CHARACTER; //	인물
	private String AREA; //	지역
	private String SYNOP; //	시놉시스
	private String KWD; //	키워드
	private String KWD_SNS; //	키워드_SNS
	private int MCP_CD; //	MCP
	private int SCP_CD; //	SCP
	private int SETTLE_ID; //	정산ID
	private int VOD_AMT; //	가격
	private int BIL_RULESET; //	BIL_RULESET
	private String DEL_YN; //	삭제여부
	private String SERV_OPEN_YN; //	노출여부
	private String INS_ID; //	등록ID
	private String INS_DT; //	등록일시
	private String UPD_ID; //	수정ID
	private String UPD_DT; //	수정일시
	private String DEL_ID; //	삭제ID
	private String DEL_DT; //	삭제일시
	private String SERV_OPEN_DT; //	논리메타의경우 서비스노출일시(서비스테이블저장용으로사용)트리거
	private String MG_KEY; //	마이그레이션용 key
	private String INITIAL_KEYWORD; //	숏클립명 초성
	private int RUNTIME_MI; //	러닝타임(분)
	private String CATE_CD; //	카테고리
	private String NR_DT; //	개봉일
	private String TARGETING_CD; //	타게팅코드 (광고 등)
	private String KWD_NAVER; //	네이버 검색 키워드
	private String BROAD_TIME; //	방영시간
	private String ENM_CODE; //	이엔엠코드
	/**
	 * @return the sHORTCLIP_CD
	 */
	public String getSHORTCLIP_CD() {
		return SHORTCLIP_CD;
	}
	/**
	 * @param sHORTCLIP_CD the sHORTCLIP_CD to set
	 */
	public void setSHORTCLIP_CD(String sHORTCLIP_CD) {
		SHORTCLIP_CD = sHORTCLIP_CD;
	}
	/**
	 * @return the sHORTCLIP_NM
	 */
	public String getSHORTCLIP_NM() {
		return SHORTCLIP_NM;
	}
	/**
	 * @param sHORTCLIP_NM the sHORTCLIP_NM to set
	 */
	public void setSHORTCLIP_NM(String sHORTCLIP_NM) {
		SHORTCLIP_NM = sHORTCLIP_NM;
	}
	/**
	 * @return the sHORTCLIP_NM_EN
	 */
	public String getSHORTCLIP_NM_EN() {
		return SHORTCLIP_NM_EN;
	}
	/**
	 * @param sHORTCLIP_NM_EN the sHORTCLIP_NM_EN to set
	 */
	public void setSHORTCLIP_NM_EN(String sHORTCLIP_NM_EN) {
		SHORTCLIP_NM_EN = sHORTCLIP_NM_EN;
	}
	/**
	 * @return the pL_KIND_CD
	 */
	public String getPL_KIND_CD() {
		return PL_KIND_CD;
	}
	/**
	 * @param pL_KIND_CD the pL_KIND_CD to set
	 */
	public void setPL_KIND_CD(String pL_KIND_CD) {
		PL_KIND_CD = pL_KIND_CD;
	}
	/**
	 * @return the mETA_KIND_CD
	 */
	public String getMETA_KIND_CD() {
		return META_KIND_CD;
	}
	/**
	 * @param mETA_KIND_CD the mETA_KIND_CD to set
	 */
	public void setMETA_KIND_CD(String mETA_KIND_CD) {
		META_KIND_CD = mETA_KIND_CD;
	}
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
	 * @return the mAST_CD
	 */
	public String getMAST_CD() {
		return MAST_CD;
	}
	/**
	 * @param mAST_CD the mAST_CD to set
	 */
	public void setMAST_CD(String mAST_CD) {
		MAST_CD = mAST_CD;
	}
	/**
	 * @return the mAST_NM
	 */
	public String getMAST_NM() {
		return MAST_NM;
	}
	/**
	 * @param mAST_NM the mAST_NM to set
	 */
	public void setMAST_NM(String mAST_NM) {
		MAST_NM = mAST_NM;
	}
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
	 * @return the vOD_FILE_CD
	 */
	public String getVOD_FILE_CD() {
		return VOD_FILE_CD;
	}
	/**
	 * @param vOD_FILE_CD the vOD_FILE_CD to set
	 */
	public void setVOD_FILE_CD(String vOD_FILE_CD) {
		VOD_FILE_CD = vOD_FILE_CD;
	}
	/**
	 * @return the pARENT_CONTS_KIND_CD
	 */
	public String getPARENT_CONTS_KIND_CD() {
		return PARENT_CONTS_KIND_CD;
	}
	/**
	 * @param pARENT_CONTS_KIND_CD the pARENT_CONTS_KIND_CD to set
	 */
	public void setPARENT_CONTS_KIND_CD(String pARENT_CONTS_KIND_CD) {
		PARENT_CONTS_KIND_CD = pARENT_CONTS_KIND_CD;
	}
	/**
	 * @return the sHORTCLIP_KIND_CD
	 */
	public String getSHORTCLIP_KIND_CD() {
		return SHORTCLIP_KIND_CD;
	}
	/**
	 * @param sHORTCLIP_KIND_CD the sHORTCLIP_KIND_CD to set
	 */
	public void setSHORTCLIP_KIND_CD(String sHORTCLIP_KIND_CD) {
		SHORTCLIP_KIND_CD = sHORTCLIP_KIND_CD;
	}
	/**
	 * @return the mAIN_CATE_CD
	 */
	public String getMAIN_CATE_CD() {
		return MAIN_CATE_CD;
	}
	/**
	 * @param mAIN_CATE_CD the mAIN_CATE_CD to set
	 */
	public void setMAIN_CATE_CD(String mAIN_CATE_CD) {
		MAIN_CATE_CD = mAIN_CATE_CD;
	}
	/**
	 * @return the sUB_CATE_CD
	 */
	public String getSUB_CATE_CD() {
		return SUB_CATE_CD;
	}
	/**
	 * @param sUB_CATE_CD the sUB_CATE_CD to set
	 */
	public void setSUB_CATE_CD(String sUB_CATE_CD) {
		SUB_CATE_CD = sUB_CATE_CD;
	}
	/**
	 * @return the sT_POINT_SEC
	 */
	public int getST_POINT_SEC() {
		return ST_POINT_SEC;
	}
	/**
	 * @param sT_POINT_SEC the sT_POINT_SEC to set
	 */
	public void setST_POINT_SEC(int sT_POINT_SEC) {
		ST_POINT_SEC = sT_POINT_SEC;
	}
	/**
	 * @return the eND_POINT_SEC
	 */
	public int getEND_POINT_SEC() {
		return END_POINT_SEC;
	}
	/**
	 * @param eND_POINT_SEC the eND_POINT_SEC to set
	 */
	public void setEND_POINT_SEC(int eND_POINT_SEC) {
		END_POINT_SEC = eND_POINT_SEC;
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
	 * @return the cHARACTER
	 */
	public String getCHARACTER() {
		return CHARACTER;
	}
	/**
	 * @param cHARACTER the cHARACTER to set
	 */
	public void setCHARACTER(String cHARACTER) {
		CHARACTER = cHARACTER;
	}
	/**
	 * @return the aREA
	 */
	public String getAREA() {
		return AREA;
	}
	/**
	 * @param aREA the aREA to set
	 */
	public void setAREA(String aREA) {
		AREA = aREA;
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
	 * @return the sERV_OPEN_YN
	 */
	public String getSERV_OPEN_YN() {
		return SERV_OPEN_YN;
	}
	/**
	 * @param sERV_OPEN_YN the sERV_OPEN_YN to set
	 */
	public void setSERV_OPEN_YN(String sERV_OPEN_YN) {
		SERV_OPEN_YN = sERV_OPEN_YN;
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
	 * @return the sERV_OPEN_DT
	 */
	public String getSERV_OPEN_DT() {
		return SERV_OPEN_DT;
	}
	/**
	 * @param sERV_OPEN_DT the sERV_OPEN_DT to set
	 */
	public void setSERV_OPEN_DT(String sERV_OPEN_DT) {
		SERV_OPEN_DT = sERV_OPEN_DT;
	}
	/**
	 * @return the mG_KEY
	 */
	public String getMG_KEY() {
		return MG_KEY;
	}
	/**
	 * @param mG_KEY the mG_KEY to set
	 */
	public void setMG_KEY(String mG_KEY) {
		MG_KEY = mG_KEY;
	}
	/**
	 * @return the iNITIAL_KEYWORD
	 */
	public String getINITIAL_KEYWORD() {
		return INITIAL_KEYWORD;
	}
	/**
	 * @param iNITIAL_KEYWORD the iNITIAL_KEYWORD to set
	 */
	public void setINITIAL_KEYWORD(String iNITIAL_KEYWORD) {
		INITIAL_KEYWORD = iNITIAL_KEYWORD;
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
	 * @return the nR_DT
	 */
	public String getNR_DT() {
		return NR_DT;
	}
	/**
	 * @param nR_DT the nR_DT to set
	 */
	public void setNR_DT(String nR_DT) {
		NR_DT = nR_DT;
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
