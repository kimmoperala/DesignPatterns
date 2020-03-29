package decorator;

public class Salami extends Tayte {

	private double price = 3.5;
	
	public Salami(Pizza newPizza) {
		super(newPizza);
	}

	@Override
	public double getPrice() {
		return super.getPrice() + price;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", salami";
	}
}
