package buzz.xinyan.java.exer.last;

import java.util.Date;

public class Person1 {
	private String id;
	private String gender;
	private String name;
	private int age;
	private String census_register;
	private Date birthday;

	protected Person1(String id, String gender, String name, int age, String census_register) {
		super();
		this.id = id;
		this.gender = gender;
		this.name = name;
		this.age = age;
		this.census_register = census_register;
	}

	@Override
	public String toString() {
		return "Person [ id = " + id + "+姓名 = " + name + "+户籍 = " + census_register + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj instanceof Person1) {
			Person1 p = (Person1) obj;
			return this.id.equals(p.id) && this.name.equals(p.name);
		}
		return false;
	}
}
