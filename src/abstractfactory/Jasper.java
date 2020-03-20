package abstractfactory;

public class Jasper {
	
	public void pue(Tehdas tehdas) {
		Vaate farkut = tehdas.makeFarkut();
		farkut.pue();
		Vaate tpaita = tehdas.makeTpaita();
		tpaita.pue();
		Vaate lippis = tehdas.makeLippis();
		lippis.pue();
		Vaate kenka = tehdas.makeKengat();
		kenka.pue();
	}
}
