package creationalpatterns.abstractFactory.example;

/**
 * Created by Oscar on 23/04/2017.
 */
public class EnginolaToolkit extends AbstractFactory {
	@Override
	public CPU createCPU() {
		return new EnginolaCPU();
	}

	@Override
	public MMU createMMU() {
		return new EnginolaMMU();
	}
}
