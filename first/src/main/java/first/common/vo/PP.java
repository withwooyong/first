package first.common.vo;

import org.apache.ibatis.type.Alias;

@Alias("PP")
public class PP extends BaseObject {
	
	private static final long serialVersionUID = -274195670712548101L;
	
	private int CORPID; //	CORPID
	private String CD_CUST; //	CD_CUST
	private String YN_LEGAL; //	법인유무
	private String NO_CUSTCOM; //	NO_CUSTCOM
	private String NO_TAX; //	사업자번호
	private String KN_CUST; //	거래처명
	private String KN_TRADE; //	상호
	private String KN_PRESIDENT; //	대표자명
	private String NO_PREREG; //	NO_PREREG
	private String KN_BUSINESSCOND; //	업태
	private String KN_ITEM; //	종목
	private String NO_POST; //	우편번호
	private String KN_ADDRESS; //	주소
	private String KN_ADDRESS2; //	KN_ADDRESS2
	private String NO_TEL; //	전화번호
	private String NO_FAX; //	NO_FAX
	private String CL_CUST; //	거래처분류
	private String YN_CUSTREL; //	YN_CUSTREL
	private String KN_SEARCHTERM; //	KN_SEARCHTERM
	private String YN_USE; //	사용유무
	private String KN_CUSTEMP; //	담당사원
	private String KN_CUSTTEL; //	담당사원전화번호
	private String E_MAIL; //	이메일
	private String CP_KIND; //	MCP / SCP
	private int PARENT_CP; //	MCP CORP_ID
	/**
	 * @return the cORPID
	 */
	public int getCORPID() {
		return CORPID;
	}
	/**
	 * @param cORPID the cORPID to set
	 */
	public void setCORPID(int cORPID) {
		CORPID = cORPID;
	}
	/**
	 * @return the cD_CUST
	 */
	public String getCD_CUST() {
		return CD_CUST;
	}
	/**
	 * @param cD_CUST the cD_CUST to set
	 */
	public void setCD_CUST(String cD_CUST) {
		CD_CUST = cD_CUST;
	}
	/**
	 * @return the yN_LEGAL
	 */
	public String getYN_LEGAL() {
		return YN_LEGAL;
	}
	/**
	 * @param yN_LEGAL the yN_LEGAL to set
	 */
	public void setYN_LEGAL(String yN_LEGAL) {
		YN_LEGAL = yN_LEGAL;
	}
	/**
	 * @return the nO_CUSTCOM
	 */
	public String getNO_CUSTCOM() {
		return NO_CUSTCOM;
	}
	/**
	 * @param nO_CUSTCOM the nO_CUSTCOM to set
	 */
	public void setNO_CUSTCOM(String nO_CUSTCOM) {
		NO_CUSTCOM = nO_CUSTCOM;
	}
	/**
	 * @return the nO_TAX
	 */
	public String getNO_TAX() {
		return NO_TAX;
	}
	/**
	 * @param nO_TAX the nO_TAX to set
	 */
	public void setNO_TAX(String nO_TAX) {
		NO_TAX = nO_TAX;
	}
	/**
	 * @return the kN_CUST
	 */
	public String getKN_CUST() {
		return KN_CUST;
	}
	/**
	 * @param kN_CUST the kN_CUST to set
	 */
	public void setKN_CUST(String kN_CUST) {
		KN_CUST = kN_CUST;
	}
	/**
	 * @return the kN_TRADE
	 */
	public String getKN_TRADE() {
		return KN_TRADE;
	}
	/**
	 * @param kN_TRADE the kN_TRADE to set
	 */
	public void setKN_TRADE(String kN_TRADE) {
		KN_TRADE = kN_TRADE;
	}
	/**
	 * @return the kN_PRESIDENT
	 */
	public String getKN_PRESIDENT() {
		return KN_PRESIDENT;
	}
	/**
	 * @param kN_PRESIDENT the kN_PRESIDENT to set
	 */
	public void setKN_PRESIDENT(String kN_PRESIDENT) {
		KN_PRESIDENT = kN_PRESIDENT;
	}
	/**
	 * @return the nO_PREREG
	 */
	public String getNO_PREREG() {
		return NO_PREREG;
	}
	/**
	 * @param nO_PREREG the nO_PREREG to set
	 */
	public void setNO_PREREG(String nO_PREREG) {
		NO_PREREG = nO_PREREG;
	}
	/**
	 * @return the kN_BUSINESSCOND
	 */
	public String getKN_BUSINESSCOND() {
		return KN_BUSINESSCOND;
	}
	/**
	 * @param kN_BUSINESSCOND the kN_BUSINESSCOND to set
	 */
	public void setKN_BUSINESSCOND(String kN_BUSINESSCOND) {
		KN_BUSINESSCOND = kN_BUSINESSCOND;
	}
	/**
	 * @return the kN_ITEM
	 */
	public String getKN_ITEM() {
		return KN_ITEM;
	}
	/**
	 * @param kN_ITEM the kN_ITEM to set
	 */
	public void setKN_ITEM(String kN_ITEM) {
		KN_ITEM = kN_ITEM;
	}
	/**
	 * @return the nO_POST
	 */
	public String getNO_POST() {
		return NO_POST;
	}
	/**
	 * @param nO_POST the nO_POST to set
	 */
	public void setNO_POST(String nO_POST) {
		NO_POST = nO_POST;
	}
	/**
	 * @return the kN_ADDRESS
	 */
	public String getKN_ADDRESS() {
		return KN_ADDRESS;
	}
	/**
	 * @param kN_ADDRESS the kN_ADDRESS to set
	 */
	public void setKN_ADDRESS(String kN_ADDRESS) {
		KN_ADDRESS = kN_ADDRESS;
	}
	/**
	 * @return the kN_ADDRESS2
	 */
	public String getKN_ADDRESS2() {
		return KN_ADDRESS2;
	}
	/**
	 * @param kN_ADDRESS2 the kN_ADDRESS2 to set
	 */
	public void setKN_ADDRESS2(String kN_ADDRESS2) {
		KN_ADDRESS2 = kN_ADDRESS2;
	}
	/**
	 * @return the nO_TEL
	 */
	public String getNO_TEL() {
		return NO_TEL;
	}
	/**
	 * @param nO_TEL the nO_TEL to set
	 */
	public void setNO_TEL(String nO_TEL) {
		NO_TEL = nO_TEL;
	}
	/**
	 * @return the nO_FAX
	 */
	public String getNO_FAX() {
		return NO_FAX;
	}
	/**
	 * @param nO_FAX the nO_FAX to set
	 */
	public void setNO_FAX(String nO_FAX) {
		NO_FAX = nO_FAX;
	}
	/**
	 * @return the cL_CUST
	 */
	public String getCL_CUST() {
		return CL_CUST;
	}
	/**
	 * @param cL_CUST the cL_CUST to set
	 */
	public void setCL_CUST(String cL_CUST) {
		CL_CUST = cL_CUST;
	}
	/**
	 * @return the yN_CUSTREL
	 */
	public String getYN_CUSTREL() {
		return YN_CUSTREL;
	}
	/**
	 * @param yN_CUSTREL the yN_CUSTREL to set
	 */
	public void setYN_CUSTREL(String yN_CUSTREL) {
		YN_CUSTREL = yN_CUSTREL;
	}
	/**
	 * @return the kN_SEARCHTERM
	 */
	public String getKN_SEARCHTERM() {
		return KN_SEARCHTERM;
	}
	/**
	 * @param kN_SEARCHTERM the kN_SEARCHTERM to set
	 */
	public void setKN_SEARCHTERM(String kN_SEARCHTERM) {
		KN_SEARCHTERM = kN_SEARCHTERM;
	}
	/**
	 * @return the yN_USE
	 */
	public String getYN_USE() {
		return YN_USE;
	}
	/**
	 * @param yN_USE the yN_USE to set
	 */
	public void setYN_USE(String yN_USE) {
		YN_USE = yN_USE;
	}
	/**
	 * @return the kN_CUSTEMP
	 */
	public String getKN_CUSTEMP() {
		return KN_CUSTEMP;
	}
	/**
	 * @param kN_CUSTEMP the kN_CUSTEMP to set
	 */
	public void setKN_CUSTEMP(String kN_CUSTEMP) {
		KN_CUSTEMP = kN_CUSTEMP;
	}
	/**
	 * @return the kN_CUSTTEL
	 */
	public String getKN_CUSTTEL() {
		return KN_CUSTTEL;
	}
	/**
	 * @param kN_CUSTTEL the kN_CUSTTEL to set
	 */
	public void setKN_CUSTTEL(String kN_CUSTTEL) {
		KN_CUSTTEL = kN_CUSTTEL;
	}
	/**
	 * @return the e_MAIL
	 */
	public String getE_MAIL() {
		return E_MAIL;
	}
	/**
	 * @param e_MAIL the e_MAIL to set
	 */
	public void setE_MAIL(String e_MAIL) {
		E_MAIL = e_MAIL;
	}
	/**
	 * @return the cP_KIND
	 */
	public String getCP_KIND() {
		return CP_KIND;
	}
	/**
	 * @param cP_KIND the cP_KIND to set
	 */
	public void setCP_KIND(String cP_KIND) {
		CP_KIND = cP_KIND;
	}
	/**
	 * @return the pARENT_CP
	 */
	public int getPARENT_CP() {
		return PARENT_CP;
	}
	/**
	 * @param pARENT_CP the pARENT_CP to set
	 */
	public void setPARENT_CP(int pARENT_CP) {
		PARENT_CP = pARENT_CP;
	}
	
	

}
