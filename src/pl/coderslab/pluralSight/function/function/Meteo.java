package pl.coderslab.pluralSight.function.function;

public class Meteo {

    private int temperature;

    public Meteo(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "Meteo{" +
                "temperature=" + temperature +
                '}';
    }
}
