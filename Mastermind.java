package mastermind_v3;

import mastermind_v3.controllers.AcceptController;
import mastermind_v3.controllers.Logic;
import mastermind_v3.views.View;

public abstract class Mastermind {

    private Logic logic;

    private View view;

    protected Mastermind() {
        this.logic = this.createLogic();
        this.view = this.createView();
    }

    protected abstract Logic createLogic();
    protected abstract View createView();

    protected void play() {
        AcceptController acceptController;
        do {
            acceptController = this.logic.getController();
            if (acceptController != null) {
                this.view.interact(acceptController);
            }
        } while (acceptController != null);
    }

}
