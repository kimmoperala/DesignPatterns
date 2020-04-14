package visitor;

public class Charmeleon extends CharacterState {
	private static Charmeleon INSTANCE = null;
	
	private Charmeleon() {}
	public static Charmeleon getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new Charmeleon();
		}
		return INSTANCE;
	}
	public void escape(Pokemon pokemon, Visitor visitor) {
		int points = -150;
		System.out.println("Charmeleon pakenee! " + points);
		pokemon.addPoints(points);
		visitor.visit(this);
	}
	public void attack(Pokemon pokemon, Visitor visitor) {
		int points = 150;
		System.out.println("Charmeleon hyökkää liekillä! +" + points);
		pokemon.addPoints(points);
		visitor.visit(this);
	}
	public void fight(Pokemon pokemon, Visitor visitor) {
		int points = 300;
		System.out.println("Charmeleon raapii! +" + points);
		pokemon.addPoints(points);
		visitor.visit(this);
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
