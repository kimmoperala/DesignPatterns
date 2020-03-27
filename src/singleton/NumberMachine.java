package singleton;

public class NumberMachine {
	
	private NumberMachine() {}
	
	private static NumberMachine INSTANCE = null;
	private int qNumber = 0;
	
	public static synchronized NumberMachine getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new NumberMachine();
		}
		return INSTANCE;
	}
	
	public int createNumber() {
		int number = qNumber + 1;
		qNumber = number;
		return number;
	}
}
