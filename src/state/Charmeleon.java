package state;

public class Charmeleon extends CharacterState {
	private static Charmeleon INSTANCE = null;
	
	private Charmeleon() {}
	public static Charmeleon getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new Charmeleon();
		}
		return INSTANCE;
	}
	public void escape(Pokemon pokemon) {
		int points = -150;
		System.out.println("Charmeleon pakenee! " + points);
		pokemon.addPoints(points);
	}
	public void attack(Pokemon pokemon) {
		int points = 150;
		System.out.println("Charmeleon hyökkää liekillä! +" + points);
		pokemon.addPoints(points);
	}
	public void fight(Pokemon pokemon) {
		int points = 300;
		System.out.println("Charmeleon raapii! +" + points);
		pokemon.addPoints(points);
	}
	public void evolve(Pokemon pokemon) {
		System.out.println("Charmeleon kehittyi Charizardiksi!");
		pokemon.change(Charizard.getInstance());
	}
	public void revert(Pokemon pokemon) {
		System.out.println("Charmeleon palautui Charmanderiksi!");
		pokemon.change(Charmander.getInstance());
	}
}
