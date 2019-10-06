package mastermind_v2.views;

import mastermind_v2.controllers.Controller;
import mastermind_v2.controllers.ControllerVisitor;

public abstract class View implements ControllerVisitor {

    public abstract void interact(Controller controller);

}
