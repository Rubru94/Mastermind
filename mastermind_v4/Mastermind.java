package mastermind_v4;

import java.util.HashMap;
import java.util.Map;
import mastermind_v4.controllers.*;
import mastermind_v4.models.Session;
import mastermind_v4.models.StateValue;

public class Mastermind {

    private Session session;

    private Map<StateValue, Controller> controllers;

    Mastermind() {
        this.session = new Session();
        this.controllers = new HashMap<StateValue, Controller>();
        this.controllers.put(StateValue.INITIAL, new StartController(this.session));
        this.controllers.put(StateValue.IN_GAME, new ProposalController(this.session));
        this.controllers.put(StateValue.FINAL, new ResumeController(this.session));
        this.controllers.put(StateValue.EXIT, null);
    }

    void play() {
        Controller controller;
        do {
            controller = this.controllers.get(this.session.getValueState());
            if (controller != null) {
                controller.control();
            }
        } while (controller != null);
    }

    public static void main(String[] args) {
        new Mastermind().play();
    }

}
