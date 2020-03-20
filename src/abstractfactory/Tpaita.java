package abstractfactory;

public abstract class Tpaita implements Vaate{

	public abstract String toString();

	@Override
	public void laitaPaalle() {
		System.out.println("T-paita on puettu");
	}
	
	@Override
	public void kerro() {
		System.out.println("T-paita on " + toString());
	}
}
	
