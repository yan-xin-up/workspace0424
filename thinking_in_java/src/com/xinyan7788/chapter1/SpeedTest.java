package com.xinyan7788.chapter1;

public class SpeedTest {
	public static void main(String[] args) {
	SpeedTest speed = new SpeedTest();
	
		System.out.println(speed.speedC());
	}
	/**
	 * 
	 * @return
	 */
	public double speedC(){
		Speed speed1 = new Speed();
		speed1.setDistance(500);
		speed1.setTime(111);
		double speed =  speed1.getDistance() / speed1.getTime(); 
		
		return speed;
	}
	
}
