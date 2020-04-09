package chainofresponsibility;

import java.io.*;

public class Main {

	public static void main(String[] args) {
		ForemanPower foreman = new ForemanPower();
		DepartmentManagerPower manager = new DepartmentManagerPower();
		ExecutivePower ceo = new ExecutivePower();
		foreman.setSuccessor(manager);
		manager.setSuccessor(ceo);
		
		try {
			while(true) {
				System.out.println("Anna palkankorotuksesi prosentteina: ");
				double d = Double.parseDouble(new BufferedReader(new InputStreamReader(System.in)).readLine());
				foreman.processRequest(new RaiseRequest(d));
			}
		} catch (Exception e) {
			System.exit(1);
		}
	}

}
