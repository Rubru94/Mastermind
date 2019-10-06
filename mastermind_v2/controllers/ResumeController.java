package mastermind_v2.controllers;

import mastermind_v2.models.Game;
import mastermind_v2.models.ProposedCombination;
import mastermind_v2.models.State;

public class ResumeController extends Controller {

    public ResumeController(Game game, State state, ProposedCombination proposedCombination) {
        super(game, state, proposedCombination);
    }

    public void resume(boolean newGame) {
        if (newGame) {
            this.game.clear();
            this.state.reset();
        } else {
            this.state.next();
        }
    }

    @Override
    public void accept(ControllerVisitor controllerVisitor) {
        controllerVisitor.visit(this);
    }
}
