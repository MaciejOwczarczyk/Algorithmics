package pl.coderslab.pluralSight.function.function;

public class EverydayDemo {
    public static void main(String[] args) {
        Meteo meteo = new Meteo(10);

        Function<Meteo, Integer> readCelsius = m -> m.getTemperature();
        Function<Integer, Double> celsiusToFahrenheit = t -> t * 9d / 5d + 32d;

        //chaining functions
         Function<Meteo, Double> readFahrenheit = readCelsius.andThen(celsiusToFahrenheit);

        System.out.println(readFahrenheit.apply(meteo));

        //composing functions
        readFahrenheit =  celsiusToFahrenheit.compose(readCelsius);

        System.out.println(readFahrenheit.apply(meteo));
    }
}
