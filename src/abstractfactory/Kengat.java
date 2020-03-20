package abstractfactory;

public abstract class Kengat implements Vaate{
	public abstract String toString();

	@Override
	public void pue() {
		System.out.println("Kengät on " + toString());
	}

}
