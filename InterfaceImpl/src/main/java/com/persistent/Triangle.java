package com.persistent;

import org.springframework.beans.factory.annotation.Required;

public class Triangle implements Shape {
	
	private String name;
	public String getName() {
		return name;
	}
	@Required
	public void setName(String name) {
		this.name = name;
	}
	public void draw() {
		System.out.println("Triangle is drawn");
	}
	@Override
	public String toString() {
		return "Triangle [name=" + name + "]";
	}
}
