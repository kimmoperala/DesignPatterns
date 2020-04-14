package visitor;

public class Charmander extends CharacterState {
	private static Charmander INSTANCE = null;
	
	private Charmander() {}
	public static Charmander getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new Charmander();
		}
		return INSTANCE;
	}
	public void escape(Pokemon pokemon, Visitor visitor) {
		int points = -100;
		System.out.println("Charmander pakenee! " + points);
		pokemon.addPoints(points);
		visitor.visit(this);
	}
	public void attack(Pokemon pokemon, Visitor visitor) {
		int points = 100;
		System.out.println("Charmander hyökkää pienellä liekillä! +" + points);
		pokemon.addPoints(points);
		visitor.visit(this);
	}
	public void fight(Pokemon pokemon, Visitor visitor) {
		int points = 200;
		System.out.println("Charmander potkii! +" + points);
		pokemon.addPoints(points);
		visitor.visit(this);
	}
	public void evolve(Pokemon pokemon) {
		System.out.println("Charmander kehittyi Charmeleoniksi!");
		pokemon.change(Charmeleon.getInstance());
	}
	public void revert(Pokemon pokemon) {
		System.out.println("Charmander ei voi taantua!");
	}
}
