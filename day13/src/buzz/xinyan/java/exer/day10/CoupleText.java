package buzz.xinyan.java.exer.day10;

public class CoupleText {
	
	public static void main(String[] args) {
		Husband hus = new Husband();
		Wife wif = new Wife();
		
		hus.name = "二狗";
		hus.age = 28;
		wif.name = "Yua Mikami";
		wif.age = 29;
		hus.getInfo(wif);

		wif.getInfo(hus);
	}
	
}
