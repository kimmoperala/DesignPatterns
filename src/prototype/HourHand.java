package prototype;

public class HourHand implements Hand, Cloneable {
	private int hour;
	
	public HourHand() {
		hour = 0;
	}
	
	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void tick() {
		hour++;
		if (hour == 24) {
			hour = 0;
		}
	}
	
	public int getHour() {
		return this.hour;
	}
	
	public void setHour (int hour) {
		this.hour = hour;
	}
}
