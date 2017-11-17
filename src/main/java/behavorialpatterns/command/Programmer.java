package behavorialpatterns.command;

/**
 * Created by Oscar on 14/07/2017.
 */
public class Programmer implements Command {
    @Override
    public void execute() {
        System.out.println("sell the bugs, charge for the fixes");
    }
}
