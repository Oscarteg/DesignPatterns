package behavorialpatterns.observer.simple;

/**
 * Created by Oscar on 28/08/2016.
 */
public abstract class Observer {
	protected Subject subject;

	public abstract void update();
}
