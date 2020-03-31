package state;

public class Charizard extends CharacterState {
	private static Charizard INSTANCE = null;
	
	private Charizard() {}
	public static Charizard getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new Charizard();
		}
		return INSTANCE;
	}
	public void escape(Pokemon pokemon) {
		int points = -200;
		System.out.println("Charizard pakenee! " + points);
		pokemon.addPoints(points);
	}
	public void attack(Pokemon pokemon) {
		int points = 200;
		System.out.println("Charizard hyökkää isolla liekillä! " + points);
		pokemon.addPoints(points);
	}
	public void fight(Pokemon pokemon) {
		int points = 350;
		System.out.println("Charizard lyö hännällä! " + points);
		pokemon.addPoints(points);
	}
	public void evolve(Pokemon pokemon) {
		System.out.println("Charizard ei voi kehittyä!");
	}
	public void revert(Pokemon pokemon) {
		System.out.println("Charizard palautui Charmeleoniksi!");
		pokemon.change(Charmeleon.getInstance());
	}
}
