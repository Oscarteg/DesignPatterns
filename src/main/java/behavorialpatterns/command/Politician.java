package behavorialpatterns.command;

/**
 * Created by Oscar on 14/07/2017.
 */
public class Politician implements Command {
    @Override
    public void execute() {
        System.out.println("take money from the rich, take votes from the poor");
    }
}
