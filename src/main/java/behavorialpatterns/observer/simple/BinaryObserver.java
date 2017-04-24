package behavorialpatterns.observer.simple;

/**
 * Created by Oscar on 28/08/2016.
 */
public class BinaryObserver extends Observer {
	public BinaryObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println("Binary String:" + Integer.toBinaryString(subject.getState()));
	}
}

