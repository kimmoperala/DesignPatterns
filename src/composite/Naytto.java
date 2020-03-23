package composite;

public class Naytto implements Laiteosa {

	double price = 100;

	@Override
	public double getPrice() {
		return price;
	}

	@Override
	public void lisaaOsa(Laiteosa laiteosa) {
		throw new RuntimeException("Ei voi lisätä osaa");
	}

}
