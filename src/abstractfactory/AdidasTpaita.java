package abstractfactory;

public class AdidasTpaita implements Vaate {
	
	public String toString() {
		return "Adidaksen T-paita";
	}

	@Override
	public void pue() {
		toString();
	}

}
