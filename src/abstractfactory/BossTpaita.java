package abstractfactory;

public class BossTpaita implements Vaate{

	public String toString() {
		return "Bossin T-paita";
	}

	@Override
	public void pue() {
		toString();
	}
}
