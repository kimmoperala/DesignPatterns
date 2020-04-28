package command;

public class Main {

	public static void main(String[] args) {
		SilverScreen screen = new SilverScreen();
		
		Command upperSwitch = new RaiseCommand(screen);
		Command lowerSwitch = new LowerCommand(screen);
		
		WallButton button1 = new WallButton(upperSwitch);
		WallButton button2 = new WallButton(lowerSwitch);
		
		button1.push();
		button2.push();
	}

}
