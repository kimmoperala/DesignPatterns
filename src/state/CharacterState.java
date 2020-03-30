package state;

public abstract class CharacterState {
	void escape(Pokemon pokemon) {}
	void attack(Pokemon pokemon) {}
	void fight(Pokemon pokemon) {}
	void changeState(Pokemon pokemon, CharacterState s) {
		pokemon.changeState(s);
	}
}
