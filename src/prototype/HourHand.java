package prototype;

public class HourHand implements Hand, Cloneable {
	private int hour;
	
	public HourHand() {
		hour = 0;
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
		hour++;
		if (hour == 24) {
			hour = 0;
		}
	}
	
	@Override
	public int getTime() {
		return this.hour;
	}
	
	@Override
	public void setTime (int hour) {
		this.hour = hour;
	}
	
	@Override
	public void setNextHand(Hand nextHand) {
		System.out.println("Can't set next hand for hourHand");
	}
}
