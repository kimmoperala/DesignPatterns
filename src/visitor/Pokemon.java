package visitor;

public class Pokemon {
	private CharacterState state;
	private int points;
	
	public Pokemon() {
		state = Charmander.getInstance();
		points = 0;
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
	protected void change(CharacterState newState) {
		state = newState;
	}
	public void addPoints(int points) {
		int oldPoints = this.points;
		this.points += points;
		if (oldPoints < 500 && this.points >= 500 || oldPoints < 1000 && this.points >= 1000) {
			state.evolve(this);
		}
		if ((oldPoints >= 0 && this.points < 0) || (oldPoints >= 500 && this.points < 500) || (oldPoints >= 1000 && this.points < 1000)) {
			state.revert(this);
		}
	}
	public int getPoints() {
		return this.points;
	}
}