package abstractfactory;

public class Jasper {
	
	private Vaate farkut;
	private Vaate tpaita;
	private Vaate lippis;
	private Vaate kengat;
	
	public void setTehdas(Tehdas tehdas) {
		farkut = tehdas.makeFarkut();
		tpaita = tehdas.makeTpaita();
		lippis = tehdas.makeLippis();
		kengat = tehdas.makeKengat();
	}
	public void pue() {
		farkut.laitaPaalle();
		tpaita.laitaPaalle();
		lippis.laitaPaalle();;
		kengat.laitaPaalle();
	}
	public void kerro() {
		farkut.kerro();
		tpaita.kerro();
		lippis.kerro();
		kengat.kerro();
	}
}
