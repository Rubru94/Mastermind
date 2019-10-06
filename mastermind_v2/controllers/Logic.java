package mastermind_v2.controllers;

import java.util.HashMap;
import java.util.Map;
import mastermind_v2.models.Game;
import mastermind_v2.models.ProposedCombination;
import mastermind_v2.models.State;
import mastermind_v2.models.StateValue;

public class Logic {

    private final State state;

    private Game game;
    
    private ProposedCombination proposedCombination;

    private Map<StateValue, Controller> controllers;

    public Logic() {
        this.state = new State();
        this.game = new Game();
        this.proposedCombination = new ProposedCombination();
        this.controllers = new HashMap<>();
        this.controllers.put(StateValue.INITIAL, new StartController(this.game, this.state, this.proposedCombination));
        this.controllers.put(StateValue.IN_GAME, new ProposedCombinationController(this.game, this.state, this.proposedCombination));
        this.controllers.put(StateValue.FINAL, new ResumeController(this.game, this.state, this.proposedCombination));
        this.controllers.put(StateValue.EXIT, null);
    }

    public Controller getController() {
        return this.controllers.get(this.state.getValueState());
    }
}
