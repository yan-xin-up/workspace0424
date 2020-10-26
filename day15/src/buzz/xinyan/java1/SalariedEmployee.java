package buzz.xinyan.java1;

public class SalariedEmployee extends Employee {
	private int monthlySalary;
	
public SalariedEmployee() {
		super();
	}

public SalariedEmployee(String name, int number, MyDate birthday) {
	super(name,number,birthday);
}

public int getMonthlySalary() {
		return monthlySalary;
	}

@Override
public  int earnings() {
	return monthlySalary;
}
}
