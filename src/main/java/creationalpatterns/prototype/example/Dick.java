package creationalpatterns.prototype.example;

/**
 * Created by Oscar on 26/06/2017.
 */
public class Dick implements Person {

    private final String name = "Dick";

    @Override
    public Person clone() {
        return new Dick();
    }

    @Override
    public String toString() {
        return "Dick{" +
                "name='" + name + '\'' +
                '}';
    }
}
