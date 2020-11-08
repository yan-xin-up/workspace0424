package buzz.xinyan.java.exercise;

import java.util.Scanner;

public class Car {
	private static double temperature;
	private String Air;
	static class airHeigh{
		private void flow() {
			// TODO Auto-generated method stub
			System.out.println("吹冷风");
		}
	}
	static class airLow{
		private void flow() {
			// TODO Auto-generated method stub
			System.out.println("开暖气");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		temperature = sc.nextDouble();
		System.out.println("temp"+temperature);
		if(temperature > 40) {
			 new airHeigh().flow();
		}else {
			new airLow().flow();
		}
	}
}
