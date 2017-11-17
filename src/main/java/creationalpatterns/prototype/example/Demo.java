package creationalpatterns.prototype.example;

/**
 * Created by Oscar on 26/06/2017.
 */
public class Demo {
    public static void main(String[] args) {
        Person prototype = Factory.getPrototype("tom");

        if (prototype != null) {
            System.out.println(prototype);
        }

    }
}
