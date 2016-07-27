package first.common.vo;

import org.apache.ibatis.type.Alias;

@Alias("Program")
public class Program extends BaseObject {
	
	private static final long serialVersionUID = -6833000298869720820L;
	
	private String PGM_CD; //	프로그램코드
	private String PGM_NM; //	프로그램명
	private String PGM_NM_EN; //	프로그램명_영문
	private String CATE1_CD; //	카테고리1코드
	private String CATE2_CD; //	카테고리2코드
	private String FIRST_BROAD_CD; //	최초방송채널코드
	private String PRODUCT_YR; //	제작년도
	private String NATION_NM; //	제작국가명
	private String DIRECTOR; //	감독
	private String BROAD_DT; //	방영일
	private String GRADE_CD; //	관람등급코드
	private int RUNTIME_MI; //	재생시간(분)
	private String HD_DEF_CD; //	화질종류코드
	private String RATIO_CD; //	화면비율코드
	private String ACTOR; //	출연자
	private String PRODUCTION; //	제작사
	private String SYNOP; //	시놉시스
	private String STORY; //	줄거리
	private String KWD; //	키워드
	private String KWD_SNS; //	키워드_SNS
	private String RMRK; //	비고
	private String SERI_CD; //	시리즈코드
	private String DEL_YN; //	삭제여부
	private String EPG_PGM_CD; //	EPG프로그램코드
	private String INS_ID; //	등록ID
	private String INS_DT; //	등록일시
	private String UPD_ID; //	수정ID
	private String UPD_DT; //	수정일시
	private String DEL_ID; //	삭제ID
	private String DEL_DT; //	삭제일시
	private int HIST_SEQ; //	EPG_HIST_SEQ
	private int CP_CD; //	CP코드
	private String MULTI_CATE_CD; //	멀티카테고리(다중의카테고리를 포함)
	private String INITIAL_KEYWORD; //	영화명 초성
	private String MULTI_SUB_CATE_CD; //	멀티서브카테고리(다중의카테고리를 포함)
	private String KWD_NAVER; //	네이버 검색 키워드
	private String PREPIX_NM; //	메타 접두사
	private String SERV_RULE_CD; //	서비스 노출 구분코드(JWORK_CODE ???)
	private String ENM_CODE; //	이엔엠코드
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
	 * @return the pGM_NM
	 */
	public String getPGM_NM() {
		return PGM_NM;
	}
	/**
	 * @param pGM_NM the pGM_NM to set
	 */
	public void setPGM_NM(String pGM_NM) {
		PGM_NM = pGM_NM;
	}
	/**
	 * @return the pGM_NM_EN
	 */
	public String getPGM_NM_EN() {
		return PGM_NM_EN;
	}
	/**
	 * @param pGM_NM_EN the pGM_NM_EN to set
	 */
	public void setPGM_NM_EN(String pGM_NM_EN) {
		PGM_NM_EN = pGM_NM_EN;
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
	 * @return the fIRST_BROAD_CD
	 */
	public String getFIRST_BROAD_CD() {
		return FIRST_BROAD_CD;
	}
	/**
	 * @param fIRST_BROAD_CD the fIRST_BROAD_CD to set
	 */
	public void setFIRST_BROAD_CD(String fIRST_BROAD_CD) {
		FIRST_BROAD_CD = fIRST_BROAD_CD;
	}
	/**
	 * @return the pRODUCT_YR
	 */
	public String getPRODUCT_YR() {
		return PRODUCT_YR;
	}
	/**
	 * @param pRODUCT_YR the pRODUCT_YR to set
	 */
	public void setPRODUCT_YR(String pRODUCT_YR) {
		PRODUCT_YR = pRODUCT_YR;
	}
	/**
	 * @return the nATION_NM
	 */
	public String getNATION_NM() {
		return NATION_NM;
	}
	/**
	 * @param nATION_NM the nATION_NM to set
	 */
	public void setNATION_NM(String nATION_NM) {
		NATION_NM = nATION_NM;
	}
	/**
	 * @return the dIRECTOR
	 */
	public String getDIRECTOR() {
		return DIRECTOR;
	}
	/**
	 * @param dIRECTOR the dIRECTOR to set
	 */
	public void setDIRECTOR(String dIRECTOR) {
		DIRECTOR = dIRECTOR;
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
	 * @return the pRODUCTION
	 */
	public String getPRODUCTION() {
		return PRODUCTION;
	}
	/**
	 * @param pRODUCTION the pRODUCTION to set
	 */
	public void setPRODUCTION(String pRODUCTION) {
		PRODUCTION = pRODUCTION;
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
	 * @return the sTORY
	 */
	public String getSTORY() {
		return STORY;
	}
	/**
	 * @param sTORY the sTORY to set
	 */
	public void setSTORY(String sTORY) {
		STORY = sTORY;
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
	 * @return the sERI_CD
	 */
	public String getSERI_CD() {
		return SERI_CD;
	}
	/**
	 * @param sERI_CD the sERI_CD to set
	 */
	public void setSERI_CD(String sERI_CD) {
		SERI_CD = sERI_CD;
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
	 * @return the ePG_PGM_CD
	 */
	public String getEPG_PGM_CD() {
		return EPG_PGM_CD;
	}
	/**
	 * @param ePG_PGM_CD the ePG_PGM_CD to set
	 */
	public void setEPG_PGM_CD(String ePG_PGM_CD) {
		EPG_PGM_CD = ePG_PGM_CD;
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
	 * @return the cP_CD
	 */
	public int getCP_CD() {
		return CP_CD;
	}
	/**
	 * @param cP_CD the cP_CD to set
	 */
	public void setCP_CD(int cP_CD) {
		CP_CD = cP_CD;
	}
	/**
	 * @return the mULTI_CATE_CD
	 */
	public String getMULTI_CATE_CD() {
		return MULTI_CATE_CD;
	}
	/**
	 * @param mULTI_CATE_CD the mULTI_CATE_CD to set
	 */
	public void setMULTI_CATE_CD(String mULTI_CATE_CD) {
		MULTI_CATE_CD = mULTI_CATE_CD;
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
	 * @return the mULTI_SUB_CATE_CD
	 */
	public String getMULTI_SUB_CATE_CD() {
		return MULTI_SUB_CATE_CD;
	}
	/**
	 * @param mULTI_SUB_CATE_CD the mULTI_SUB_CATE_CD to set
	 */
	public void setMULTI_SUB_CATE_CD(String mULTI_SUB_CATE_CD) {
		MULTI_SUB_CATE_CD = mULTI_SUB_CATE_CD;
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
	 * @return the sERV_RULE_CD
	 */
	public String getSERV_RULE_CD() {
		return SERV_RULE_CD;
	}
	/**
	 * @param sERV_RULE_CD the sERV_RULE_CD to set
	 */
	public void setSERV_RULE_CD(String sERV_RULE_CD) {
		SERV_RULE_CD = sERV_RULE_CD;
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
