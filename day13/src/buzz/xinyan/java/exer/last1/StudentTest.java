package buzz.xinyan.java.exer.last1;

public class StudentTest {
	public static void main(String[] args) {
		PersonOne  p = new PersonOne("aragaki_yui", 90);
		PersonOne  pp = new StudentOne("satomi_ishihara", 18, 111, 0);
		StudentOne s = new StudentOne("mikami_yua", 18, 112, 0);
		System.out.println("自我介绍：" + p.Say());
		System.out.println("自我介绍：" + pp.Say());
		System.out.println("自我介绍：" + s.Say());
	}
}

class PersonOne {
	private String name;
	private int age;

	public PersonOne() {
		super();
	}

	public PersonOne(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String Say() {
		return "名字：" + getName() + "年龄：" + getAge() + ".";
	}
}

class StudentOne extends PersonOne {
	private int id;
	private int score;

	public StudentOne() {
		super();
	}

	public StudentOne(String name, int age, int id, int score) {
		super(name, age);
		this.id = id;
		this.score = score;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String Say() {

		return "名字：" + getName() + " 年龄：" + getAge() + ";" + "id：" + getId() + "score：" + getScore() + ".";
	}
}