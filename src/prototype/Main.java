package prototype;

public class Main {

	public static void main(String[] args) {
		SecondHand secondHand = new SecondHand();
		MinuteHand minuteHand = new MinuteHand();
		HourHand hourHand = new HourHand();
		Clock clock = new Clock(secondHand, minuteHand, hourHand);
		new Thread(clock).start();
		
		Clock copyClock = clock.clone();
		new Thread(copyClock).start();
		
		clock.setHour(23);
	}

}
