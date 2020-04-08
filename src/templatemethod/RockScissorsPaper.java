package templatemethod;

import java.util.Scanner;

import com.sun.xml.internal.ws.util.StringUtils;

public class RockScissorsPaper extends Game {
	Scanner reader = new Scanner(System.in);
	String[] options = {"kivi", "paperi", "sakset"};
	String handToBeat;
	String guess;
	int winner;

	@Override
	void initializeGame() {
		System.out.println("Tervetuloa! Yritä voittaa tietokone kivi-paperi-sakset-pelissä...");
	}

	@Override
	void makePlay(int player) {
		handToBeat = options[(int)(Math.random()*3)];

		while (true) {
			System.out.println("Pelaaja " + (player+1) + ", valitse kivi(k), paperi(p) tai sakset(s)!");
			guess = reader.nextLine();
			if (guess.equals("kivi") || guess.equals("k")) {
				guess = options[0];
				break;
			} else if (guess.equals("paperi") || guess.equals("p")) {
				guess = options[1];
				break;
			} else if (guess.equals("sakset") || guess.equals("s")) {
				guess = options[2];
				break;
			} else {
				System.out.println("Väärä syöte!");
			}
		}
		System.out.println("Pelaaja " + (player+1) + ", valitsit " + guess + "!");
		winner = player;
	}

	@Override
	boolean endOfGame() {
		if (guess != null) {
			if (handToBeat.equals(options[0]) && guess.equals(options[1])
				|| handToBeat.equals(options[1]) && guess.equals(options[2])
				|| handToBeat.equals(options[2]) && guess.equals(options[0])) {
				return true;
			}
			else if (handToBeat.equals(options[0]) && guess.equals(options[2])
					|| handToBeat.equals(options[1]) && guess.equals(options[0])
					|| handToBeat.equals(options[2]) && guess.equals(options[1])) {
					System.out.println("Tietokone voitti!");
			}
			else if (handToBeat.equals(guess)) {
					System.out.println("Tasapeli!");
			}
		}
		return false;
	}

	@Override
	void printWinner() {
		System.out.println("\tPelaaja " + (winner+1) + " voitti! Onnea!");
	}

}
