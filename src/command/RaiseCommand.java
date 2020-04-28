package command;


public class RaiseCommand implements Command {
	SilverScreen screen = new SilverScreen();
	
	
	public RaiseCommand(SilverScreen screen) {
		this.screen = screen;
	}
	
	@Override
	public void execute() {
		this.screen.raise();
	}

	@Override
	public void addCommand(Command command) {
		throw new RuntimeException("Can't add a command");
	}
	
}
