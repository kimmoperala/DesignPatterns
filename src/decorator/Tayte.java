package decorator;

public abstract class Tayte implements PizzaAines {
	protected PizzaAines newPizzaAines;
	
	public Tayte (PizzaAines newPizzaAines) {
		this.newPizzaAines = newPizzaAines;
	}

	public double getPrice() {
		return newPizzaAines.getPrice();
	}

	public String toString() {
		return newPizzaAines.toString();
	}

}
