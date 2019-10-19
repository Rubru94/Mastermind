package mastermind_v4.views;

import mastermind_v4.types.Error;
import mastermind_v4.utils.WithConsoleView;

public class ErrorView extends WithConsoleView{

    public static final String[] MESSAGES = {
        "Repeated colors",
        "Wrong colors, they must be: " + ColorView.allInitials(),
        "Wrong proposed combination length"};

    protected Error error;

    public ErrorView(Error error) {
        this.error = error;
    }

    public void writeln() {
        this.console.writeln(ErrorView.MESSAGES[this.error.ordinal()]);
    }

}
