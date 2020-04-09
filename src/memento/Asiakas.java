package memento;

public class Asiakas implements Runnable {
	private Object obj;
	private int arvaus;
	private Arvuuttaja arvuuttaja;
	private int playerNumber;
	private boolean oikein;
	
	public Asiakas(int playerNumber, Arvuuttaja arvuuttaja) {
		this.oikein = false;
		this.arvuuttaja = arvuuttaja;
		arvaus=1;
		this.playerNumber = playerNumber;
	}
	public int getPlayerNumber() {
		return this.playerNumber;
	}
	
	public void liityPeliin() {
		obj = arvuuttaja.liityPeliin(this);
		System.out.println(playerNumber + " liittyi peliin!");
	}
	
	public void arvaa() {
		System.out.println(playerNumber + " arvasi numeron " + arvaus);
		if (arvuuttaja.onkoOikein(obj, arvaus)) {
			this.oikein = true;
			System.out.println("Asiakas " + playerNumber + " arvasi oikein");
		}
		arvaus++;
	}
	@Override
	public void run() {
		liityPeliin();
		while (!oikein) {
			arvaa();
		}
	}
}
