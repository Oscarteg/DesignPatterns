package creationalpatterns.prototype.example;

/**
 * Created by Oscar on 26/06/2017.
 */
public class Tom implements Person {

    private final String name = "Tom";

    @Override
    public Person clone() {
        return new Tom();
    }

    @Override
    public String toString() {
        return "Tom{" +
                "name='" + name + '\'' +
                '}';
    }
}
