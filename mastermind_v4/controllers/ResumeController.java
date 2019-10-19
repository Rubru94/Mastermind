package mastermind_v4.controllers;

import mastermind_v4.models.Session;
import mastermind_v4.views.console.ResumeView;

public class ResumeController extends Controller {

    public ResumeController(Session session) {
        super(session);
    }

    private void resume(boolean newGame) {
        if (newGame) {
            this.session.clearGame();
        } else {
            this.session.next();
        }
    }

    @Override
    public void control() {
        this.resume(new ResumeView().write());
    }

}
