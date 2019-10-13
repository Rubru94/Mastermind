package mastermind_v3.controllers;

import mastermind_v3.models.Session;
import mastermind_v3.models.SessionImplementation;

public class ReDoController extends Controller {

    public ReDoController(Session session) {
        super(session);
    }

    public void redo() {
        ((SessionImplementation) this.session).redo();
    }

    public boolean redoable() {
        return ((SessionImplementation) this.session).redoable();
    }

}
