package buzz.xinyan.java.exer.last1;

public class PersonTest {
	public static void main(String[] args) {
		Student s1 = new Student("satomi_ishihara", '女', 32, 1988);
		Student s2 = new Student("yua_mikami", '女', 27, 1993);
		System.out.println("两个小姐姐是一个人吗：" + s1.equals(s2));		
	}
}
class Person {
	private String name;
	private char gender;
	private int age;
	
	public Person() {
		super();
	}

	public Person(String name, char gender, int age) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person[ name= " + getAge() + " ,gender=" + getGender() +
				" ,age="+getAge()+"]";
	}
	
}
class Student extends Person {
	private int number;

	public Student(String name, char gender, int age,int number) {
		super(name,gender,age);
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "Student[ number："+ getNumber() +"]";
	}
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj instanceof Student ) {
			Student s = (Student)obj;
			return this.number == s.number && this.getName().equals(s.getName());
		}
		return false;
	}
}
