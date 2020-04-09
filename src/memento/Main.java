package memento;

public class Main {

	public static void main(String[] args) {
		Arvuuttaja veijo = new Arvuuttaja();
		
		for (int i= 0; i < 5; i++) {
			Asiakas asiakas = new Asiakas(i+1, veijo);
			Thread thread = new Thread(asiakas);
			thread.start();
		}

	}

}
