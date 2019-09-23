package com.bhatnagar.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bhatnagar.model.Employee;

public class SpringTest {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee employee = (Employee) applicationContext.getBean("employee", Employee.class);
		System.out.println("Employee:: " + employee.getEmployeeId() + " " + employee.getEmployeeName());
	}
}
