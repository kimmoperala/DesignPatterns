package prototype;

public class SecondHand implements Hand, Cloneable {
	private int second;
	private Hand minuteHand;
	
	public SecondHand() {
		second = 0;
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
		this.second++;
		if (this.second == 60) {
			this.second = 0;
			this.minuteHand.tick();
		}
	}
	
	public int getSecond () {
		return this.second;
	}
	
	public void setSecond (int second) {
		this.second = second;
	}
	
	public void setMinuteHand(Hand minuteHand) {
		this.minuteHand = minuteHand;
	}
}
