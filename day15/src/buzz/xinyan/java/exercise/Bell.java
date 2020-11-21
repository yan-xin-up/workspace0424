package buzz.xinyan.java.exercise;

public interface Bell {
	void sound();
}
class CellPhone{
	void alarm(Bell b) {
		// TODO Auto-generated method stub
		b.sound();
	}
}