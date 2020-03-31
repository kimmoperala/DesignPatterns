package state;

public abstract class CharacterState {
	public void escape() {}
	public void attack() {}
	public void fight() {}
	public void changeState(Pokemon pokemon, CharacterState s) {
		pokemon.changeState(s);
	}
	public void evolve(Pokemon pokemon) {}
}
