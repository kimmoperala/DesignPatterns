package command;

public class Main {

	public static void main(String[] args) {
		SilverScreen screen = new SilverScreen();
		
		Command upperSwitch = new RaiseCommand(screen);
		Command lowerSwitch = new LowerCommand(screen);
		Command macroCommand = new MacroCommand();
		macroCommand.addCommand(upperSwitch);
		macroCommand.addCommand(lowerSwitch);
		
		WallButton button1 = new WallButton(macroCommand);
		WallButton button2 = new WallButton(upperSwitch);
		WallButton button3 = new WallButton(lowerSwitch);
		
		System.out.println("MacroCommand:");
		button1.push();
		System.out.println("UpperSwitch:");
		button2.push();
		System.out.println("LowerSwitch:");
		button3.push();
	}

}
