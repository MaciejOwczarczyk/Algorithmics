package pl.coderslab.pluralSight.behavioral.mediator;

public class MediatorDemo {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();

        Light bedroomLight = new Light("Bedroom");
        Light kitchenLight = new Light("Kitchen");

        mediator.registerLight(bedroomLight);
        mediator.registerLight(kitchenLight);

        Command turnOnAllLightsCommand = new TurnOnAllLightsCommand(mediator);
        Command turnOffAllLightCommand = new TurnOffLightsCommand(mediator);

        turnOnAllLightsCommand.execute();
        turnOffAllLightCommand.execute();
    }
}
