package com.bhatnagar.springBootStarter.topic;

public class Topic {
	private String id;
	private String description;
	private String name;

	public Topic() {

	}

	public Topic(String id, String description, String name) {
		super();
		this.id = id;
		this.description = description;
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}
}