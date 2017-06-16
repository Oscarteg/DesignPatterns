package creationalpatterns.singleton.example;

/**
 * Created by oscar on 16/06/2017.
 */
public final class Singleton {
    private static volatile Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public void print () {
        System.out.println("AALLALALAL");
    }

    public static void main(String[] args) {
        Singleton.getInstance().print();
    }
}

