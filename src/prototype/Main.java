package prototype;

public class Main {

	public static void main(String[] args) {
		Hand secondHand = new SecondHand();
		Hand minuteHand = new MinuteHand();
		Hand hourHand = new HourHand();
		Clock clock = new Clock(secondHand, minuteHand, hourHand);
		new Thread(clock).start();
		
		Clock copyClock = clock.clone();
		new Thread(copyClock).start();
		
		clock.setHour(23);
	}

}
