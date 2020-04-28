package decorator;

public class Tonnikala extends Tayte {
	
	private double price = 2.5;
	
	public Tonnikala(PizzaAines newPizzaAines) {
		super(newPizzaAines);
	}

	@Override
	public double getPrice() {
		return super.getPrice() + price;
	}
	@Override
	public String toString() {
		return super.toString() + ", tonnikala";
	}
}
