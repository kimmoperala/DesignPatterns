package observer;

public class Main {

	public static void main(String[] args) {
		ClockTimer timer = new ClockTimer();
		DigitalClock clock = new DigitalClock(timer);
		
		timer.addObserver(clock);
		
		new Thread(timer).start();
	}

}
