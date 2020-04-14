package visitor;

public abstract class CharacterState {
	public void escape(Pokemon pokemon, Visitor visitor) {}
	public void attack(Pokemon pokemon, Visitor visitor) {}
	public void fight(Pokemon pokemon, Visitor visitor) {}
	public void evolve(Pokemon pokemon) {}
	public void revert(Pokemon pokemon) {}
}
