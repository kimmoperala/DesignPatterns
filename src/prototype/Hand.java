package prototype;

public interface Hand {
	public void tick();
	public void setNextHand(Hand nextHand);
	public void setTime(int time);
	public int getTime();
	public Object clone();
}
