package org.bhatnagar.model;

public class Student {
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

}
