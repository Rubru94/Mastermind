package mastermind_v3.controllers;

import java.util.HashMap;
import java.util.Map;

import mastermind_v3.models.Session;
import mastermind_v3.models.StateValue;

public class Logic {

    public Session session;

    public Map<StateValue, AcceptController> acceptControllers;

    public Logic() {
        this.acceptControllers = new HashMap<StateValue, AcceptController>();
    }

    public AcceptController getController() {
        return this.acceptControllers.get(this.session.getValueState());
    }

}
