package abstractfactory;

public class Main {

	public static void main(String[] args) {
		Tehdas adidas = new TehdasAdidas();
		Tehdas boss = new TehdasBoss();
		Jasper jasper = new Jasper();
		
		System.out.println("Opiskelijana Jasperilla: ");
		jasper.setTehdas(adidas);
		jasper.pue();
		System.out.println();
		jasper.kerro();
		
		System.out.println("\n\nValmistuneena Jasperilla: ");
		jasper.setTehdas(boss);
		jasper.pue();
		System.out.println();
		jasper.kerro();
	}

}
