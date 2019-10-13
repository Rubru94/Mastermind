package mastermind_v3.views.console;

import mastermind_v3.controllers.InGameController;
import mastermind_v3.views.MessageView;

public class GameView {

    private final InGameController inGameController;

    public GameView(InGameController inGameController) {
        this.inGameController = inGameController;
    }

    public void writeln() {
        MessageView.NEW_LINE.writeln();
        new AttemptsView(inGameController).writeln();
        new SecretCombinationView(inGameController).writeln();
        for (int i = 0; i < inGameController.getAttempts(); i++) {
            new ProposedCombinationView(inGameController).write(i);
            new ResultView(inGameController).writeln(i);
        }
        if (inGameController.isWinner()) {
            MessageView.WINNER.writeln();
        } else if (inGameController.isLooser()) {
            MessageView.LOOSER.writeln();
        }
    }
}
