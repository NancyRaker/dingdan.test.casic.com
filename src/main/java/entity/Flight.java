package entity;

import java.util.Date;

public class Flight {
	private int fId;
	private int fseatNum;
	private String fName;
	private String fFromCity;
	private String fToCity;
	private double fMoney;
	private Date fStartDate;
	private Date fEndDate;
	public Flight(int fId, int fseatNum, String fName, String fFromCity, String fToCity, double fMoney, Date fStartDate,
			Date fEndDate) {
		super();
		this.fId = fId;
		this.fseatNum = fseatNum;
		this.fName = fName;
		this.fFromCity = fFromCity;
		this.fToCity = fToCity;
		this.fMoney = fMoney;
		this.fStartDate = fStartDate;
		this.fEndDate = fEndDate;
	}
	public Flight(int fseatNum, String fName, String fFromCity, String fToCity, double fMoney, Date fStartDate,
			Date fEndDate) {
		super();
		this.fseatNum = fseatNum;
		this.fName = fName;
		this.fFromCity = fFromCity;
		this.fToCity = fToCity;
		this.fMoney = fMoney;
		this.fStartDate = fStartDate;
		this.fEndDate = fEndDate;
	}
	public Flight() {
		super();
	}
	public int getfId() {
		return fId;
	}
	public void setfId(int fId) {
		this.fId = fId;
	}
	public int getFseatNum() {
		return fseatNum;
	}
	public void setFseatNum(int fseatNum) {
		this.fseatNum = fseatNum;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getfFromCity() {
		return fFromCity;
	}
	public void setfFromCity(String fFromCity) {
		this.fFromCity = fFromCity;
	}
	public String getfToCity() {
		return fToCity;
	}
	public void setfToCity(String fToCity) {
		this.fToCity = fToCity;
	}
	public double getfMoney() {
		return fMoney;
	}
	public void setfMoney(double fMoney) {
		this.fMoney = fMoney;
	}
	public Date getfStartDate() {
		return fStartDate;
	}
	public void setfStartDate(Date fStartDate) {
		this.fStartDate = fStartDate;
	}
	public Date getfEndDate() {
		return fEndDate;
	}
	public void setfEndDate(Date fEndDate) {
		this.fEndDate = fEndDate;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fEndDate == null) ? 0 : fEndDate.hashCode());
		result = prime * result + ((fFromCity == null) ? 0 : fFromCity.hashCode());
		result = prime * result + fId;
		long temp;
		temp = Double.doubleToLongBits(fMoney);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((fName == null) ? 0 : fName.hashCode());
		result = prime * result + ((fStartDate == null) ? 0 : fStartDate.hashCode());
		result = prime * result + ((fToCity == null) ? 0 : fToCity.hashCode());
		result = prime * result + fseatNum;
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
		Flight other = (Flight) obj;
		if (fEndDate == null) {
			if (other.fEndDate != null)
				return false;
		} else if (!fEndDate.equals(other.fEndDate))
			return false;
		if (fFromCity == null) {
			if (other.fFromCity != null)
				return false;
		} else if (!fFromCity.equals(other.fFromCity))
			return false;
		if (fId != other.fId)
			return false;
		if (Double.doubleToLongBits(fMoney) != Double.doubleToLongBits(other.fMoney))
			return false;
		if (fName == null) {
			if (other.fName != null)
				return false;
		} else if (!fName.equals(other.fName))
			return false;
		if (fStartDate == null) {
			if (other.fStartDate != null)
				return false;
		} else if (!fStartDate.equals(other.fStartDate))
			return false;
		if (fToCity == null) {
			if (other.fToCity != null)
				return false;
		} else if (!fToCity.equals(other.fToCity))
			return false;
		if (fseatNum != other.fseatNum)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Flight [fId=" + fId + ", fseatNum=" + fseatNum + ", fName=" + fName + ", fFromCity=" + fFromCity
				+ ", fToCity=" + fToCity + ", fMoney=" + fMoney + ", fStartDate=" + fStartDate + ", fEndDate="
				+ fEndDate + "]";
	}
	
	
}
