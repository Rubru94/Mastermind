package mastermind_v3.distributed.dispatchers;

import mastermind_v3.controllers.implementation.StartControllerImplementation;

public class StartDispatcher extends Dispatcher {

    public StartDispatcher(StartControllerImplementation startControllerImplementation) {
        super(startControllerImplementation);
    }

    @Override
    public void dispatch() {
        ((StartControllerImplementation) this.acceptController).start();
    }

}
