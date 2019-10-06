package mastermind_v2.controllers;

import mastermind_v2.models.Game;
import mastermind_v2.models.ProposedCombination;
import mastermind_v2.models.State;

public class StartController extends Controller {

    public StartController(Game game, State state, ProposedCombination proposedCombination) {
        super(game, state, proposedCombination);
    }

    public void start() {
        this.state.next();
    }

    @Override
    public void accept(ControllerVisitor controllerVisitor) {
        controllerVisitor.visit(this);
    }
}
