package creationalpatterns.builder.example;

/**
 * Created by oscar on 16/06/2017.
 */
public class SpicyPizzaBuilder extends PizzaBuilder{

    @Override
    public void buildDough() {
        pizza.setDough("pan baked");
    }

    @Override
    public void buildSauce() {
        pizza.setSauce("hot");
    }

    @Override
    public void buildTopping() {
        pizza.setTopping("pepperoni");
    }
}
