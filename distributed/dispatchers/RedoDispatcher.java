package mastermind_v3.distributed.dispatchers;

import mastermind_v3.controllers.implementation.InGameControllerImplementation;

public class RedoDispatcher extends Dispatcher {

    public RedoDispatcher(InGameControllerImplementation inGameControllerImplementation) {
        super(inGameControllerImplementation);
    }

    @Override
    public void dispatch() {
        ((InGameControllerImplementation) this.acceptController).redo();
    }

}
