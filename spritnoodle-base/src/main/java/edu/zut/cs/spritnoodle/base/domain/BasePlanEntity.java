package entity;

public class BasePlanEntity {
	//任务模块Plan（所有者uid，时间pdate，内容pinfo）
	private String uid;
	private String pdate;
	private String pinfo;
	
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getPdate() {
		return pdate;
	}
	public void setPdate(String pdate) {
		this.pdate = pdate;
	}
	public String getPinfo() {
		return pinfo;
	}
	public void setPinfo(String pinfo) {
		this.pinfo = pinfo;
	}
	
	
}
