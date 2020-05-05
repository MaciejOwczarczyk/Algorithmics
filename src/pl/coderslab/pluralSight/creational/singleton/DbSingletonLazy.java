package pl.coderslab.pluralSight.creational.singleton;

public class DbSingletonLazy {

    private static DbSingletonLazy instance = null;

    private DbSingletonLazy() {};

    public static DbSingletonLazy getInstance() {
        if (instance == null) {
            instance = new DbSingletonLazy();
        }

        return instance;
    }
}
