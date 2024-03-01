package command_pattern;

public class TurnOffCommand implements Command{
	
private Light light;
	
	public TurnOffCommand(Light light) {
		this.light = light;
	}
	
	public void execute() {
		light.turnOffLight();
	}
}
