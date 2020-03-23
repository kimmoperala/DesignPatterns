package composite;

public class Prosessori implements Laiteosa {

	double price = 110;
	
	@Override
	public double getPrice() {
		return price;
	}

	@Override
	public void lisaaOsa(Laiteosa laiteosa) {
		throw new RuntimeException("Ei voi lisätä osaa");
	}

}
