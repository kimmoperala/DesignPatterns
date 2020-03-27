package singleton;

public class Queuer implements Runnable {

	private NumberMachine machine;
	private String name;
	private int number;
	
	public Queuer(String name) {
		this.name = name;
		this.machine = NumberMachine.getInstance();
	}
	
	@Override
	public void run() {
		this.number = machine.createNumber();
		System.out.println("Olen " + this.name + ", jonossa numerolla " + this.number);
	}

}
