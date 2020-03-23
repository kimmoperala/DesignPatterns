package composite;

import java.util.ArrayList;
import java.util.List;

public class Emolevy implements Laiteosa {

	double price = 40;
	double sum;

	List<Laiteosa> osaLista = new ArrayList<Laiteosa>();
	
	public double getPrice() {
		sum = 0;
		for (Laiteosa l : osaLista) {
			sum += l.getPrice();
		}
		return price + sum;
	}
	
	public void lisaaOsa(Laiteosa laiteosa) {
		osaLista.add(laiteosa);
	}
}
