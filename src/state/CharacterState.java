package state;

public abstract class CharacterState {
	public void escape(Pokemon pokemon) {}
	public void attack(Pokemon pokemon) {}
	public void fight(Pokemon pokemon) {}
	public void evolve(Pokemon pokemon) {}
	public void revert(Pokemon pokemon) {}
}
