package com.xinyan.buzz.exe1;

public class Cylineder extends Circle {
	private double length;
	
	public Cylineder() {
		length = 1;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getLength() {
		return length;
	}
	public double findVolume() {
		double volume = findArea()*length;
		return volume;
	}

}
