package abstractfactory;

public class BossKengät implements Vaate {

	public String toString() {
		return "Bossin kengät";
	}

	@Override
	public void pue() {
		toString();
	}

}
