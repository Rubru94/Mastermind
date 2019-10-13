package mastermind_v3.distributed.dispatchers;

import mastermind_v3.controllers.implementation.InGameControllerImplementation;

public class WidthDispatcher extends Dispatcher {

    public WidthDispatcher(InGameControllerImplementation inGameControllerImplementation) {
        super(inGameControllerImplementation);
    }

    @Override
    public void dispatch() {
        this.tcpip.send(this.acceptController.getWidth());
    }

}
