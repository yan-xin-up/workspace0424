package buzz.xinyan.java1;

public  class HourlyEmployee extends Employee {
	private  double wage;
	private double hour;
	
	public HourlyEmployee() {
		super();
	}
	
	public HourlyEmployee(String name, int number, MyDate birthday) {
		super(name,number,birthday);
	}
	public HourlyEmployee(String name, int number, MyDate birthday,double wage,double hour) {
		super(name,number,birthday);
		this.hour = hour;
		this.wage = wage;
	}
	

	public  double getWage() {
		return wage;
	}
	public  void setWage(double wage) {
		this.wage = wage;
	}
	public double getHour() {
		return hour;
	}
	public void setHour(double hour) {
		this.hour = hour;
	}
	@Override
	public double earnings() {
		// TODO Auto-generated method stub
		return wage*hour;
	}
	@Override
	public String toString() {
		return "HourlyEmployee ["+super.toString() + "]";
	}
	
}
