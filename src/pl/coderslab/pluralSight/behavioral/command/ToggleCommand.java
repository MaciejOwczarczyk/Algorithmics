package pl.coderslab.pluralSight.behavioral.command;

public class ToggleCommand implements Command {

    private Light light;

    public ToggleCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
//        light.on(); first version
        light.toggle();
    }
}
