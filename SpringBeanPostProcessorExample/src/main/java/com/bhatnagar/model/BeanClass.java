package com.bhatnagar.model;

public class BeanClass {
	private String message;

	public void getMessage() {
		System.out.println("My Message is: " + message);
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void myInitMethod() {
		System.out.println("Initializing Bean...");
	}

	public void iDestroyBean() {
		System.out.println("Destroying Bean...");
	}
}