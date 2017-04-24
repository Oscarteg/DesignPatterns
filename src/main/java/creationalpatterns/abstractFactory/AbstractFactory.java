package main.creationalpatterns.abstractFactory;

/**
 * Created by Oscar on 23/04/2017.
 */


public abstract class AbstractFactory {

	private static final EmberToolkit EMBER_TOOLKIT = new EmberToolkit();
	private static final EnginolaToolkit ENGINOLA_TOOLKIT = new EnginolaToolkit();

	public static AbstractFactory getFactory(Architecture architecture) {
		AbstractFactory factory = null;
		switch (architecture) {
			case ENGINOLA:
				factory = ENGINOLA_TOOLKIT;
			case EMBER:
				factory = EMBER_TOOLKIT;
		}
		return factory;
	}

	public abstract CPU createCPU();

	public abstract MMU createMMU();

	enum Architecture {
		ENGINOLA, EMBER
	}
}
