package buzz.xinyan.java.exercise;

public interface Instrument1 {
	void play();
}
class violin implements Instrument1{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("play violin");
	}
}
class piano implements Instrument1{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("play piano");
	}
	
}
