package com.persistent.util;

public class Triangle {
	private double area;
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
		return "Triangle [area=" + area + "]";
	}
}
