
package mastermind_v3.controllers.implementation;

import mastermind_v3.controllers.ResumeController;
import mastermind_v3.models.Session;
import mastermind_v3.models.SessionImplementation;

public class ResumeControllerImplementation extends ResumeController {

    ResumeControllerImplementation(Session session) {
        super(session);
    }

    @Override
    public void resume(boolean newGame) {
        if (newGame) {
            ((SessionImplementation) this.session).clearGame();
        } else {
            ((SessionImplementation) this.session).next();
        }
    }

}
