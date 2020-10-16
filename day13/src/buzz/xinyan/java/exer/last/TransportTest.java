package buzz.xinyan.java.exer.last;

public class TransportTest {
	public static void main(String[] args) {
		Transport t = new Transport();
		t.abst();
		Transport tr = new CAr2();
		tr.abst();
		Transport s = new Ship();
		s.abst();
		
	}
}
class Transport{
	public void abst() {
		System.out.println("Transport can move");
	}
}
class CAr2 extends Transport{
	@Override
	public void abst() {
		System.out.println("CAr can move");
	}
}
class Train extends Transport{
	@Override
	public void abst() {
		System.out.println("Train can move");
	}
}
class Ship extends Transport{
	@Override
	public void abst() {
		System.out.println("Ship can move");
	}
}