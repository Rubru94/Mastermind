package mastermind_v3.views.console;

import mastermind_v3.controllers.StartController;
import mastermind_v3.views.MessageView;
import mastermind_v3.utils.WithConsoleView;

class StartView extends WithConsoleView {

    private SecretCombinationView secretCombinationView;

    void interact(StartController startController) {
        startController.start();
        this.console.writeln(MessageView.TITLE.getMessage());
        this.secretCombinationView = new SecretCombinationView(startController);
        this.secretCombinationView.writeln();
    }

}
