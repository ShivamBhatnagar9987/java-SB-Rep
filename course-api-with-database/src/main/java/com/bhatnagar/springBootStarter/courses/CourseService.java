package com.bhatnagar.springBootStarter.courses;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;

	/*
	 * private List<Topic> topics = new ArrayList<Topic>( Arrays.asList(new
	 * Topic("spring", "Spring Framework", "description"), new Topic("java",
	 * "core java", "core java description"), new Topic("javascript", "javascript",
	 * "javascript description")
	 * 
	 * ));
	 */

	public List<Course> getAllCourses(String id) {
		// return topics;
		List<Course> courses = new ArrayList<>();
		courseRepository.findAll().forEach(courses::add);
		return courses;
	}

	public Course getCourseById(String id) {
		// return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return courseRepository.findOne(id);
	}

	public void addCourse(Course course) {
		// topics.add(topic);
		courseRepository.save(course);
	}

	public void updateCourse(Course course) {
//		for (int i = 0; i < topics.size(); i++) {
//			Topic t = topics.get(i);
//			if (t.getId().equals(id)) {
//				topics.set(i, topic);
//			}
//		}
		courseRepository.save(course);
	}

	public void deleteCourse(String id) {
		// topics.removeIf(t -> t.getId().equals(id));
		courseRepository.delete(id);
	}
}