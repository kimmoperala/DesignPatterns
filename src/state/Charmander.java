package state;

public class Charmander extends CharacterState {
	private static Charmander INSTANCE = null;
	
	private Charmander() {
	}
	public static Charmander getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new Charmander();
		}
		return INSTANCE;
	}
	public void escape(Pokemon pokemon, int points) {
		points += 40;
		System.out.println("Charmander pakenee!");
	}
	public void attack(Pokemon pokemon) {
		System.out.println("Charmander hyökkää pienellä liekillä!");
	}
	public void fight(Pokemon pokemon) {
		System.out.println("Charmander potkii!");
	}
	public void evolve(Pokemon pokemon) {
		changeState(pokemon, Charmeleon.getInstance());
	}
	
}
