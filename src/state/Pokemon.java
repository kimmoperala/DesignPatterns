package state;

public class Pokemon {
	private CharacterState state;
	
	public Pokemon() {
		state = Charmander.getInstance();
	}
	public void withdraw() {
		state.escape();
	};
	public void charge() {
		state.attack();
	};
	public void battle() {
		state.fight();
	};
	protected void changeState (CharacterState s) {
		state = s;
	}
}