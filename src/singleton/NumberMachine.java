package singleton;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberMachine {	
	private static NumberMachine INSTANCE = null;
	private int qNumber;
	private List<String> numbers = new ArrayList<>(Arrays.asList("1","2","3","4","5","6","7","8","9","10"));

	private NumberMachine() {	
	}
	
	public static synchronized NumberMachine getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new NumberMachine();
		}
		return INSTANCE;
	}
	
	public synchronized int createNumber() {
		int number = Integer.parseInt(numbers.get(0));
		this.qNumber = number;
		this.numbers.remove(Integer.toString(number));
		return number;
	}
}
