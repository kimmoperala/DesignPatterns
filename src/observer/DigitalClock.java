package observer;

import java.util.Observable;
import java.util.Observer;

public class DigitalClock implements Observer {

	private ClockTimer timer;
	
	public DigitalClock(ClockTimer timer) {
		this.timer = timer;
	}
	
	@Override
	public void update(Observable o, Object arg) {
		draw();
	}
	
	private void draw() {
		int hour = timer.getHour();
		String hourString = Integer.toString(hour);
		int minute = timer.getMinute();
		String minuteString = Integer.toString(minute);
		int second = timer.getSecond();
		String secondString = Integer.toString(second);
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
