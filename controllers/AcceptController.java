package mastermind_v3.controllers;

import mastermind_v3.models.Session;

public abstract class AcceptController extends Controller {

    AcceptController(Session session) {
        super(session);
    }

    public abstract void accept(ControllersVisitor controllersVisitor);

}
