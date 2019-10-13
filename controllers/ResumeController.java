package mastermind_v3.controllers;

import mastermind_v3.models.Session;

public abstract class ResumeController extends AcceptController {

    public ResumeController(Session session) {
        super(session);
    }

    public abstract void resume(boolean newGame);

    @Override
    public void accept(ControllersVisitor controllersVisitor) {
        controllersVisitor.visit(this);
    }

}
