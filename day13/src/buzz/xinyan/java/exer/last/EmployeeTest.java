package buzz.xinyan.java.exer.last;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee1 Boss = new Employee1("boss", 1,99999);
		System.out.println("Boss奖金："+Boss.bonus()+" bucks");
		Employee1 staff = new Employee1("staff", 456,9999);
		System.out.println("staff奖金："+staff.bonus()+" bucks");
		
	}
}
class Employee1 {
	private String name;
	private int number;
	private double salary;
	
	public Employee1() {
		super();
	}
	
	public Employee1(String name, int number,int salary) {
		super();
		this.salary = salary; 
		this.name = name;
		this.number = number;

	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}


	public double bonus() {
		if(getNumber() > 0 && getNumber() <= 10) {
			return getSalary()*2;
		}else {
			return getSalary()*1.5;
		}
	}
}