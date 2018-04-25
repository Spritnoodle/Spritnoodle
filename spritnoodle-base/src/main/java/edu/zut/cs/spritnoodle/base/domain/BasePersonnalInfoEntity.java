package springnoodle;

public class BasePersonnalInfoEntity {
	private String password;
	private String uid;
	private String tname;
	
	
	public PersonnalInfo(String password, String uid, String tname) {
		super();
		this.password = password;
		this.uid = uid;
		this.tname = tname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	

}
