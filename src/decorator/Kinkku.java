package decorator;

public class Kinkku extends Tayte {

	private double price = 4.0;
	
	public Kinkku(PizzaAines newPizzaAines) {
		super(newPizzaAines);
	}

	@Override
	public double getPrice() {
		return super.getPrice() + price;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", kinkku";
	}
}
