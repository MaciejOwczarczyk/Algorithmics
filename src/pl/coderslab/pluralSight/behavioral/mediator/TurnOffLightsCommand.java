package pl.coderslab.pluralSight.behavioral.mediator;

public class TurnOffLightsCommand implements Command {

    private Mediator med;

    public TurnOffLightsCommand(Mediator med) {
        this.med = med;
    }

    @Override
    public void execute() {
        med.turnOffAllLights();
    }
}
