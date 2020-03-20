package abstractfactory;

public abstract class Kengat implements Vaate{
	public abstract String toString();

	@Override
	public void laitaPaalle() {
		System.out.println("Kengät on puettu");
	}
	
	@Override
	public void kerro() {
		System.out.println("Kengät on " + toString());
	}
}
