package com.bhatnagar.springBootStarter.courses;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

	@Autowired
	private CourseRepository topicRepository;

	/*
	 * private List<Topic> topics = new ArrayList<Topic>( Arrays.asList(new
	 * Topic("spring", "Spring Framework", "description"), new Topic("java",
	 * "core java", "core java description"), new Topic("javascript", "javascript",
	 * "javascript description")
	 * 
	 * ));
	 */

	public List<Course> getAllTopics() {
		// return topics;
		List<Course> topics = new ArrayList<>();
		topicRepository.findAll().forEach(topics::add);
		return topics;
	}

	public Course getTopicById(String id) {
		// return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return topicRepository.findOne(id);
	}

	public void addTopic(Course topic) {
		// topics.add(topic);
		topicRepository.save(topic);
	}

	public void updateTopic(String id, Course topic) {
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