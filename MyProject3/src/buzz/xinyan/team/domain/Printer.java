package buzz.xinyan.team.domain;

public class Printer implements Equipment {
	private String name;
	private String type;
	public Printer() {
	}
	public Printer(String name ,String type) {
		this.name = name;
		this.type  = type; 
	}
	public void setName(String name) {
		this.name = name; 
	}
	public String getName() {
		return name;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return name+"("+ type +")";
	}

}
