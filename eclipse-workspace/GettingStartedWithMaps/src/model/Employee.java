package model;

public class Employee {

	private String name;
	private String id;
	private String project;
	public String getName() {
		return name;
	}
	
	public Employee(String name, String id, String project) {
		super();
		this.name = name;
		this.id = id;
		this.project = project;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("name:"+name+" id:"+id+" project:"+project);
		//return super.toString();
	}
}
