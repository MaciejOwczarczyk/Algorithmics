package pl.coderslab.pluralSight.structural.bridge.bridgeMovieDemo;

import java.util.List;

public abstract class Printer {

    public String print(Formatter formatter) {
        return formatter.format(getHeader(), getDetails());
    }

    abstract protected List<Detail> getDetails();
    abstract protected String getHeader();
}
