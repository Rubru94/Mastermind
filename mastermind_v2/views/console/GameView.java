package mastermind_v2.views.console;

import mastermind_v2.controllers.Controller;
import mastermind_v2.utils.IO;

public class GameView {

    private Controller controller;

    public GameView(Controller controller) {
        this.controller = controller;
    }

    private void writeln() {
        IO.writeln();
        Message.ATTEMPTS.writeln(this.controller.getAttemps());
        new SecretCombinationView(this.controller).writeln();
        for (int i = 0; i < this.controller.getAttemps(); i++) {
            this.controller.game.proposedCombinations.get(i).write();
            this.controller.game.results.get(i).writeln();
        }
    }

    public void play() {
        IO.writeln();
        Message.TITLE.writeln();
        new SecretCombinationView(this.controller).writeln();
        do {
            do {
                new ProposedCombinationView(this.controller).read();
                this.controller.game.proposedCombinations.add(this.controller.proposedCombination);
                this.controller.game.results.add(this.controller.game.secretCombination.getResult(this.controller.proposedCombination));
                this.writeln();
            } while (!this.controller.game.isFinished());
            Message.TITLE.writeln();
        } while (this.controller.game.isResumed());
        Message.NEW_LINE.write();
    }
}
