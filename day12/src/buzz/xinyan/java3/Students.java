package buzz.xinyan.java3;

public class Students extends Persion {
	private String major;
	 int id = 789;
	public Students() {
	}
	public  Students(String major) {
		this.major = major;
	}
	public Students(String name,int age,String major) {
//		this.name = name;
		super(name,age);
		this.major = major;
	}
	@Override
	public void eat() {
	System.out.println("学生，多吃营养食物");
	
	}
	public void study() {
		// TODO Auto-generated method stub
		System.out.println("学生，学习知识");
		eat();
		super.eat();
		
	}
	
	public void show() {
		System.out.println("id = "+id);
		System.out.println("id ="+ super.id);
		System.out.println("name = " + name + ", age = " + age);
	}
}
