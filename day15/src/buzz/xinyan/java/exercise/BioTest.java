package buzz.xinyan.java.exercise;

public class BioTest {
	public static void main(String[] args) {
		SunFlower sunf = new SunFlower();
		sunf.respirations();
		sunf.reproduction();
		System.out.println("*******************************************");
		yazuiAnimal yz = new yazuiAnimal();
		yz.respirations();
		yz.run();
	}
}
