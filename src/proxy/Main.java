package proxy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		List<Image> valokuvakansio = new ArrayList<Image>();
		Image newImage = new ProxyImage("kuva koirasta");
		Image newImage2 = new ProxyImage("kuva kauniista maisemasta");
		Image newImage3 = new ProxyImage("kuva synttäreiltä");
		Image newImage4 = new ProxyImage("kuva lomamatkan bileistä");

		valokuvakansio.add(newImage);
		valokuvakansio.add(newImage2);
		valokuvakansio.add(newImage3);
		valokuvakansio.add(newImage4);
		
		System.out.println("Kansiossa seuraavat kuvat:");
		for (Image kuva: valokuvakansio) {
			kuva.showData();
		}
		int valinta;
		boolean running = true;
		
		while(running)  {
			System.out.println("Minkä kuvan haluaisit nähdä? Poistu valitsemalla kirjain. Kuvia on " + valokuvakansio.size() + " kpl");
			try {
				valinta = scanner.nextInt();
				valokuvakansio.get(valinta - 1).displayImage();
			} catch (IndexOutOfBoundsException e) {
				System.out.println("Valitsemasi numero on väärä");
			} catch (Exception e) {
				scanner.close();
				running = false;
				System.out.println("Poistuttu");
			}
		}
	}

}
