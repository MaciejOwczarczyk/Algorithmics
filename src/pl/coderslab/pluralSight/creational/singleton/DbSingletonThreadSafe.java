package pl.coderslab.pluralSight.creational.singleton;

public class DbSingletonThreadSafe {

    private static volatile DbSingletonThreadSafe instance = null;

    private DbSingletonThreadSafe() {
        if (instance != null) {
            throw new RuntimeException("Use getInstance() method to create");
        }
    };

    public static DbSingletonThreadSafe getInstance() {
        if (instance == null) {
            synchronized (DbSingletonThreadSafe.class) {
                if (instance == null) {
                    instance = new DbSingletonThreadSafe();
                }
            }
        }
        return instance;
    }
}
