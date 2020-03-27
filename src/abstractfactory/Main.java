package abstractfactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Main {

	public static void main(String[] args) {
		Tehdas tehdas = null;
		Class c = null;
		Jasper jasper = new Jasper();
		
		Properties properties = new Properties();
		
		try {
			properties.load(new FileInputStream("resources/tehdas.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			c = Class.forName(properties.getProperty("tehdas1"));
			tehdas = (Tehdas) c.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Opiskelijana Jasperilla: ");
		jasper.setTehdas(tehdas);
		jasper.pue();
		System.out.println();
		jasper.kerro();
		
		try {
			c = Class.forName(properties.getProperty("tehdas2"));
			tehdas = (Tehdas) c.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("\n\nValmistuneena Jasperilla: ");
		jasper.setTehdas(tehdas);
		jasper.pue();
		System.out.println();
		jasper.kerro();
	}

}
