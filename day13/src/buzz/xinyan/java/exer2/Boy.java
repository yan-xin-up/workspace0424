package buzz.xinyan.java.exer2;

public class Boy {
	private String name;
	private int age;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void marry(Girl girl) {
		System.out.println("我想取"+girl.getName());
	}
	public void shout() {
		if(age>= 22) {
			System.out.println("领证");
		}else {
			System.out.println("在聊");
		}
		
	}

	public Boy(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
}
