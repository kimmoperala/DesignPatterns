package prototype;

public class MinuteHand implements Hand, Cloneable {
	private int minute;
	private Hand hourHand;

	public MinuteHand() {
		minute = 0;
	}
	
	@Override
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
	
	@Override
	public int getTime () {
		return this.minute;
	}
	
	@Override
	public void setTime (int minute) {
		this.minute = minute;
	}
	
	@Override
	public void setNextHand(Hand nextHand) {
		this.hourHand = nextHand;
	}
}
