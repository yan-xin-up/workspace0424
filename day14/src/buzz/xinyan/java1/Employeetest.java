package buzz.xinyan.java1;

public class Employeetest {
	public static void main(String[] args) {
		//多态
		Employee M = new Manager("jack ma", 21, 5000, 9999);
		M.work();
		CommonEmployee c = new CommonEmployee();
		c.work();
	}
}

abstract class Employee {
	public String name;
	public int age;
	public double salary;

	public Employee() {
		super();
	}

	public Employee(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public abstract void work();
}

class Manager extends Employee {
	private double bonus;

	public Manager(double bonus) {
		super();
		this.bonus = bonus;
	}

	public Manager(String name, int age, double salary, double bonus) {
		super(name, age, salary);
		this.bonus = bonus;
	}

	public void work() {
		System.out.println("sb经理");
	}
}

class CommonEmployee extends Employee {

	@Override
	public void work() {
		System.out.println("work");
	}

}
