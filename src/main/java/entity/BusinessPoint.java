package entity;

public class BusinessPoint {
	private int bId;
	private String bName;
	private String bProvince;
	private String bCity;
	private String bPhone;
	public BusinessPoint(String bName, String bProvince, String bCity, String bPhone) {
		super();
		this.bName = bName;
		this.bProvince = bProvince;
		this.bCity = bCity;
		this.bPhone = bPhone;
	}
	public BusinessPoint(int bId, String bName, String bProvince, String bCity, String bPhone) {
		super();
		this.bId = bId;
		this.bName = bName;
		this.bProvince = bProvince;
		this.bCity = bCity;
		this.bPhone = bPhone;
	}
	public BusinessPoint() {
		super();
	}
	public int getbId() {
		return bId;
	}
	public void setbId(int bId) {
		this.bId = bId;
	}
	public String getbName() {
		return bName;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}
	public String getbProvince() {
		return bProvince;
	}
	public void setbProvince(String bProvince) {
		this.bProvince = bProvince;
	}
	public String getbCity() {
		return bCity;
	}
	public void setbCity(String bCity) {
		this.bCity = bCity;
	}
	public String getbPhone() {
		return bPhone;
	}
	public void setbPhone(String bPhone) {
		this.bPhone = bPhone;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bCity == null) ? 0 : bCity.hashCode());
		result = prime * result + bId;
		result = prime * result + ((bName == null) ? 0 : bName.hashCode());
		result = prime * result + ((bPhone == null) ? 0 : bPhone.hashCode());
		result = prime * result + ((bProvince == null) ? 0 : bProvince.hashCode());
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
		BusinessPoint other = (BusinessPoint) obj;
		if (bCity == null) {
			if (other.bCity != null)
				return false;
		} else if (!bCity.equals(other.bCity))
			return false;
		if (bId != other.bId)
			return false;
		if (bName == null) {
			if (other.bName != null)
				return false;
		} else if (!bName.equals(other.bName))
			return false;
		if (bPhone == null) {
			if (other.bPhone != null)
				return false;
		} else if (!bPhone.equals(other.bPhone))
			return false;
		if (bProvince == null) {
			if (other.bProvince != null)
				return false;
		} else if (!bProvince.equals(other.bProvince))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "BusinessPoint [bId=" + bId + ", bName=" + bName + ", bProvince=" + bProvince + ", bCity=" + bCity
				+ ", bPhone=" + bPhone + "]";
	}
	
	
	
}
