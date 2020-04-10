package memento;

public class Arvuuttaja {

	public synchronized Object liityPeliin(Asiakas asiakas) {
		int number = (int) (Math.random()*10 + 1);
		System.out.println("Asiakas " + asiakas.getPlayerNumber() + ", arvattava numero " + number);
		return new Memento(number);
	}
	
	public synchronized boolean onkoOikein(Object obj, int arvaus) {
		Memento memento = (Memento) obj;
		int oikeaNumero = memento.numero;
		if (arvaus == oikeaNumero) {
			System.out.println("NUMERO " + arvaus + " ON OIKEIN!");
			return true;
		}
		return false;
	}
	
	private class Memento {
		private int numero;
		
		public Memento(int numero) {
			this.numero = numero;
		}
	}
}
