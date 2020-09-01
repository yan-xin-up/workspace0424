package buzz.xinyan.java.exer.day10;

public class PersonText {
	public static void main(String[] args) {
		Person person = new Person("张三", "女", 19);
		person.introduce();
		person.eat("傻逼科锐食堂");
	}
}

class Person {
	private String name;
	private String gander;
	private int age;
	
	public Person() {
		
	}

	public Person(String name, String gander, int age) {
		super();
		this.name = name;
		this.gander = gander;
		this.age = age;
	}
	
	public void introduce() {
		System.out.println("名字："+name+" 性别："+gander+" 年龄："+age+"。");
	}
	
	public void eat(String food) {
//		food = "辣子鸡丁";
		
		System.out.println(name + " 吃 "+food+"。");
	}
	
}
