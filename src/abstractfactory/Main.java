package abstractfactory;

public class Main {

	public static void main(String[] args) {
		Tehdas adidas = new TehdasAdidas();
		Tehdas boss = new TehdasBoss();
		Jasper jasper = new Jasper();
		System.out.println("Opiskelijana Jasperilla: ");
		jasper.pue(adidas);
		System.out.println("\nValmistuneena Jasperilla: ");
		jasper.pue(boss);
	}

}
