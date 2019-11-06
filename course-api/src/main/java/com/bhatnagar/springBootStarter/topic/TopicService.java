package com.bhatnagar.springBootStarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	private List<Topic> topics = new ArrayList<Topic>(
			Arrays.asList(new Topic("spring", "Spring Framework", "description"),
					new Topic("java", "core java", "core java description"),
					new Topic("javascript", "javascript", "javascript description")

			));

	public List<Topic> getAllTopics() {
		return topics;
	}

	public Topic getTopicById(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		topics.add(topic);
	}
}