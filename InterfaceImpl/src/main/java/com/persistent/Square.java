package com.persistent;

public class Square implements Shape {
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void draw() {
		System.out.println("Square is drawn");
	}
	@Override
	public String toString() {
		return "Square [name=" + name + "]";
	}
}
