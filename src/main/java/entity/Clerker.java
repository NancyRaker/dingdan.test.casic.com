package entity;

public class Clerker {
	private int cId;
	private int bId;
	private String cName;
	private String cNumber;
	private String cPassword;
	public Clerker(int cId, int bId, String cName, String cNumber, String cPassword) {
		super();
		this.cId = cId;
		this.bId = bId;
		this.cName = cName;
		this.cNumber = cNumber;
		this.cPassword = cPassword;
	}
	public Clerker(int bId, String cName, String cNumber, String cPassword) {
		super();
		this.bId = bId;
		this.cName = cName;
		this.cNumber = cNumber;
		this.cPassword = cPassword;
	}
	public Clerker() {
		super();
	}
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public int getbId() {
		return bId;
	}
	public void setbId(int bId) {
		this.bId = bId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getcNumber() {
		return cNumber;
	}
	public void setcNumber(String cNumber) {
		this.cNumber = cNumber;
	}
	public String getcPassword() {
		return cPassword;
	}
	public void setcPassword(String cPassword) {
		this.cPassword = cPassword;
	}
	@Override
	public String toString() {
		return "Clerker [cId=" + cId + ", bId=" + bId + ", cName=" + cName + ", cNumber=" + cNumber + ", cPassword="
				+ cPassword + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + bId;
		result = prime * result + cId;
		result = prime * result + ((cName == null) ? 0 : cName.hashCode());
		result = prime * result + ((cNumber == null) ? 0 : cNumber.hashCode());
		result = prime * result + ((cPassword == null) ? 0 : cPassword.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Clerker other = (Clerker) obj;
		if (bId != other.bId)
			return false;
		if (cId != other.cId)
			return false;
		if (cName == null) {
			if (other.cName != null)
				return false;
		} else if (!cName.equals(other.cName))
			return false;
		if (cNumber == null) {
			if (other.cNumber != null)
				return false;
		} else if (!cNumber.equals(other.cNumber))
			return false;
		if (cPassword == null) {
			if (other.cPassword != null)
				return false;
		} else if (!cPassword.equals(other.cPassword))
			return false;
		return true;
	}
	
}
