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
		System.out.println("Tervetuloa peliin!");
		handToBeat = options[(int)(Math.random()*3)];
	}

	@Override
	void makePlay(int player) {
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
		if (handToBeat.equals(guess)) {
			System.out.println("\t" + StringUtils.capitalize(guess) + " on oikein!");
			return true;
		}
		return false;
	}

	@Override
	void printWinner() {
		System.out.println("\tPelaaja " + (winner+1) + " voitti! Onnea!");
	}

}
