package command_pattern;

public class RemoteController {
	
	Command newCommand;
	
	public void setCommand(Command newCommand) {
		this.newCommand = newCommand;
	}
	public void  pressButton() {
		newCommand.execute();
	}
}
