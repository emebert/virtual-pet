import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		VirtualPet rhino = new VirtualPet();

		// Introduction to virtual pet
		writeLine(
				"This is Rupert the rhino. He is one of 2,500 virtual black rhinos left in the entire world. No pressure.");

		// Confirm that user is not a poacher.
		writeLine("Poachers cannot adopt endangered virtual pets. Are you a poacher? Enter 'yes' or 'no'.");

		rhino.poacherVerification = input.nextLine();

		rhino.poacherVerification = rhino.poacherVerification.toLowerCase();
		// Game ends if user fails to answer no to poacher question.

		if (rhino.poacherVerification.equals("no")) {
			writeLine("You have indicated you are not a poacher. Congratulations on the adoption of your pet rhino!");

		} else {
			writeLine(
					"Your response implies you may be a poacher. You cannot adopt Rupert the rhino at this time. Goodbye.");
			System.exit(0);
		}

		// Game loop. User can feed, give water to, or play with Rupert.

		do {
			rhino.tick(); // Time passes each time this loop is run, increasing
							// hunger, thirst, and boredom.
			writeLine("Interact with Rupert! Enter 'feed', 'water', or 'play.'");
			String interact = input.nextLine();

			switch (interact) {
			case "feed":
				rhino.feed();
				writeLine("You fed Rupert! That's good. You don't want to cross a hungry rhino.");
				break;
			case "water":
				rhino.water();
				writeLine(
						"You gave Rupert some water to drink. This is basic pet ownership stuff but you're getting the hang of it.");
				break;
			case "play":
				rhino.play();
				writeLine("You played with Rupert! All work and no play makes Rupert a dull rhino.");
				break;
			default:
				writeLine("You did not enter a valid entry. Try again.");
				break;
			}
			
			if (rhino.hunger >= 80) {
				writeLine("Your rhino is getting hungry...");
				// Warning that Rupert is hungry

				if (rhino.thirst >= 80) {
					writeLine("Your rhino is dangerously parched..");
					// Warning that Rupert is thirsty

				}
				if (rhino.boredom >= 80) {
					writeLine("Rhinos can die of boredom... ");
					// Warning that Rupert is getting dangerously bored
				}
				if (rhino.hunger <= -20) {
					writeLine("You may be overfeeding your rhino...");
					// Warning that Rupert is getting overfed
				}
			}
		} while (rhino.hunger <= 100 || rhino.thirst <= 100 || rhino.boredom <= 100);
		// Reaching these levels causes death and ends the game

	}

	public static void writeLine(String message) {
		System.out.println(message);

	}

}
