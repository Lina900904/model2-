package domain;

public class MemberBean {
	private String name, ssn, roll, id, password, teamId;




	@Override
	public String toString() {
		return "MemberBean [name=" + name + ", ssn=" + ssn + ", roll=" + roll + ", id=" + id + ", password=" + password
				+ ", teamId=" + teamId + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getRoll() {
		return roll;
	}

	public void setRoll(String roll) {
		this.roll = roll;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTeamId() {
		return teamId;
	}

	public void setTeamId(String teamId) {
		this.teamId = teamId;
	}



}
