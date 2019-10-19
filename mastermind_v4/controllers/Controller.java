package mastermind_v4.controllers;

import mastermind_v4.models.Session;

public abstract class Controller {

    Session session;

    Controller(Session session) {
        this.session = session;
    }

    int getWidth() {
        return this.session.getWidth();
    }

    public abstract void control();

}
