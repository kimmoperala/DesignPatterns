package state;

public class Charmander extends CharacterState {
	private static Charmander INSTANCE = null;
	private int points;
	
	private Charmander() {}
	public static Charmander getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new Charmander();
		}
		return INSTANCE;
	}
	public void escape() {
		System.out.println("Charmander pakenee!");
	}
	public void attack() {
		System.out.println("Charmander hyökkää!");
	}
	public void fight() {
		System.out.println("Charmander taistelee!");
	}
	public void evolve(Pokemon pokemon) {
		changeState(pokemon, Charmeleon.getInstance());
	}
}
