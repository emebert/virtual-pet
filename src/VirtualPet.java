
public class VirtualPet {
	String name = "Rupert";

	int hunger = 50;
	int thirst = 50;
	int boredom = 50;

	public String poacherVerification;

	void feed() {
		hunger = hunger - 10;
	}

	boolean isHungry() {
		return hunger >= 20;
	}

	void water() {
		thirst = thirst - 10;
	}

	boolean isThirsty() {
		return thirst >= 20;
	}

	void play() {
		boredom = boredom - 10;
	}

	boolean isBored() {
		return boredom >= 20;
	}

	void tick() {
		hunger = hunger + 5;
		thirst = thirst + 5;
		boredom = boredom + 5;

	}

}
