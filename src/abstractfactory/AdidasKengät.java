package abstractfactory;

public class AdidasKengät implements Vaate {

	public String toString() {
		return "Adidaksen kengät";
	}

	@Override
	public void pue() {
		toString();
	}

}
