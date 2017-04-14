package main.patterns.observer.simple;

/**
 * Created by Oscar on 28/08/2016.
 */
public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new BinaryObserver(subject);
        new OctalObserver(subject);

        System.out.println("First state is 15");
        subject.setState(15);
        System.out.println("Second state is 30");
        subject.setState(30);

    }

}
