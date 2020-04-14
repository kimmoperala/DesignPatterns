package visitor;

public class Pokemon {
	private CharacterState state;
	private int points;
	private Visitor visitor;
	
	public Pokemon() {
		state = Charmander.getInstance();
		points = 0;
		visitor = new EvolveVisitor(this);
	}
	public void withdraw() {
		state.escape(this, visitor);
	};
	public void charge() {
		state.attack(this, visitor);
	};
	public void battle() {
		state.fight(this, visitor);
	};
	protected void change(CharacterState newState) {
		state = newState;
	}
	public void evolve() {
		state.evolve(this);
	}
	public void revert() {
		state.revert(this);
	}
	public void addPoints(int points) {
		this.points += points;
	}
	public int getPoints() {
		return this.points;
	}
}