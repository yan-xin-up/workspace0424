package buzz.xinyan.java.exer.last;

public class Person1Test {
	public static void main(String[] args) {
		Person1 p1 = new Person1("110123456781234", "male", "mikami_yua", 28, "japan");
		System.out.println("自我介绍："+ p1.toString());
		Person1 p2 = new Person1("110123456781232", "male", "ishihara_satomi", 32, "japan");
		System.out.println("自我介绍："+ p2.toString());
	    System.out.println("二位的信息："+ p1.equals(p2));
	}
}
