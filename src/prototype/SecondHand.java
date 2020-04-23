package prototype;

public class SecondHand implements Hand, Cloneable {
	private int second;
	private Hand minuteHand;
	
	public SecondHand() {
		second = 0;
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
		this.second++;
		if (this.second == 60) {
			this.second = 0;
			this.minuteHand.tick();
		}
	}
	
	@Override
	public int getTime () {
		return this.second;
	}
	
	@Override
	public void setTime (int second) {
		this.second = second;
	}
	
	@Override
	public void setNextHand(Hand nextHand) {
		this.minuteHand = nextHand;
	}
}
