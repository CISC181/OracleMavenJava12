package MainPackage;

public class Rule implements java.io.Serializable {

	private int RULE_PK;
	private int MAXNUMBEROFPLAYERS;
	private int PLAYERNUMBEROFCARDS;
	private int NUMBEROFJOKERS;
	private int PLAYERCARDSMIN;
	private int PLAYERCARDSMAX;
	private int COMMUNITYCARDSMIN;
	private int COMMUNITYCARDSMAX;
	private int POSSIBLEHANDCOMBINATIONS;
	
	public Rule() {
		super();
	}
	public int getRULE_PK() {
		return RULE_PK;
	}
	public void setRULE_PK(int rULE_PK) {
		RULE_PK = rULE_PK;
	}
	public int getMAXNUMBEROFPLAYERS() {
		return MAXNUMBEROFPLAYERS;
	}
	public void setMAXNUMBEROFPLAYERS(int mAXNUMBEROFPLAYERS) {
		MAXNUMBEROFPLAYERS = mAXNUMBEROFPLAYERS;
	}
	public int getPLAYERNUMBEROFCARDS() {
		return PLAYERNUMBEROFCARDS;
	}
	public void setPLAYERNUMBEROFCARDS(int pLAYERNUMBEROFCARDS) {
		PLAYERNUMBEROFCARDS = pLAYERNUMBEROFCARDS;
	}
	public int getNUMBEROFJOKERS() {
		return NUMBEROFJOKERS;
	}
	public void setNUMBEROFJOKERS(int nUMBEROFJOKERS) {
		NUMBEROFJOKERS = nUMBEROFJOKERS;
	}
	public int getPLAYERCARDSMIN() {
		return PLAYERCARDSMIN;
	}
	public void setPLAYERCARDSMIN(int pLAYERCARDSMIN) {
		PLAYERCARDSMIN = pLAYERCARDSMIN;
	}
	public int getPLAYERCARDSMAX() {
		return PLAYERCARDSMAX;
	}
	public void setPLAYERCARDSMAX(int pLAYERCARDSMAX) {
		PLAYERCARDSMAX = pLAYERCARDSMAX;
	}
	public int getCOMMUNITYCARDSMIN() {
		return COMMUNITYCARDSMIN;
	}
	public void setCOMMUNITYCARDSMIN(int cOMMUNITYCARDSMIN) {
		COMMUNITYCARDSMIN = cOMMUNITYCARDSMIN;
	}
	public int getCOMMUNITYCARDSMAX() {
		return COMMUNITYCARDSMAX;
	}
	public void setCOMMUNITYCARDSMAX(int cOMMUNITYCARDSMAX) {
		COMMUNITYCARDSMAX = cOMMUNITYCARDSMAX;
	}
	public int getPOSSIBLEHANDCOMBINATIONS() {
		return POSSIBLEHANDCOMBINATIONS;
	}
	public void setPOSSIBLEHANDCOMBINATIONS(int pOSSIBLEHANDCOMBINATIONS) {
		POSSIBLEHANDCOMBINATIONS = pOSSIBLEHANDCOMBINATIONS;
	}
	
	
}
