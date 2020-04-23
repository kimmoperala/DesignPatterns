package prototype;

public class Clock implements Runnable, Cloneable {
	private SecondHand secondHand;
	private MinuteHand minuteHand;
	private HourHand hourHand;
	
	public Clock(SecondHand s, MinuteHand m, HourHand h) {
		secondHand = s;
		minuteHand = m;
		hourHand = h;
		secondHand.setMinuteHand(minuteHand);
		minuteHand.setHourHand(hourHand);		
	}
	
	public Clock clone() {
		Clock clock = null;
		try {
			clock = (Clock) super.clone();
			clock.secondHand = (SecondHand) secondHand.clone();
			clock.minuteHand = (MinuteHand) minuteHand.clone();
			clock.hourHand = (HourHand) hourHand.clone();
			clock.secondHand.setMinuteHand(clock.minuteHand);
			clock.minuteHand.setHourHand(clock.hourHand);
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
		secondHand.setSecond(second);
	}
	public void setminute(int minute) {
		minuteHand.setMinute(minute);
	}
	public void setHour(int hour) {
		hourHand.setHour(hour);
	}
	
	public void showTime() {
		int second = secondHand.getSecond();
		String secondString = Integer.toString(second);
		int minute = minuteHand.getMinute();
		String minuteString = Integer.toString(minute);
		int hour = hourHand.getHour();
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
