package prototype;

public class Clock implements Runnable, Cloneable {
	private Hand secondHand;
	private Hand minuteHand;
	private Hand hourHand;
	
	public Clock(Hand s, Hand m, Hand h) {
		secondHand = new SecondHand();
		secondHand = s;
		minuteHand = new MinuteHand();
		minuteHand = m;
		hourHand = new HourHand();
		hourHand = h;
		secondHand.setNextHand(minuteHand);
		minuteHand.setNextHand(hourHand);		
	}
	
	public Clock clone() {
		Clock clock = null;
		try {
			clock = (Clock) super.clone();
			clock.secondHand = (SecondHand) secondHand.clone();
			clock.minuteHand = (MinuteHand) minuteHand.clone();
			clock.hourHand = (HourHand) hourHand.clone();
			clock.secondHand.setNextHand(clock.minuteHand);
			clock.minuteHand.setNextHand(clock.hourHand);
		} catch (CloneNotSupportedException e) {
		}
		return clock;
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			secondHand.tick();
			showTime();
		}
	}
	
	public void setSecond(int second) {
		secondHand.setTime(second);
	}
	public void setminute(int minute) {
		minuteHand.setTime(minute);
	}
	public void setHour(int hour) {
		hourHand.setTime(hour);
	}
	
	public void showTime() {
		int second = secondHand.getTime();
		String secondString = Integer.toString(second);
		int minute = minuteHand.getTime();
		String minuteString = Integer.toString(minute);
		int hour = hourHand.getTime();
		String hourString = Integer.toString(hour);
		
		if (second < 10) {
			secondString = "0" + secondString;
		}
		if (minute < 10) {
			minuteString = "0" + minuteString;
		}
		if (hour < 10) {
			hourString = "0" + hourString;
		}
		System.out.println(hourString + ":" + minuteString + ":" + secondString);
	}
}
