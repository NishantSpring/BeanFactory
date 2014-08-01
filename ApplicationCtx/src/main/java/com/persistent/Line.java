package com.persistent;

import java.util.List;

public class Line {
	private List<Point> points;

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}

	@Override
	public String toString() {
		return "Line [points=" + points + "]";
	}
	
}
