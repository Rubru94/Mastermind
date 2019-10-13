package mastermind_v3.distributed.dispatchers;

import mastermind_v3.controllers.implementation.SaveControllerImplementation;

public class SaveDispatcher extends Dispatcher {

    public SaveDispatcher(SaveControllerImplementation saveControllerImplementation) {
        super(saveControllerImplementation);
    }

    @Override
    public void dispatch() {
        String name = this.tcpip.receiveLine();
        ((SaveControllerImplementation) this.acceptController).save(name);
    }

}
