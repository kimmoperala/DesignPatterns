package composite;

public class Hiiri implements Laiteosa {

	double price = 30;

	@Override
	public double getPrice() {
		return price;
	}

	@Override
	public void lisaaOsa(Laiteosa laiteosa) {
		throw new RuntimeException("Ei voi lisätä osaa");
	}

}
