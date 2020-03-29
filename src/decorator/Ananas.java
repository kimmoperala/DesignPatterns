package decorator;

public class Ananas extends Tayte {

	private double price = 3.0;
	
	public Ananas(Pizza newPizza) {
		super(newPizza);
	}

	@Override
	public double getPrice() {
		return super.getPrice() + price;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", ananas";
	}
}
