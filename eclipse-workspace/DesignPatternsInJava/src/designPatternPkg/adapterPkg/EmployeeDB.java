package designPatternPkg.adapterPkg;

public class EmployeeDB implements Employee {
	private String id;
	private String firstName;
	private String lastName;
	private String project;

	public EmployeeDB(String id, String firstName, String lastName, String project) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.project = project;
	}

	public String getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getProject() {
		return project;
	}
}
