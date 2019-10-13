package mastermind_v3.controllers;

import mastermind_v3.models.Session;
import mastermind_v3.models.StateValue;

public abstract class Controller {

    protected Session session;

    Controller(Session session) {
        this.session = session;
    }

    public int getWidth() {
        return this.session.getWidth();
    }
    
    public StateValue getValueState() {
        return this.session.getValueState();
    }
    
    public String getName() {
        return this.session.getName();
    }
    
     public void setName(String name) {
        this.session.setName(name);
    }

}
