package mastermind_v3.controllers;

import mastermind_v3.models.Session;
import mastermind_v3.models.SessionImplementation;

public class ExitController extends Controller {

    public ExitController(Session session) {
        super(session);
    }

    public void next() {
        ((SessionImplementation) this.session).next();
    }

}
