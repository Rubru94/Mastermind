
package mastermind_v3.controllers.implementation;

import mastermind_v3.controllers.SaveController;
import mastermind_v3.models.DAO.SessionImplementationDAO;
import mastermind_v3.models.Session;
import mastermind_v3.models.SessionImplementation;

public class SaveControllerImplementation extends SaveController {

    private SessionImplementationDAO sessionImplementationDAO;

    SaveControllerImplementation(Session session, SessionImplementationDAO sessionImplementationDAO) {
        super(session);
        this.sessionImplementationDAO = sessionImplementationDAO;
    }

    @Override
    public void save(String name) {
        this.sessionImplementationDAO.save(name);
    }

    @Override
    public void save() {
        this.sessionImplementationDAO.save();
    }

    @Override
    public void next() {
        ((SessionImplementation) this.session).next();
    }

    @Override
    public boolean hasName() {
        return ((SessionImplementation) this.session).hasName();
    }

    @Override
    public boolean exists(String name) {
        return this.sessionImplementationDAO.exists(name);
    }

}
