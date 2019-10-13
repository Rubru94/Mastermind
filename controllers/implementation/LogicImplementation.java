package mastermind_v3.controllers.implementation;

import mastermind_v3.controllers.Logic;
import mastermind_v3.models.DAO.SessionImplementationDAO;
import mastermind_v3.models.SessionImplementation;
import mastermind_v3.models.StateValue;

public class LogicImplementation extends Logic {

    protected SessionImplementationDAO sessionImplementationDAO;

    protected StartControllerImplementation startControllerImplementation;

    protected InGameControllerImplementation inGameControllerImplementation;

    protected ResumeControllerImplementation resumeControllerImplementation;

    protected SaveControllerImplementation saveControllerImplementation;

    public LogicImplementation(SessionImplementationDAO sessionImplementationDAO) {
        this.session = new SessionImplementation();
        this.sessionImplementationDAO = sessionImplementationDAO;
        this.sessionImplementationDAO.associate((SessionImplementation) this.session);
        this.startControllerImplementation = new StartControllerImplementation(this.session,this.sessionImplementationDAO);
        this.inGameControllerImplementation = new InGameControllerImplementation(this.session);
        this.saveControllerImplementation = new SaveControllerImplementation(this.session,this.sessionImplementationDAO);
        this.resumeControllerImplementation = new ResumeControllerImplementation(this.session);
        this.acceptControllers.put(StateValue.INITIAL, this.startControllerImplementation);
        this.acceptControllers.put(StateValue.IN_GAME, this.inGameControllerImplementation);
        this.acceptControllers.put(StateValue.SAVING, this.saveControllerImplementation);
        this.acceptControllers.put(StateValue.FINAL, this.resumeControllerImplementation);
        this.acceptControllers.put(StateValue.EXIT, null);
    }

}
