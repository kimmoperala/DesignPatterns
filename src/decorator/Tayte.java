package decorator;

public abstract class Tayte implements Pizza {
	protected Pizza newPizza;
	
	public Tayte (Pizza newPizza) {
		this.newPizza = newPizza;
	}

	public double getPrice() {
		return newPizza.getPrice();
	}

	public String toString() {
		return newPizza.toString();
	}

}
