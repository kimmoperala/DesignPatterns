package abstractfactory;

public class Jasper {	
	public Jasper() {
	}
	
	public void pue(Tehdas tehdas) {
		System.out.println("Jasperilla on päällään: ");
		Vaate farkut = tehdas.makeFarkut();
		farkut.pue();
		Vaate tpaita = tehdas.makeTpaita();
		tpaita.pue();
		Vaate lippis = tehdas.makeLippis();
		lippis.pue();
		Vaate kenka = tehdas.makeKengat();
		kenka.pue();
		System.out.println(farkut + ", " + tpaita + ", " + lippis + " ja "+ kenka + ".");
	}
}
