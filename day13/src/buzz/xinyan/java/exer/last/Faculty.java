package buzz.xinyan.java.exer.last;

public class Faculty extends Employee {
	private String degree;
	private String level;
	
	protected Faculty(String degree, String level) {
		super();
		this.degree = degree;
		this.level = level;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	@Override
	public String toString() {
		return "Faculty [degree=" + degree + ", level=" + level + "]";
	}
	
	
}
