package com.persistent;

public class Triangle {
	private Point point1;
	private Point point2;
	private Point point3;
	public Triangle(Point point1, Point point2, Point point3) {
		super();
		this.point1 = point1;
		this.point2 = point2;
		this.point3 = point3;
	}
	
	
	public Triangle() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Point getPoint1() {
		return point1;
	}


	public void setPoint1(Point point1) {
		this.point1 = point1;
	}


	public Point getPoint2() {
		return point2;
	}


	public void setPoint2(Point point2) {
		this.point2 = point2;
	}


	public Point getPoint3() {
		return point3;
	}


	public void setPoint3(Point point3) {
		this.point3 = point3;
	}
	public static Triangle getTriangle()
	{
		return new Triangle(new Point(0,0,0), new Point(10,0,0), new Point(0,10,0));
	}
	public void draw()
	{
		System.out.println("Triangle drawn::"+this);
	}
	
	public String drawString(String args)
	{
		System.out.println("Triangle drawn for String::"+args);
		return "Returning"+args;
	}
	public String drawException(String args)
	{
		if(args.equals("Nishant Niranjan"))
		{
			throw new RuntimeException("This exception is thrown");
		}
		return "returning exception"+args;
	}

	@Override
	public String toString() {
		return "Triangle [point1=" + point1 + ", point2=" + point2
				+ ", point3=" + point3 + "]";
	}
	
	
}
