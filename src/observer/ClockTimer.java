package observer;

import java.time.LocalDateTime;
import java.util.Observable;

public class ClockTimer extends Observable implements Runnable{
	
	private int hour;
	private int minute;
	private int second;
	
	public ClockTimer() {
		int hourNow = LocalDateTime.now().getHour();
		int minutesNow = LocalDateTime.now().getMinute();
		int secondsNow = LocalDateTime.now().getSecond();
		
		this.hour = hourNow;
		this.minute = minutesNow;
		this.second = secondsNow;
	}

	public int getHour() {
		return this.hour;
	}
	
	public int getMinute() {
		return this.minute;
	}
	
	public int getSecond() {
		return this.second;
	}
	
	void tick() {
		this.second++;
		if(this.second == 60) {
			this.second = 0;
			this.minute++;
			if(this.minute == 60) {
				this.minute = 0;
				this.hour++;
				if(this.hour == 24) {
					this.hour = 0;
				}
			}
		}
		setChanged();
		notifyObservers();
	}

	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			tick();
		}
	}
	

}
