package visitor;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Pokemon pokemon = new Pokemon();
		System.out.println("Pokemon pakenee, hyökkää tai taistelee. Se kehittyy, kun se saa 500 pistettä tai 1000 pistettä.");
		System.out.println("Samoin se taantuu jos pisteet menevät alle 500 tai 1000.");
		Thread.sleep(5000);
		System.out.println("Pokemon valmiina.");
		Thread.sleep(1000);
		System.out.println("--3--");
		Thread.sleep(500);
		System.out.println("--2--");
		Thread.sleep(500);
		System.out.println("--1--");
		Thread.sleep(500);
		boolean running = true;
		System.out.println("Pokemon liikkeellä!");
		Thread.sleep(1000);

		while (running) {
			int randomizer = (int) (Math.random()*3 + 1);			
			switch (randomizer) {
				case 1:
					pokemon.withdraw();
					break;
				case 2:
					pokemon.charge();
					break;
				case 3:
					pokemon.battle();
					break;
			}
			Thread.sleep(500);
			System.out.println("\tPisteet: " + pokemon.getPoints());
			if (pokemon.getPoints() >= 2000) {
				running = false;
			}
		}
		System.out.println("Peli ohi! Pisteesi " + pokemon.getPoints());
	}

}
