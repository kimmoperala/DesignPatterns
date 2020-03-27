package singleton;

public class Main {

	public static void main(String[] args) {			
		Queuer eka = new Queuer("Jorma");
		Queuer toka = new Queuer("Matti");
		Queuer kolmas = new Queuer("Kalle");
		Queuer neljas = new Queuer("Liisa");
		Queuer viides = new Queuer("Malla");
		
		Thread saie = new Thread(eka);
		Thread saie2 = new Thread(toka);
		Thread saie3 = new Thread(kolmas);
		Thread saie4 = new Thread(neljas);
		Thread saie5 = new Thread(viides);

		saie.start();
		saie2.start();
		saie3.start();
		saie4.start();
		saie5.start();
	}

}
