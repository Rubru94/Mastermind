package mastermind_v2.controllers;

import java.util.List;
import mastermind_v2.models.Color;
import mastermind_v2.models.Game;
import mastermind_v2.models.ProposedCombination;
import mastermind_v2.models.State;

public abstract class Controller {

    public Game game;

    protected State state;

    public ProposedCombination proposedCombination;

    Controller(Game game, State state, ProposedCombination proposedCombination) {
        this.game = game;
        this.state = state;
        this.proposedCombination = proposedCombination;
    }

    public int getAttemps() {
        return this.game.getAttemps();
    }
    
    public List<Color> getColors() {
        return this.proposedCombination.getColors();
    }

    public abstract void accept(ControllerVisitor controllerVisitor);
}
