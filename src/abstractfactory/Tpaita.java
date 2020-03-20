package abstractfactory;

public abstract class Tpaita implements Vaate{

	public abstract String toString();

	@Override
	public void pue() {
		System.out.println("T-paita on " + toString());
	}


}
