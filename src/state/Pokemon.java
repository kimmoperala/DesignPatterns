package state;

public class Pokemon {
	private CharacterState state;
	
	public Pokemon() {
		state = Charmander.getInstance();
	}
	public void withdraw() {
		state.escape(this);
	};
	public void charge() {
		state.attack(this);
	};
	public void battle() {
		state.fight(this);
	};
	protected void changeState (CharacterState s) {
		state = s;
	}
}
