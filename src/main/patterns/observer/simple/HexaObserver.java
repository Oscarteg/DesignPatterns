package main.patterns.observer.simple;

/**
 * Created by Oscar on 28/08/2016.
 */
public class HexaObserver extends Observer{
    public HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hexa String: " + Integer.toHexString(subject.getState()));
    }
}
