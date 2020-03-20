package abstractfactory;

public abstract class Lippis implements Vaate{
	public abstract String toString();
	
	@Override
	public void laitaPaalle() {
		System.out.println("Lippis on puettu");
	}
	
	@Override
	public void kerro() {
		System.out.println("Lippis on " + toString());
	}
	
}
