package decorator;

public class Main {

	public static void main(String[] args) {
		PizzaAines[] options = {
				new Tonnikala (new Ananas(new Pohja())), new Kinkku (new Ananas(new Pohja())), new Kinkku (new Salami(new Tonnikala(new Pohja())))
		};
		for (int i = 0; i < options.length; i++) {
			switch(i) {
				case 0:
					System.out.print("Tonnikalapizza: ");
					break;
				case 1:
					System.out.print("Kinkkupizza: ");
					break;
				case 2:
					System.out.print("Lihapizza: ");
					break;
			}
			System.out.println(options[i] + ", hinta " + options[i].getPrice() + " euroa");
		}
	}

}
