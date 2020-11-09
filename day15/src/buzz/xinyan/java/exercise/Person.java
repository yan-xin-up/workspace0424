package buzz.xinyan.java.exercise;


public abstract class Person {
	private String name;
	private int age;
	private String sex;
	
	public Person() {
		super();
	}

	public Person(String name, int age, String sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", sex=" + sex + "]";
	}
	
	public abstract void work();
	public abstract void hello();
	
	public static void main(String[] args) {
		new Teacher().work();
		new Teacher().hello();
		new Students().work();
		new Students().hello();
		
	}
}
class Teacher extends Person{

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("教书育人");
	}

	@Override
	public void hello() {
		// TODO Auto-generated method stub
		System.out.println("同学好");
	}
	
}
class Students extends Person{

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("认真学习");
	}

	@Override
	public void hello() {
		// TODO Auto-generated method stub
		System.out.println("老师好");
	}
	
}
