package pl.coderslab.pluralSight.creational.singleton;

public class DbSingletonEager {

    private static DbSingletonEager instance = new DbSingletonEager();

    private DbSingletonEager() {}

    public static DbSingletonEager getInstance() {
        return instance;
    }
}
