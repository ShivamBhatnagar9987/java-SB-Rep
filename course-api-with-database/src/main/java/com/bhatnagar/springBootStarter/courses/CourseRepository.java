package com.bhatnagar.springBootStarter.courses;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends CrudRepository<Course, String> {
	/*
	 * getAllTopics() getTopic(String id) updateTopic(Topic t) deleteTopic(String
	 * id)
	 */
}