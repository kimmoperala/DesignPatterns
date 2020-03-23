package composite;

public class Main {

	public static void main(String[] args) {
		Emolevy emo = new Emolevy();
		Muistipiiri muisti = new Muistipiiri();
		Prosessori prosessori = new Prosessori();
		Verkkokortti verkko = new Verkkokortti();
		Kotelo kotelo = new Kotelo();
		Kiintolevy levy = new Kiintolevy();
		Hiiri hiiri = new Hiiri();
		Naytto naytto = new Naytto();
		Tietokone tietokone = new Tietokone();

		emo.lisaaOsa(muisti);
		emo.lisaaOsa(prosessori);
		emo.lisaaOsa(verkko);
		kotelo.lisaaOsa(emo);
		kotelo.lisaaOsa(levy);
		tietokone.lisaaOsa(kotelo);
		tietokone.lisaaOsa(hiiri);
		tietokone.lisaaOsa(naytto);
		System.out.println(tietokone.getPrice());
	}

}
