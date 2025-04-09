package singleton;

public class BillPugh {
    private BillPugh() {}

    private static class billPughHelper {
        private static final BillPugh INSTANCE = new BillPugh();
    }
//    JVM loads classes in a thread-safe manner, meaning that
//    only one thread can initialize the static variable inside
//    SingletonHelper.

    public static BillPugh getInstance() {
        return billPughHelper.INSTANCE;
    }

}
