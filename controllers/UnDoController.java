package mastermind_v3.controllers;

import mastermind_v3.models.Session;
import mastermind_v3.models.SessionImplementation;

public class UnDoController extends Controller {

    public UnDoController(Session session) {
        super(session);
    }

    public void undo() {
        ((SessionImplementation) this.session).undo();
    }

    public boolean undoable() {
        return ((SessionImplementation) this.session).undoable();
    }

}
