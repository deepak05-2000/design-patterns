package creational.patterns.singleton;

class Singleton {

    private static volatile Singleton instance;  // `volatile` ensures visibility across threads

    private Singleton() { }

    public static Singleton getInstance() {
        if (instance == null) {  // First check
            synchronized (Singleton.class) {
                if (instance == null) {  // Second check inside synchronized block
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
