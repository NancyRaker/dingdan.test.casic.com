package entity;

public class FB {
	private int fbId;
	private int bId;
	private int fId;
	public FB(int fbId, int bId, int fId) {
		super();
		this.fbId = fbId;
		this.bId = bId;
		this.fId = fId;
	}
	public FB(int bId, int fId) {
		super();
		this.bId = bId;
		this.fId = fId;
	}
	public FB() {
		super();
	}
	public int getFbId() {
		return fbId;
	}
	public void setFbId(int fbId) {
		this.fbId = fbId;
	}
	public int getbId() {
		return bId;
	}
	public void setbId(int bId) {
		this.bId = bId;
	}
	public int getfId() {
		return fId;
	}
	public void setfId(int fId) {
		this.fId = fId;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + bId;
		result = prime * result + fId;
		result = prime * result + fbId;
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
		FB other = (FB) obj;
		if (bId != other.bId)
			return false;
		if (fId != other.fId)
			return false;
		if (fbId != other.fbId)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "FB [fbId=" + fbId + ", bId=" + bId + ", fId=" + fId + "]";
	}
	
	
}
