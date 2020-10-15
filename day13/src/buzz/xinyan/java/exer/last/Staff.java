package buzz.xinyan.java.exer.last;

public class Staff extends Employee {
	private String duty;

	protected Staff(String duty) {
		super();
		this.duty = duty;
	}

	public String getDuty() {
		return duty;
	}

	public void setDuty(String duty) {
		this.duty = duty;
	}
	
}
