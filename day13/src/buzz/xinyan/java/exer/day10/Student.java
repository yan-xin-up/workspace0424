package buzz.xinyan.java.exer.day10;

public class Student {
	String name = "二狗";
	String gender = "male";
	int age = 29;
	int id = 15811;
	double score = 50.5;

	public String Say() {
		
		return "你的的信息是：name=" + this.name + 
				"\tage=" + this.age + 
				"\tgender=" + this.gender+ 
				"\tid=" + this.id+ 
				"\tscore=" + this.score;
	}
}
