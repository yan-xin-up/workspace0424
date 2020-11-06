package buzz.xinyan.java.exercise;

public interface Bio {
	void respirations();
}

interface Animal extends Bio {
	void run();
}
interface aAnimal extends Animal {
	
}
interface bAnimal extends aAnimal {
	
}
interface Plant extends Bio {
	void reproduction();
}
interface aPlant extends Plant {
	
}

