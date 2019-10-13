package mastermind_v3.controllers;

import mastermind_v3.models.Session;

public abstract class StartController extends AcceptController {

    public StartController(Session session) {
        super(session);
    }

    public abstract void start();

    public abstract void start(String title);

    public abstract String[] getGamesNames();

    @Override
    public void accept(ControllersVisitor controllersVisitor) {
        controllersVisitor.visit(this);
    }

}
