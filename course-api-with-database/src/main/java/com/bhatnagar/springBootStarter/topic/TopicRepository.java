package com.bhatnagar.springBootStarter.topic;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicRepository extends CrudRepository<Topic, String> {
	/*
	 * getAllTopics() getTopic(String id) updateTopic(Topic t) deleteTopic(String
	 * id)
	 */
}