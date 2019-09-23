package org.bhatnagar.main;

import org.bhatnagar.model.Student;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClassSpringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		appContext.registerShutdownHook();
		Student s = appContext.getBean("studentBean", Student.class);
		s.displayResults();
	}
}
