package pl.coderslab.pluralSight.structural.bridge.bridgeMovieDemo;

public class BridgeDemo {
    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setClassification("Action");
        movie.setTitle("John Wick");
        movie.setRuntime("2:15");
        movie.setYear("2014");

        Formatter formatter = new PrintFormatter();
        Printer moviePrinter = new MoviePrinter(movie);

        String printedMaterial = moviePrinter.print(formatter);

        System.out.println(printedMaterial);

        Formatter htmlFormatter = new HtmlFormatter();

        String htmlMaterial = moviePrinter.print(htmlFormatter);

        System.out.println(htmlMaterial);

    }
}
