package mastermind_v3.controllers.implementation;

import mastermind_v3.controllers.StartController;
import mastermind_v3.models.DAO.SessionImplementationDAO;
import mastermind_v3.models.Session;
import mastermind_v3.models.SessionImplementation;

public class StartControllerImplementation extends StartController {

    private SessionImplementationDAO sessionImplementationDAO;

    public StartControllerImplementation(Session session, SessionImplementationDAO sessionImplementationDAO) {
        super(session);
        this.sessionImplementationDAO = sessionImplementationDAO;
    }

    @Override
    public void start() {
        ((SessionImplementation) this.session).clearGame();
        ((SessionImplementation) this.session).registry();
        this.sessionImplementationDAO.associate((SessionImplementation) this.session);
        ((SessionImplementation) this.session).next();
    }

    @Override
    public void start(String name) {
        this.sessionImplementationDAO.load(name);
    }

    @Override
    public String[] getGamesNames() {
        return this.sessionImplementationDAO.getGamesNames();
    }

}
