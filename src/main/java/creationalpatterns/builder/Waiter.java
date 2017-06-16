package creationalpatterns.builder;

/**
 * Created by Oscar on 27/04/2017.
 */
public class Waiter {

	private PizzaBuilder pizzaBuilder;

	public Pizza getPizza() {
        return pizzaBuilder.getPizza();
	}

	public void setPizzaBuilder(PizzaBuilder pizzaBuilder) {
		this.pizzaBuilder = pizzaBuilder;
	}

	public void constructPizza() {
		pizzaBuilder.createNewPizzaProduct();
		pizzaBuilder.buildDough();
		pizzaBuilder.buildSauce();
		pizzaBuilder.buildTopping();
	}
}
