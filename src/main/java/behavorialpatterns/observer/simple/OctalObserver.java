package behavorialpatterns.observer.simple;

/**
 * Created by Oscar on 28/08/2016.
 */
public class OctalObserver extends Observer {
	public OctalObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println("Octal string: " + Integer.toOctalString(subject.getState()));
	}
}
