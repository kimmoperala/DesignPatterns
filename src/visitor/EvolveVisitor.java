package visitor;

public class EvolveVisitor implements Visitor {
	private Pokemon pokemon;
	private int points;

	public EvolveVisitor(Pokemon pokemon) {
		this.pokemon = pokemon;
	}
	@Override
	public void visit(Charmander charmander) {
		this.points = pokemon.getPoints();
		if (this.points >= 500) {
			pokemon.evolve();
		}
		if (this.points < 0) {
			pokemon.revert();
		}
	}

	@Override
	public void visit(Charmeleon charmeleon) {
		this.points = pokemon.getPoints();
		if (this.points >= 1000) {
			pokemon.evolve();
		}
		if (this.points < 500) {
			pokemon.revert();
		}
	}

	@Override
	public void visit(Charizard charizard) {
		this.points = pokemon.getPoints();
		if (this.points < 1000) {
			pokemon.revert();
		}
	}

}
