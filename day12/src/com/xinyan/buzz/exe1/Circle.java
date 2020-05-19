package com.xinyan.buzz.exe1;

public class Circle {
	private double radius;

	public Circle() {
		radius = 1;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public double findArea() {

		double area = Math.PI * radius * radius;
		return area;
	}
}
