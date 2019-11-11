package com.bhatnagar.springBootStarter.courses;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.bhatnagar.springBootStarter.topic.Topic;

@Entity
public class Course {
	@Id
	private String id;
	private String description;
	private String name;
	@ManyToOne
	private Topic topic;

	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}

	public Course() {

	}

	public Course(String id, String description, String name, String topicId) {
		super();
		this.id = id;
		this.description = description;
		this.name = name;
		this.topic = new Topic(topicId, "", "");
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