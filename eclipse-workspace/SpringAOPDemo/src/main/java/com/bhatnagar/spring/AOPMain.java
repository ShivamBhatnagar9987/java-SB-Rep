package com.bhatnagar.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bhatnagar.service.ShapeService;

public class AOPMain {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		ShapeService shapeService = applicationContext.getBean("shapeService", ShapeService.class);
		System.out.println("shape: " + shapeService.getTriangle().getName());
	}
}
