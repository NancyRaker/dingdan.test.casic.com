package entity;

import java.util.Date;

public class OutTicket {
	private int oId;
	private int fId;
	private int uId;
	private Date oDate;
	public OutTicket(int oId, int fId, int uId, Date oDate) {
		super();
		this.oId = oId;
		this.fId = fId;
		this.uId = uId;
		this.oDate = oDate;
	}
	public OutTicket(int fId, int uId, Date oDate) {
		super();
		this.fId = fId;
		this.uId = uId;
		this.oDate = oDate;
	}
	public OutTicket() {
		super();
	}
	public int getoId() {
		return oId;
	}
	public void setoId(int oId) {
		this.oId = oId;
	}
	public int getfId() {
		return fId;
	}
	public void setfId(int fId) {
		this.fId = fId;
	}
	public int getuId() {
		return uId;
	}
	public void setuId(int uId) {
		this.uId = uId;
	}
	public Date getoDate() {
		return oDate;
	}
	public void setoDate(Date oDate) {
		this.oDate = oDate;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + fId;
		result = prime * result + ((oDate == null) ? 0 : oDate.hashCode());
		result = prime * result + oId;
		result = prime * result + uId;
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
		OutTicket other = (OutTicket) obj;
		if (fId != other.fId)
			return false;
		if (oDate == null) {
			if (other.oDate != null)
				return false;
		} else if (!oDate.equals(other.oDate))
			return false;
		if (oId != other.oId)
			return false;
		if (uId != other.uId)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "OutTicket [oId=" + oId + ", fId=" + fId + ", uId=" + uId + ", oDate=" + oDate + "]";
	}
	
	
}
