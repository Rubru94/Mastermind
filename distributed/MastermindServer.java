package mastermind_v3.distributed;

import mastermind_v3.distributed.dispatchers.DispatcherPrototype;
import mastermind_v3.models.DAO.SessionImplementationDAO;

public class MastermindServer {

    private DispatcherPrototype dispatcherPrototype;

    private LogicImplementationServer logic;

    private MastermindServer() {
        this.dispatcherPrototype = new DispatcherPrototype();
        this.logic = new LogicImplementationServer(new SessionImplementationDAO());
        this.logic.createDispatchers(this.dispatcherPrototype);
    }

    private void serve() {
        this.dispatcherPrototype.serve();
    }

    public static void main(String[] args) {
        new MastermindServer().serve();
    }

}
