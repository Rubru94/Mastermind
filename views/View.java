package mastermind_v3.views;

import mastermind_v3.controllers.AcceptController;
import mastermind_v3.controllers.ControllersVisitor;


public abstract class View implements ControllersVisitor {

    public void interact(AcceptController acceptController) {
        acceptController.accept(this);
    }

}
