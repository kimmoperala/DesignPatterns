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
	public void escape() {
		System.out.println("Charizard pakenee!");
	}
	public void attack() {
		System.out.println("Charizard hyökkää isolla liekillä!");
	}
	public void fight() {
		System.out.println("Charizard lyö hännällä!");
	}
	public void evolve(Pokemon pokemon) {
		System.out.println("Charizard ei voi kehittyä!");
	}
}
