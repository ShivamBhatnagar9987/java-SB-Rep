package org.bhatnagar.model;

import java.util.List;

public class Student {
	private List <Student> students;
	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	private String name;
	private String id;
	private String subcode;

	public String getName() {
		return name;
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

	public String getSubcode() {
		return subcode;
	}

	public void setSubcode(String subcode) {
		this.subcode = subcode;
	}

	public void myInitMethod() {
		System.out.println("My Init Method");
	}

	public void iDestroyBean() {
		System.out.println("I Destory the bean");

	}
	
	public void displayResults()
	{
		for(Student s: students)
			System.out.println(s.id + " " + s.name+ " " + s.subcode);
	}

}
