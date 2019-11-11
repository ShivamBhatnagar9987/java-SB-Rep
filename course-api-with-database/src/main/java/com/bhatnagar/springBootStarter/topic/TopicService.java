package com.bhatnagar.springBootStarter.topic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	@Autowired
	private TopicRepository topicRepository;

	/*
	 * private List<Topic> topics = new ArrayList<Topic>( Arrays.asList(new
	 * Topic("spring", "Spring Framework", "description"), new Topic("java",
	 * "core java", "core java description"), new Topic("javascript", "javascript",
	 * "javascript description")
	 * 
	 * ));
	 */

	public List<Topic> getAllTopics() {
		// return topics;
		List<Topic> topics = new ArrayList<>();
		topicRepository.findAll().forEach(topics::add);
		return topics;
	}

	public Topic getTopicById(String id) {
		// return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return topicRepository.findOne(id);
	}

	public void addTopic(Topic topic) {
		// topics.add(topic);
		topicRepository.save(topic);
	}

	public void updateTopic(String id, Topic topic) {
//		for (int i = 0; i < topics.size(); i++) {
//			Topic t = topics.get(i);
//			if (t.getId().equals(id)) {
//				topics.set(i, topic);
//			}
//		}
		topicRepository.save(topic);
	}

	public void deleteTopic(String id) {
		// topics.removeIf(t -> t.getId().equals(id));
		topicRepository.delete(id);
	}
}