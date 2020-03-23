package composite;

public class Muistipiiri implements Laiteosa {

	double price = 50;
	
	@Override
	public double getPrice() {
		return price;
	}

	@Override
	public void lisaaOsa(Laiteosa laiteosa) {
		throw new RuntimeException("Ei voi lisätä osaa");
	}

}
