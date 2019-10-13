package mastermind_v3.views.console;

import mastermind_v3.types.Error;
import mastermind_v3.utils.Console;

class ErrorView extends mastermind_v3.views.ErrorView {

    ErrorView(Error error) {
        super(error);
    }

    void writeln() {
        new Console().writeln(ErrorView.MESSAGES[this.error.ordinal()]);
    }

}
