package creationalpatterns.abstractFactory;

/**
 * Created by Oscar on 23/04/2017.
 */
public class Client {
	public static void main(String[] args) {
		AbstractFactory factory = AbstractFactory.getFactory(AbstractFactory.Architecture.EMBER);
		CPU cpu = factory.createCPU();
	}
}
