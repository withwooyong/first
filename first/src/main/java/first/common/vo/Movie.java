package first.common.vo;

import org.apache.ibatis.type.Alias;

@Alias("Movie")
public class Movie extends BaseObject {
	
	private static final long serialVersionUID = -9025973327877263893L;

	private String MOVIE_CD; //	영화코드
	private String MOVIE_NM; //	영화명
	private String MOVIE_NM_EN; //	영화명_영문
	private String GENRE_CD; //	장르코드
	private String PRODUCTION; //	제작사
	private String COPYRIGHT_CP; //	원천판권사
	private int ONLINE_CP; //	온라인유통사
	private String DIRECTOR; //	감독
	private String PRODUCT_YR; //	제작년도
	private String NATION_CD; //	제작국가코드
	private String NR_DT; //	개봉일
	private String GRADE_CD; //	등급코드
	private String HD_DEF_CD; //	화질종류코드
	private int RUNTIME_MI; //	재생시간(분)
	private String RATIO_CD; //	화면비율코드
	private String ACTOR; //	배우
	private String STORY; //	줄거리
	private String SITE_URL; //	사이트URL
	private String KWD; //	키워드
	private String KWD_SNS; //	키워드_SNS
	private String RMRK; //	비고
	private String SERI_CD; //	시리즈코드
	private String DATASOURCE_CD; //	자료출처코드
	private String DEL_YN; //	삭제여부
	private String INS_ID; //	등록ID
	private String INS_DT; //	등록일시
	private String UPD_ID; //	수정ID
	private String UPD_DT; //	수정일시
	private String DEL_ID; //	삭제ID
	private String DEL_DT; //	삭제일시
	private int VOD_AMT; //	VOD가격
	private int BIL_RULESET; //	빌링_룰셋
	private String GENRE2_CD; //	장르코드2
	private int SCP_CD; //	SCP
	private int SETTLE_ID; //	정산ID
	private String CONTENT_ID; //	콘텐츠ID(씨네21용)
	private int GPA; //	영화평점
	private String NOT_LOGIN_WATCH_YN; //	VOD 비로그인 시청여부
	private String MOVIE_GROUP; //	영화분류(일반/독립영화/영화제)
	private String COMPETITION_KIND_CD; //	경쟁코드(본선/결선/수상작)
	private String DELIBERATE_NO; //	심의번호
	private String MULTI_GENRE_CD; //	멀티장르코드(다중의장르의노출되고자할경우)
	private String INITIAL_KEYWORD; //	프로그램명 초성
	private int DWN_MCP_CD; //	다운로드 MCP
	private int DWN_SCP_CD; //	다운로드 SCP
	private int DWN_BIL_RULESET; //	다운로드 룰셋
	private int DWN_AMT; //	다운로드 가격
	private int DWN_SETTLE_ID; //	다운로드 정산ID
	private int DWN_USE_CNT; //	다운로드 사용횟수
	private String DWN_YN; //	다운로드  사용여부
	private int STANDARD_PRICE; //	기준가격(ASP)
	private String ENM_YN; //	E&M 영화 컨텐츠 여부
	private String SAME_CD; //	E&M 영화 동일 컨텐츠 코드
	private String FHD_YN; //	Full HD 컨텐츠 여부(Y:Full HD, N:아님)
	private String PREPIX_NM; //	메타 접두사
	private String EPG_MOV_CD; //	EPG MOVIE CODE
	private String CH_CD; //	채널코드
	private int HIST_SEQ; //	EPG HISTORY SEQ
	private String SERV_JOB_CD; //	서비스노출 JOB 코드
	private String SERV_RULE_CD; //	서비스 노출 구분코드(JWORK_CODE ???)
	private String DRM_YN; //	DRM적용유무
	private String VINGO_CD; //	VINGO 컨텐츠 코드(TCM_MOVIE_VINGO.MOVIE_CD)
	private int AMT_RENTAL; //	가격(대여)
	private int AMT_COLLECT; //	가격(소장)
	private int DWN_AMT_RENTAL; //	다운로드 가격(대여)
	private int DWN_AMT_COLLECT; //	다운로드 가격(소장)
	private String SALE_GUBUN_CODE; //	상품판매정책(1:소장, 2:렌탈 3:소장및렌탈)
	private String ENM_CODE; //	이엔엠코드
	/**
	 * @return the mOVIE_CD
	 */
	public String getMOVIE_CD() {
		return MOVIE_CD;
	}
	/**
	 * @param mOVIE_CD the mOVIE_CD to set
	 */
	public void setMOVIE_CD(String mOVIE_CD) {
		MOVIE_CD = mOVIE_CD;
	}
	/**
	 * @return the mOVIE_NM
	 */
	public String getMOVIE_NM() {
		return MOVIE_NM;
	}
	/**
	 * @param mOVIE_NM the mOVIE_NM to set
	 */
	public void setMOVIE_NM(String mOVIE_NM) {
		MOVIE_NM = mOVIE_NM;
	}
	/**
	 * @return the mOVIE_NM_EN
	 */
	public String getMOVIE_NM_EN() {
		return MOVIE_NM_EN;
	}
	/**
	 * @param mOVIE_NM_EN the mOVIE_NM_EN to set
	 */
	public void setMOVIE_NM_EN(String mOVIE_NM_EN) {
		MOVIE_NM_EN = mOVIE_NM_EN;
	}
	/**
	 * @return the gENRE_CD
	 */
	public String getGENRE_CD() {
		return GENRE_CD;
	}
	/**
	 * @param gENRE_CD the gENRE_CD to set
	 */
	public void setGENRE_CD(String gENRE_CD) {
		GENRE_CD = gENRE_CD;
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
	 * @return the cOPYRIGHT_CP
	 */
	public String getCOPYRIGHT_CP() {
		return COPYRIGHT_CP;
	}
	/**
	 * @param cOPYRIGHT_CP the cOPYRIGHT_CP to set
	 */
	public void setCOPYRIGHT_CP(String cOPYRIGHT_CP) {
		COPYRIGHT_CP = cOPYRIGHT_CP;
	}
	/**
	 * @return the oNLINE_CP
	 */
	public int getONLINE_CP() {
		return ONLINE_CP;
	}
	/**
	 * @param oNLINE_CP the oNLINE_CP to set
	 */
	public void setONLINE_CP(int oNLINE_CP) {
		ONLINE_CP = oNLINE_CP;
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
	 * @return the nATION_CD
	 */
	public String getNATION_CD() {
		return NATION_CD;
	}
	/**
	 * @param nATION_CD the nATION_CD to set
	 */
	public void setNATION_CD(String nATION_CD) {
		NATION_CD = nATION_CD;
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
	 * @return the sITE_URL
	 */
	public String getSITE_URL() {
		return SITE_URL;
	}
	/**
	 * @param sITE_URL the sITE_URL to set
	 */
	public void setSITE_URL(String sITE_URL) {
		SITE_URL = sITE_URL;
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
	 * @return the dATASOURCE_CD
	 */
	public String getDATASOURCE_CD() {
		return DATASOURCE_CD;
	}
	/**
	 * @param dATASOURCE_CD the dATASOURCE_CD to set
	 */
	public void setDATASOURCE_CD(String dATASOURCE_CD) {
		DATASOURCE_CD = dATASOURCE_CD;
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
	 * @return the gENRE2_CD
	 */
	public String getGENRE2_CD() {
		return GENRE2_CD;
	}
	/**
	 * @param gENRE2_CD the gENRE2_CD to set
	 */
	public void setGENRE2_CD(String gENRE2_CD) {
		GENRE2_CD = gENRE2_CD;
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
	 * @return the gPA
	 */
	public int getGPA() {
		return GPA;
	}
	/**
	 * @param gPA the gPA to set
	 */
	public void setGPA(int gPA) {
		GPA = gPA;
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
	 * @return the mOVIE_GROUP
	 */
	public String getMOVIE_GROUP() {
		return MOVIE_GROUP;
	}
	/**
	 * @param mOVIE_GROUP the mOVIE_GROUP to set
	 */
	public void setMOVIE_GROUP(String mOVIE_GROUP) {
		MOVIE_GROUP = mOVIE_GROUP;
	}
	/**
	 * @return the cOMPETITION_KIND_CD
	 */
	public String getCOMPETITION_KIND_CD() {
		return COMPETITION_KIND_CD;
	}
	/**
	 * @param cOMPETITION_KIND_CD the cOMPETITION_KIND_CD to set
	 */
	public void setCOMPETITION_KIND_CD(String cOMPETITION_KIND_CD) {
		COMPETITION_KIND_CD = cOMPETITION_KIND_CD;
	}
	/**
	 * @return the dELIBERATE_NO
	 */
	public String getDELIBERATE_NO() {
		return DELIBERATE_NO;
	}
	/**
	 * @param dELIBERATE_NO the dELIBERATE_NO to set
	 */
	public void setDELIBERATE_NO(String dELIBERATE_NO) {
		DELIBERATE_NO = dELIBERATE_NO;
	}
	/**
	 * @return the mULTI_GENRE_CD
	 */
	public String getMULTI_GENRE_CD() {
		return MULTI_GENRE_CD;
	}
	/**
	 * @param mULTI_GENRE_CD the mULTI_GENRE_CD to set
	 */
	public void setMULTI_GENRE_CD(String mULTI_GENRE_CD) {
		MULTI_GENRE_CD = mULTI_GENRE_CD;
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
	 * @return the ePG_MOV_CD
	 */
	public String getEPG_MOV_CD() {
		return EPG_MOV_CD;
	}
	/**
	 * @param ePG_MOV_CD the ePG_MOV_CD to set
	 */
	public void setEPG_MOV_CD(String ePG_MOV_CD) {
		EPG_MOV_CD = ePG_MOV_CD;
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
	 * @return the sERV_JOB_CD
	 */
	public String getSERV_JOB_CD() {
		return SERV_JOB_CD;
	}
	/**
	 * @param sERV_JOB_CD the sERV_JOB_CD to set
	 */
	public void setSERV_JOB_CD(String sERV_JOB_CD) {
		SERV_JOB_CD = sERV_JOB_CD;
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
	 * @return the vINGO_CD
	 */
	public String getVINGO_CD() {
		return VINGO_CD;
	}
	/**
	 * @param vINGO_CD the vINGO_CD to set
	 */
	public void setVINGO_CD(String vINGO_CD) {
		VINGO_CD = vINGO_CD;
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
