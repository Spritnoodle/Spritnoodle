package springnoodle;

public class BaseTeamInfoEntity {
	private String id;
	private String tname;
	public TeamInfo(String id, String tname) {
		super();
		this.id = id;
		this.tname = tname;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	
	

}
