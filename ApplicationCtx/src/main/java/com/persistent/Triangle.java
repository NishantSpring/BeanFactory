package com.persistent;

public class Triangle {
	private double area;
	private int height;
	private int width;
	private String name;
	
	public Triangle(int height, int width) {
		super();
		this.height = height;
		this.width = width;
	}
	public Triangle(int height, int width, String name) {
		super();
		this.height = height;
		this.width = width;
		this.name = name;
	}
	
	public Triangle(String name, int height, int width) {
		super();
		this.height = height;
		this.width = width;
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public void draw()
	{
		System.out.println("triangle drawn");
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	@Override
	public String toString() {
		return "Triangle [area=" + area + ", height=" + height + ", width="
				+ width + ", name=" + name + "]";
	}	
}
