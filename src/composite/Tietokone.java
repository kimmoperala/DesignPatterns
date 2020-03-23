package composite;

import java.util.ArrayList;
import java.util.List;

public class Tietokone implements Laiteosa {

	double price = 0;
	double sum;
	
	List<Laiteosa> osaLista = new ArrayList<Laiteosa>();
	
	@Override
	public double getPrice() {
		sum = 0;
		for (Laiteosa l : osaLista) {
			sum += l.getPrice();
		}
		return price + sum;
	}

	@Override
	public void lisaaOsa(Laiteosa laiteosa) {
		osaLista.add(laiteosa);
	}

}
