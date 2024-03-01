package command_pattern;

public class TurnOnCommand implements Command{
	
	private Light light;
	
	public TurnOnCommand(Light light) {
		this.light = light;
	}
	public void execute() {
		light.turnOnLight();
	}
	
}
