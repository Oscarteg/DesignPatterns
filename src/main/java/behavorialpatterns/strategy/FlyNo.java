package behavorialpatterns.strategy;

/**
 * Created by Oscar on 15/09/15.
 */
public class FlyNo implements FlyBehavior {
	@Override
	public void fly() {
		System.out.println("I have no wings, so I can't fly.");
	}
}
