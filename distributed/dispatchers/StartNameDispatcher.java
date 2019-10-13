package mastermind_v3.distributed.dispatchers;

import mastermind_v3.controllers.implementation.StartControllerImplementation;

public class StartNameDispatcher extends Dispatcher {

    public StartNameDispatcher(StartControllerImplementation startControllerImplementation) {
        super(startControllerImplementation);
    }

    @Override
    public void dispatch() {
        String title = this.tcpip.receiveLine();
        ((StartControllerImplementation) this.acceptController).start(title);
    }

}
