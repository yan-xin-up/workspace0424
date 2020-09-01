package buzz.xinyan.java.exer.day10;

public class StudentText {
	public static void main(String[] args) {
		Student stu = new Student();
		stu.age = 19;
		stu.gender = "female";
		stu.name = "yua mikami";
		stu.id = 1993;
		stu.score = 19.55;
		
		System.out.println(stu.Say());

	}
}
