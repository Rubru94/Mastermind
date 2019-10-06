package mastermind_v2.views.console;

import mastermind_v2.controllers.Controller;
import mastermind_v2.controllers.ProposedCombinationController;
import mastermind_v2.controllers.ResumeController;
import mastermind_v2.controllers.StartController;
import mastermind_v2.utils.YesNoDialog;
import mastermind_v2.views.View;

public class ConsoleView extends View {

    @Override
    public void interact(Controller controller) {
        controller.accept(this);
    }

    @Override
    public void visit(StartController startController) {
        startController.start();
        new GameView(startController).play();
    }

    @Override
    public void visit(ProposedCombinationController proposeCombinationController) {
        new GameView(proposeCombinationController).play();
    }

    @Override
    public void visit(ResumeController resumeController) {
        resumeController.resume(new YesNoDialog().read());
    }
}
