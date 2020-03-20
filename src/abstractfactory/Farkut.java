package abstractfactory;

public abstract class Farkut implements Vaate {

	public abstract String toString();
	
	@Override
	public void laitaPaalle() {
		System.out.println("Farkut on puettu");
	}
	
	@Override
	public void kerro() {
		System.out.println("Farkut on " + toString());
	}
	
}
