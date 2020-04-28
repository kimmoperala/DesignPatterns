package decorator;

public class Pohja implements PizzaAines {

	private double price = 1.0;
	
	@Override
	public double getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return "pohja";
	}
}
