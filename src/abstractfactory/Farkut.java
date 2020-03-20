package abstractfactory;

public abstract class Farkut implements Vaate {

	public abstract String toString();
	
	@Override
	public void pue() {
		System.out.println("Farkut on " + toString());
	}

}
