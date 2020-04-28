package command;

import java.util.ArrayList;
import java.util.List;

public class MacroCommand implements Command {

	List<Command> commandList = new ArrayList<Command>();

	@Override
	public void execute() {
		for (Command c: commandList) {
			c.execute();
		}
	}

	@Override
	public void addCommand(Command command) {
		commandList.add(command);
	}


}
