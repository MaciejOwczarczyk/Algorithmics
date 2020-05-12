package pl.coderslab.pluralSight.function.builder;

import pl.coderslab.pluralSight.function.factory.Factory;

public interface Builder<T> {

    void register(String label, Factory<T> factory);
}
