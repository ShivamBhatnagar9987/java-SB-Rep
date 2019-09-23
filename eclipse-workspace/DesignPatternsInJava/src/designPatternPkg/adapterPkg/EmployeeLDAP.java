package designPatternPkg.adapterPkg;

public class EmployeeLDAP {
	private String cn;
	private String givenName;
	private String surName;
	private String allocatedTo;

	public EmployeeLDAP(String cn, String givenName, String surName, String allocatedTo) {
		super();
		this.cn = cn;
		this.givenName = givenName;
		this.surName = surName;
		this.allocatedTo = allocatedTo;
	}

	public String getCn() {
		return cn;
	}

	public String getGivenName() {
		return givenName;
	}

	public String getSurName() {
		return surName;
	}

	public String getAllocatedTo() {
		return allocatedTo;
	}

}
