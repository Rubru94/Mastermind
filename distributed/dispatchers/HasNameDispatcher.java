package mastermind_v3.distributed.dispatchers;

import mastermind_v3.controllers.implementation.SaveControllerImplementation;

public class HasNameDispatcher extends Dispatcher {

    public HasNameDispatcher(SaveControllerImplementation saveControllerImplementation) {
        super(saveControllerImplementation);
    }

    @Override
    public void dispatch() {
        this.tcpip.send(((SaveControllerImplementation) this.acceptController).hasName());
    }

}
