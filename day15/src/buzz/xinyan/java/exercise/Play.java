package buzz.xinyan.java.exercise;

public interface Play {
	void play();
}

class playPiano extends Instrument implements Play {

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("piano play:" + getPiano());
	}
}

class playViolin extends Instrument implements Play {

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("viano play:" + getViolin());
	}
}
