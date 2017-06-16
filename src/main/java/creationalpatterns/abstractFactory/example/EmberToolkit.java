package creationalpatterns.abstractFactory.example;

/**
 * Created by Oscar on 23/04/2017.
 */
public class EmberToolkit extends AbstractFactory {
	@Override
	public CPU createCPU() {
		return new EmberCPU();
	}

	@Override
	public MMU createMMU() {
		return new EmberMMU();
	}
}
