package buzz.xinyan.java1;

public class SalariedEmployee extends Employee {
	private double monthlySalary;

	public SalariedEmployee() {
		super();
	}

	public SalariedEmployee(String name, int number, MyDate birthday) {
		super(name, number, birthday);
	}
	public SalariedEmployee(String name, int number, MyDate birthday,double monthlySalary) {
		super(name, number, birthday);
		this.monthlySalary = monthlySalary;
	}

	public double getMonthlySalary() {
		return monthlySalary;
	}

	@Override
	public double earnings() {
		return monthlySalary;
	}

	@Override
	public String toString() {
		return "SalariedEmployee ["+super.toString()+ "]";
	}
	
}
