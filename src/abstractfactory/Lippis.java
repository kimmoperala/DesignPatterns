package abstractfactory;

public abstract class Lippis implements Vaate{
	public abstract String toString();

	@Override
	public void pue() {
		System.out.println("Lippis on " + toString());
	}

}
