package composite;

import java.util.ArrayList;
import java.util.List;

public class Kotelo implements Laiteosa {
	
	double price = 50;
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
