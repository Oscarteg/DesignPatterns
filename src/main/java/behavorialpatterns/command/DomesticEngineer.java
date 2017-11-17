package behavorialpatterns.command;

/**
 * Created by Oscar on 14/07/2017.
 */
public class DomesticEngineer implements Command {

    @Override
    public void execute() {
        System.out.println("take out the trash");
    }

}
