package mastermind_v3.distributed.dispatchers;

import mastermind_v3.controllers.implementation.InGameControllerImplementation;

public class AttemptsDispatcher extends Dispatcher {

    public AttemptsDispatcher(InGameControllerImplementation inGameControllerImplementation) {
        super(inGameControllerImplementation);
    }

    @Override
    public void dispatch() {
        this.tcpip.send(((InGameControllerImplementation) this.acceptController).getAttempts());
    }

}
