package state;

public class Charmeleon extends CharacterState {
	private static Charmeleon INSTANCE = null;
	private int points;
	
	private Charmeleon() {}
	public static Charmeleon getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new Charmeleon();
		}
		return INSTANCE;
	}
	public void escape() {
		System.out.println("Charmeleon pakenee!");
	}
	public void attack() {
		System.out.println("Charmeleon hyökkää liekillä!");
	}
	public void fight() {
		System.out.println("Charmeleon raapii!");
	}
	public void evolve(Pokemon pokemon) {
		changeState(pokemon, Charizard.getInstance());
	}
}
