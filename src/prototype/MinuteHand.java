package prototype;

public class MinuteHand implements Hand, Cloneable {
	private int minute;
	private Hand hourHand;

	public MinuteHand() {
		minute = 0;
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
		this.minute++;
		if (this.minute == 60) {
			this.minute = 0;
			this.hourHand.tick();
		}
	}
	
	public int getMinute () {
		return this.minute;
	}
	
	public void setMinute (int minute) {
		this.minute = minute;
	}
	
	public void setHourHand(Hand hourHand) {
		this.hourHand = hourHand;
	}
}
