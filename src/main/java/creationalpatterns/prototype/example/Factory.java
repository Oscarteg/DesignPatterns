package creationalpatterns.prototype.example;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Oscar on 26/06/2017.
 */
public class Factory {
    private static final Map<String, Person> prototypes = new HashMap<>();

    static {
        prototypes.put("tom", new Tom());
        prototypes.put("dick", new Dick());
    }

    public static Person getPrototype (String type) {
        try {
            return prototypes.get(type).clone();
        } catch (NullPointerException e) {
            System.out.println("Prototype with name: " + type + ", doesn't exist");
            return null;
        }
    }


}
