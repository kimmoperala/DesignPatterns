package command;

public class LowerCommand implements Command {
	SilverScreen screen = new SilverScreen();

	public LowerCommand(SilverScreen screen) {
		this.screen = screen;
	}
	
	@Override
	public void execute() {
		screen.lower();
	}

}
