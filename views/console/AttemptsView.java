package mastermind_v3.views.console;

import mastermind_v3.controllers.InGameController;
import mastermind_v3.views.MessageView;
import mastermind_v3.utils.WithConsoleView;

public class AttemptsView extends WithConsoleView {

    private InGameController inGameController;

    AttemptsView(InGameController inGameController) {
        this.inGameController = inGameController;
    }

    void writeln() {
        this.console.writeln(MessageView.ATTEMPTS.getMessage().replaceFirst("#attempts",
                "" + this.inGameController.getAttempts()));
    }

}
