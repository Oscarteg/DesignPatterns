package creationalpatterns.builder;

/**
 * Created by Oscar on 27/04/2017.
 */
abstract class PizzaBuilder {

	protected Pizza pizza;

	public Pizza getPizza() {
		return pizza;
	}

	public void createNewPizzaProduct() {
		pizza = new Pizza();
	}

	public abstract void buildDough();

	public abstract void buildSauce();

	public abstract void buildTopping();
}
