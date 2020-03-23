package composite;

public class Verkkokortti implements Laiteosa {

	double price = 15;
	
	@Override
	public double getPrice() {
		return price;
	}

	@Override
	public void lisaaOsa(Laiteosa laiteosa) {
		throw new RuntimeException("Ei voi lisätä osaa");
	}

}
