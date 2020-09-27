package buzz.xinyan.java.exe;

public class KidsTest {
	public static void main(String[] args) {
		Kids someKids  = new Kids();
		someKids.setYearsOld(18);
		someKids.setSalary(500);
		someKids.setSex(0);
		someKids.employeed();
		someKids.manOrWoman();
		someKids.printAge();
	}
}
