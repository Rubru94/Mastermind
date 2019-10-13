package mastermind_v3.distributed.dispatchers;

import mastermind_v3.controllers.implementation.SaveControllerImplementation;

public class ExistsDispatcher extends Dispatcher {

    public ExistsDispatcher(SaveControllerImplementation saveControllerImplementation) {
        super(saveControllerImplementation);
    }

    @Override
    public void dispatch() {
        String name = this.tcpip.receiveLine();
        this.tcpip.send(((SaveControllerImplementation) this.acceptController).exists(name));
    }

}
