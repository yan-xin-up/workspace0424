package com.xinyan.buzz.exe1;

public class CylinederTest {

	public static void main(String[] args) {
		Cylineder volume = new Cylineder();
		volume.setRadius(19.87);
		volume.setLength(25);
		System.out.println("圆柱体积："+volume.findVolume());
		System.out.println("圆柱面积："+volume.findArea());

	}

}
