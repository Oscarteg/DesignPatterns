package creationalpatterns.builder.example;

/**
 * Created by oscar on 16/06/2017.
 */
public class Demo {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        PizzaBuilder hawaiianPizzaBuilder = new HawaiianPizzaBuilder();
        PizzaBuilder spicyPizzaBuilder = new SpicyPizzaBuilder();

        waiter.setPizzaBuilder(hawaiianPizzaBuilder);
        waiter.constructPizza();

        System.out.printf(waiter.getPizza().toString());
    }
}

