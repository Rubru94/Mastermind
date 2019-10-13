package mastermind_v3.views.console;

import mastermind_v3.controllers.InGameController;
import mastermind_v3.views.MessageView;
import mastermind_v3.utils.WithConsoleView;

class ResultView extends WithConsoleView {

    private InGameController inGameController;

    ResultView(InGameController inGameController) {
        this.inGameController = inGameController;
    }

    void writeln(int i) {
        this.console.writeln(MessageView.RESULT.getMessage()
                .replaceFirst("#blacks", "" + this.inGameController.getBlacks(i))
                .replaceFirst("#whites", "" + this.inGameController.getWhites(i)));
    }

}
