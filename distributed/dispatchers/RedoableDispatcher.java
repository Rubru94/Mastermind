
package mastermind_v3.distributed.dispatchers;

import mastermind_v3.controllers.implementation.InGameControllerImplementation;

public class RedoableDispatcher extends Dispatcher {

    public RedoableDispatcher(InGameControllerImplementation inGameControllerImplementation) {
        super(inGameControllerImplementation);
    }

    @Override
    public void dispatch() {
        this.tcpip.send(((InGameControllerImplementation) this.acceptController).redoable());
    }

}
