package mastermind_v4.controllers;

import mastermind_v4.models.Session;
import mastermind_v4.views.console.StartView;

public class StartController extends Controller {

    public StartController(Session session) {
        super(session);
    }

    @Override
    public void control() {
        this.session.next();
        new StartView().write(this.getWidth());
    }

}
